package com.gcc.arabmoney.activity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;

import androidx.annotation.NonNull;

import com.gcc.arabmoney.utils.CountryOption;
import com.google.gson.Gson;
import com.gcc.arabmoney.R;
import com.gcc.arabmoney.activity.landingpage_1.HomeActivity;
import com.gcc.arabmoney.base.BaseActivity;
import com.gcc.arabmoney.databinding.ActivityMainBinding;
import com.gcc.arabmoney.model.Campain;
import com.gcc.arabmoney.server.Server;
import com.gcc.arabmoney.utils.DialogHelper;
import com.gcc.arabmoney.utils.StringHelper;
import com.gcc.arabmoney.utils.Utils;

import org.json.JSONObject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class MainActivity extends BaseActivity {
    ActivityMainBinding bind;
    String from;
    String notification_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(bind.getRoot());

        initView();
    }
    private void initView() {
        from = getIntent().getStringExtra("from");
        if(from != null && from.equals("notification")) {
            notification_id = getIntent().getStringExtra("notification_id");
        }
        playVideo();
        new CountDownTimer(3000, 1000) {
            public void onTick(long millisUntilFinished) {
            }
            public void onFinish() {
                startHome();
            }
        }.start();
    }

    private void playVideo() {
        bind.loadingVideo.setZOrderOnTop(true);
        Uri uri = getVideoUri();
        if(uri == null) {
            return;
        }
        bind.loadingVideo.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });
        bind.loadingVideo.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
        {
            public void onCompletion(MediaPlayer mp)
            {

            }
        });
        bind.loadingVideo.setVideoURI(uri);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    private Uri getVideoUri() {
        try{
            String country_code = Utils.getRegionCode(context).toUpperCase();
            if(country_code.equals("OM")) {
                return Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.oman);
            } else if(country_code.equals("IQ")) {
                return Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.iraq);
            } else if(country_code.equals("SA")) {
                return Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.saudi);
            } else if(country_code.equals("LY")) {
                return Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.libya);
            } else if(country_code.equals("QA")) {
                return Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.qatar);
            } else if(country_code.equals("AE")) {
                return Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.uae);
            } else if(country_code.equals("KW")) {
                return Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.kuwait);
            } else if(country_code.equals("BH")) {
                return Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.bahrain);
            } else {
                return Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.oman);
            }
        }catch (Exception e) {
            e.printStackTrace();
            return Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.oman);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        bind.loadingVideo.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        bind.loadingVideo.pause();
    }

    private void startHome() {
        if(sessionManager.getRegistered() == 1 && sessionManager.getUrl() != null) {
            String url = sessionManager.getUrl();
            Intent intent = new Intent(context, WebViewActivity.class);
            intent.putExtra("url", url);
            intent.putExtra("title", "Broker");
            startActivity(intent);
            finish();
        } else {
            load_campaign();
        }
    }
    private void load_campaign() {
        try{
            if (!Server.isNetworkAvailable(this)) {
                showMessage(getString(R.string.no_internet));
                DialogHelper.showNotificationDialog(context, "", getString(R.string.no_internet));
                return;
            }
            JSONObject params = new JSONObject();
            params.put("country", Utils.getRegionCode(context).toUpperCase());
            params.put("os", "android");
            if(from != null && from.equals("notification")){
                params.put("notification", notification_id);
            } else {
                params.put("notification", "");
            }

            MediaType JSON = MediaType.parse("application/json; charset=utf-8");
            RequestBody body = RequestBody.create(params.toString(), JSON);
            Request request = new Request.Builder()
                    .url(Server.URL + "api_get_campaign")
                    .post(body)
                    .build();

            OkHttpClient client = new OkHttpClient.Builder()
                    .connectTimeout(60, TimeUnit.SECONDS)
                    .writeTimeout(60, TimeUnit.SECONDS)
                    .readTimeout(60, TimeUnit.SECONDS)
                    .build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(@NonNull Call call, @NonNull IOException e) {
                    call.cancel();
                    runOnUiThread(()->{
                        DialogHelper.showNotificationDialog(context, "", getString(R.string.not_campaign));
                    });
                }
                @Override
                public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                    try {
                        String response_str = response.body().string();
                        JSONObject response_obj = new JSONObject(response_str);
                        String res = response_obj.getString("res");
                        if(res.equals("success")){
                            runOnUiThread(()->{
                                try{
                                    Gson gson = new Gson();
                                    Utils.campain = gson.fromJson(response_obj.getJSONObject("campaign").toString(), Campain.class);
                                    sessionManager.setLandingPage(StringHelper.convertNumberToString(Utils.campain.getLandingPage().getId()));
                                    String key = Utils.campain.getLandingPage().getKey();
                                    if(key == null) {
                                        DialogHelper.showNotificationDialog(context, "", getString(R.string.not_campaign));
                                        return;
                                    }
                                    if(key.trim().equals("1")) {
                                        Utils.COUNTRY = CountryOption.Oman1;
                                    } else if(key.trim().equals("2")) {
                                        Utils.COUNTRY = CountryOption.Oman2;
                                    } else if(key.trim().equals("3")) {
                                        Utils.COUNTRY = CountryOption.Iraq1;
                                    } else if(key.trim().equals("4")) {
                                        Utils.COUNTRY = CountryOption.Iraq2;
                                    } else if(key.trim().equals("5")) {
                                        Utils.COUNTRY = CountryOption.Libya1;
                                    } else if(key.trim().equals("6")) {
                                        Utils.COUNTRY = CountryOption.Libya2;
                                    } else if(key.trim().equals("7")) {
                                        Utils.COUNTRY = CountryOption.Saudi1;
                                    } else if(key.trim().equals("8")) {
                                        Utils.COUNTRY = CountryOption.Saudi2;
                                    } else if(key.trim().equals("9")) {
                                        Utils.COUNTRY = CountryOption.Qatar1;
                                    } else if(key.trim().equals("10")) {
                                        Utils.COUNTRY = CountryOption.Qatar2;
                                    } else if(key.trim().equals("11")) {
                                        Utils.COUNTRY = CountryOption.Uae1;
                                    } else if(key.trim().equals("12")) {
                                        Utils.COUNTRY = CountryOption.Uae2;
                                    } else if(key.trim().equals("13")) {
                                        Utils.COUNTRY = CountryOption.Kuwait1;
                                    } else if(key.trim().equals("14")) {
                                        Utils.COUNTRY = CountryOption.Kuwait2;
                                    } else if(key.trim().equals("15")) {
                                        Utils.COUNTRY = CountryOption.Bahrain1;
                                    } else if(key.trim().equals("16")) {
                                        Utils.COUNTRY = CountryOption.Bahrain2;
                                    } else if(key.trim().equals("17")) {
                                        Utils.COUNTRY = CountryOption.Iraq3;
                                    } else if(key.trim().equals("18")) {
                                        Utils.COUNTRY = CountryOption.Libya3;
                                    } else if(key.trim().equals("19")) {
                                        Utils.COUNTRY = CountryOption.Oman3;
                                    } else if(key.trim().equals("20")) {
                                        Utils.COUNTRY = CountryOption.Oman4;
                                    } else if(key.trim().equals("21")) {
                                        Utils.COUNTRY = CountryOption.Oman41;
                                    } else if(key.trim().equals("22")) {
                                        Utils.COUNTRY = CountryOption.Bahrain3;
                                    } else if(key.trim().equals("23")) {
                                        Utils.COUNTRY = CountryOption.Bahrain31;
                                    } else if(key.trim().equals("24")) {
                                        Utils.COUNTRY = CountryOption.Libya4;
                                    } else if(key.trim().equals("25")) {
                                        Utils.COUNTRY = CountryOption.Libya41;
                                    } else if(key.trim().equals("26")) {
                                        Utils.COUNTRY = CountryOption.Iraq4;
                                    } else if(key.trim().equals("27")) {
                                        Utils.COUNTRY = CountryOption.Iraq41;
                                    } else if(key.trim().equals("28")) {
                                        Utils.COUNTRY = CountryOption.Saudi3;
                                    } else if(key.trim().equals("29")) {
                                        Utils.COUNTRY = CountryOption.Saudi31;
                                    } else if(key.trim().equals("30")) {
                                        Utils.COUNTRY = CountryOption.Kuwait3;
                                    } else if(key.trim().equals("31")) {
                                        Utils.COUNTRY = CountryOption.Kuwait31;
                                    } else if(key.trim().equals("32")) {
                                        Utils.COUNTRY = CountryOption.Uae3;
                                    } else if(key.trim().equals("33")) {
                                        Utils.COUNTRY = CountryOption.Uae31;
                                    } else if(key.trim().equals("34")) {
                                        Utils.COUNTRY = CountryOption.Qatar3;
                                    } else if(key.trim().equals("35")) {
                                        Utils.COUNTRY = CountryOption.Qatar31;
                                    } else{
                                        DialogHelper.showNotificationDialog(context, "", getString(R.string.not_campaign));
                                        return;
                                    }
                                    startIntentAsCleanMode(HomeActivity.class);
                                } catch (Exception e){
                                    e.printStackTrace();
                                    DialogHelper.showNotificationDialog(context, "", getString(R.string.not_campaign));
                                }
                            });
                        } else{
                            runOnUiThread(()->{
                                DialogHelper.showNotificationDialog(context, "", getString(R.string.not_campaign));
                            });
                        }
                    }catch (Exception e){
                        e.printStackTrace();
                        runOnUiThread(()->{
                            DialogHelper.showNotificationDialog(context, "", getString(R.string.not_campaign));
                        });
                    }
                }
            });
        }catch (Exception e){
            e.printStackTrace();
            runOnUiThread(()->{
                DialogHelper.showNotificationDialog(context, "", getString(R.string.not_campaign));
            });
        }
    }
}
