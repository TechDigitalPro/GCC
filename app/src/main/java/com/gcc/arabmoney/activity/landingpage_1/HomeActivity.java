package com.gcc.arabmoney.activity.landingpage_1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.gcc.arabmoney.R;
import com.gcc.arabmoney.activity.Images;
import com.gcc.arabmoney.activity.Strings;
import com.gcc.arabmoney.activity.WebViewActivity;
import com.gcc.arabmoney.base.BaseActivity;
import com.gcc.arabmoney.databinding.ActivityHomeBinding;
import com.gcc.arabmoney.dialog.DialogMessage;
import com.gcc.arabmoney.server.Server;
import com.gcc.arabmoney.service.AccountCounterService;
import com.gcc.arabmoney.utils.CountryOption;
import com.gcc.arabmoney.utils.DialogHelper;
import com.gcc.arabmoney.utils.StringHelper;
import com.gcc.arabmoney.utils.Utils;
import com.google.firebase.analytics.FirebaseAnalytics;

import org.apache.commons.validator.routines.EmailValidator;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class HomeActivity extends BaseActivity {
    ActivityHomeBinding bind;
    List<Question> question_list;
    int current_question_pos = 0;
    JSONArray answer_array;
    String question_str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(bind.getRoot());

        initView();
    }

    private void initView() {
        bind.sliderText1.setSelected(true);
        bind.menu.setOnClickListener(this);
        bind.menuArea.home.setOnClickListener(this);
        bind.menuArea.about.setOnClickListener(this);
        bind.menuArea.contact.setOnClickListener(this);
        bind.menuArea.terms.setOnClickListener(this);
        bind.menuArea.privacy.setOnClickListener(this);
        bind.menuArea.rate.setOnClickListener(this);

        bind.commentBtn.setOnClickListener(this);

        bind.registerView.registerBtn.setOnClickListener(this);

        bind.thanksView.contactBtn.setOnClickListener(this);
        bind.contactView.sendBtn.setOnClickListener(this);
        bind.aboutView.contactBtn.setOnClickListener(this);
        if(Utils.COUNTRY == CountryOption.Bahrain3 || Utils.COUNTRY == CountryOption.Bahrain31 ||
            Utils.COUNTRY == CountryOption.Oman4 || Utils.COUNTRY == CountryOption.Oman41 ||
            Utils.COUNTRY == CountryOption.Libya4 || Utils.COUNTRY == CountryOption.Libya41 ||
            Utils.COUNTRY == CountryOption.Iraq4 || Utils.COUNTRY == CountryOption.Iraq41 ||
            Utils.COUNTRY == CountryOption.Saudi3 || Utils.COUNTRY == CountryOption.Saudi31 ||
            Utils.COUNTRY == CountryOption.Kuwait3 || Utils.COUNTRY == CountryOption.Kuwait31 ||
            Utils.COUNTRY == CountryOption.Uae3 || Utils.COUNTRY == CountryOption.Uae31 ||
            Utils.COUNTRY == CountryOption.Qatar3 || Utils.COUNTRY == CountryOption.Qatar31) {
            bind.headerArea1.setVisibility(View.GONE);
            bind.headerArea2.setVisibility(View.VISIBLE);
        } else {
            bind.headerArea1.setVisibility(View.VISIBLE);
            bind.headerArea2.setVisibility(View.GONE);
        }
        setViewText();
        setImages();
        buildQuestion();
        setQuestion(current_question_pos);
        buildComments();

        String region = Utils.getRegionCode(context);
        bind.registerView.phoneNumber.setRegionCode(region.toUpperCase());
        bind.contactView.contactPhoneNumber.setRegionCode(region.toUpperCase());

        bind.accountNumber.setText(StringHelper.convertNumberToString(Utils.account_num));
        startService(new Intent(this, AccountCounterService.class));
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            registerReceiver(c_service, new IntentFilter(AccountCounterService.COUNTDOWN_BR), RECEIVER_EXPORTED);
        } else {
            registerReceiver(c_service, new IntentFilter(AccountCounterService.COUNTDOWN_BR));
        }
        if (sessionManager.getDisableRegister()) {
            DialogMessage dlg = new DialogMessage();
            dlg.show(getSupportFragmentManager(), DialogMessage.class.getName());
        }
        checkNotificationPermission();
    }

    private void setViewText() {
        Strings.setSliderText1(context, bind.sliderText1);
        Strings.setSliderText2(context, bind.sliderText2);
        Strings.setMainText1(context, bind.text1);
        Strings.setMainText2(context, bind.text2);
        Strings.setAccountText(context, bind.accountText);
        Strings.setQuestionBtnText(context, bind.questionBtn);
        Strings.setRegisterTitleText(context, bind.registerView.registerTitle);
        Strings.setRegisterHolder1(context, bind.registerView.fullname);
        Strings.setRegisterHolder2(context, bind.registerView.email);
        Strings.setRegisterBtnText(context, bind.registerView.registerBtnText);
        Strings.setLoadMoreText(context, bind.loadMore);
        Strings.setAboutTitleText(context, bind.aboutView.aboutUsTitle);
        Strings.setAboutUsContentText(context, bind.aboutView.aboutUsContent);
        Strings.setContactText(context, bind.aboutView.contactText);
        Strings.setContactText(context, bind.contactView.contactTitle);
        Strings.setRegisterHolder1(context, bind.contactView.fullname);
        Strings.setRegisterHolder2(context, bind.contactView.email);
        Strings.setMessageHint(context, bind.contactView.message);
        Strings.setSendText(context, bind.contactView.sent);
        Strings.setThankTitle(context, bind.thanksView.thankTitle);
        Strings.setThankText1(context, bind.thanksView.thankText1);
        Strings.setThankText2(context, bind.thanksView.thankText2);
        Strings.setThankText3(context, bind.thanksView.thankText3);
        Strings.setHomeText(context, bind.menuArea.homeMenuText);
        Strings.setAboutTitleText(context, bind.menuArea.aboutMenuText);
        Strings.setContactText(context, bind.menuArea.contactMenuText);
        Strings.setPrivacyPolicyText(context, bind.menuArea.privacyPolicyMenu);
        Strings.setTermsConditionMenu(context, bind.menuArea.termsConditionMenu);
        Strings.setRateText(context, bind.menuArea.rateMenuText);
    }

    private void setImages() {
        Images.loadWhiteLogo(bind.whiteLogo);
        Images.loadHeaderBackgroundImage(bind.headerBackground);
        Images.loadBlackLogo(bind.menuArea.blackLogo);
        Images.loadAllFlagLogo(bind.questionView.allFlagLogo);
        Images.loadAllFlagLogo(bind.registerView.allFlagLogo);
        Images.loadAllFlagLogo(bind.aboutView.allFlagLogo);
        Images.loadAllFlagLogo(bind.contactView.allFlagLogo);
        Images.loadAllFlagLogo(bind.thanksView.allFlagLogo);
        Images.loadGrayFlag(bind.registerView.grayFlagLogo);
    }

    private final BroadcastReceiver c_service = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            if (intent.getExtras() != null) {
                int customer_num = intent.getIntExtra("account_num", 0);
                bind.accountNumber.setText(StringHelper.convertNumberToString(customer_num));
            }
        }
    };

    @Override
    protected void onDestroy() {
        unregisterReceiver(c_service);
        super.onDestroy();
    }

    @Override
    public void onClick(View view) {
        if (view == bind.menu) {
            openMenu();
        } else if (view == bind.menuArea.home) {
            closeMenu();
            showView(1);
        } else if (view == bind.menuArea.about) {
            closeMenu();
            showView(6);
        } else if (view == bind.menuArea.contact) {
            closeMenu();
            showView(4);
        } else if (view == bind.menuArea.terms) {
            closeMenu();
            //showView(2);
            Intent intent = new Intent(context, WebViewActivity.class);
            intent.putExtra("url", "https://arabmoney.today/terms.php");
            intent.putExtra("title", Strings.getTermsConditionText(context));
            startActivity(intent);
        } else if (view == bind.menuArea.privacy) {
            closeMenu();
            //showView(3);
            Intent intent = new Intent(context, WebViewActivity.class);
            intent.putExtra("url", "https://arabmoney.today/privacy.php");
            intent.putExtra("title", Strings.getPrivacyPolicyText(context));
            startActivity(intent);
        } else if (view == bind.menuArea.rate) {
            try {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + getPackageName())));
            } catch (Exception e) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + getPackageName())));
            }
        } else if (view == bind.aboutView.contactBtn) {
            showView(4);
        } else if (view == bind.thanksView.contactBtn) {
            showView(4);
        } else if (view == bind.contactView.sendBtn) {
            contact();
        } else if (view == bind.commentBtn) {
            if (bind.commentArea.getVisibility() == View.GONE) {
                //AnimationHelper.expandUp(bind.commentArea);
                bind.commentArea.setVisibility(View.VISIBLE);
                bind.commentDropdown.setImageResource(R.drawable.arrow_up);
                //bind.homeScroll.scrollTo(0, bind.homeScroll.getBottom());
//                bind.homeScroll.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
//                    @Override
//                    public void onGlobalLayout() {
//                        bind.homeScroll.post(new Runnable() {
//                            public void run() {
//                                bind.homeScroll.fullScroll(View.FOCUS_DOWN);
//                            }
//                        });
//                    }
//                });
            } else {
                //AnimationHelper.collapseDown(bind.commentArea);
                bind.commentArea.setVisibility(View.GONE);
                bind.commentDropdown.setImageResource(R.drawable.arrow_down);
            }
        } else if (view == bind.registerView.registerBtn) {
            registerCRM();
        }
    }

    private void buildComments() {
        List<CommentModel> comment_list = new ArrayList<>();
        CommentModel comment_1 = new CommentModel(getString(R.string.user_1), R.drawable.user_1,
                Strings.getComment1(context)
                , 127);
        ChildCommentModel child_comment_1 = new ChildCommentModel(getString(R.string.user_2), R.drawable.user_2,
                Strings.getComment2(context), 35);

        List<ChildCommentModel> child_list_1 = new ArrayList<>();
        child_list_1.add(child_comment_1);
        comment_1.setChildComments(child_list_1);

        CommentModel comment_2 = new CommentModel(getString(R.string.user_3), R.drawable.user_3, Strings.getComment3(context)
                , 76);
        ChildCommentModel child_comment_3 = new ChildCommentModel(getString(R.string.user_4), R.drawable.user_4,
                Strings.getComment4(context)
                , 15);
        ChildCommentModel child_comment_4 = new ChildCommentModel(getString(R.string.user_5), R.drawable.user_5,
                Strings.getComment5(context)
                , 45);

        List<ChildCommentModel> child_list_2 = new ArrayList<>();
        child_list_2.add(child_comment_3);
        child_list_2.add(child_comment_4);
        comment_2.setChildComments(child_list_2);

        CommentModel comment_3 = new CommentModel(getString(R.string.user_6), R.drawable.user_6,
                Strings.getComment6(context)
                , 98);

        CommentModel comment_4 = new CommentModel(getString(R.string.user_7), R.drawable.user_7,
                Strings.getComment7(context)
                , 24);

        comment_list.add(comment_1);
        comment_list.add(comment_2);
        comment_list.add(comment_3);
        comment_list.add(comment_4);

        bind.commentList.setLayoutManager(new LinearLayoutManager(context));
        bind.commentList.setNestedScrollingEnabled(false);
        CommentAdapter adapter = new CommentAdapter(context, comment_list);
        bind.commentList.setAdapter(adapter);
    }

    private void showView(int opt) {
        bind.homeArea.setVisibility(View.GONE);
        bind.contactArea.setVisibility(View.GONE);
        bind.thanksArea.setVisibility(View.GONE);
        bind.aboutArea.setVisibility(View.GONE);
        if (opt == 1) {
            bind.homeArea.setVisibility(View.VISIBLE);
        } else if (opt == 4) {
            bind.contactArea.setVisibility(View.VISIBLE);
        } else if (opt == 5) {
            bind.thanksArea.setVisibility(View.VISIBLE);
        } else if (opt == 6) {
            bind.aboutArea.setVisibility(View.VISIBLE);
        }
    }

    private void openMenu() {
        if (!bind.drawer.isDrawerOpen(GravityCompat.END)) {
            bind.drawer.openDrawer(GravityCompat.END);
        }
    }

    private void closeMenu() {
        if (bind.drawer.isDrawerOpen(GravityCompat.END)) {
            bind.drawer.closeDrawer(GravityCompat.END);
        }
    }

    //question===
    public void setQuestion(String question) {
        //this.question_str = question;
    }

    private void buildQuestion() {
        answer_array = new JSONArray();
        question_list = Strings.getQuestionList(context);
    }

    private void setQuestion(int index) {
        if (index >= question_list.size() || question_list.get(index).getAnswerList() == null || question_list.get(index).getAnswerList().isEmpty()) {
            return;
        }
        bind.questionBtn.setText(Strings.getQuestionBtnText2(context) + " " + (index + 1) + " " + Strings.getQuestionBtnText1(context));
        bind.questionView.questionTitle.setText(question_list.get(index).getQuestion());
        bind.questionView.answerList.removeAllViews();

        LayoutInflater inflater = getLayoutInflater();
        for (int pos = 0; pos < question_list.get(index).getAnswerList().size(); pos++) {
            final int finalPos = pos;
            final Answer answer = question_list.get(index).getAnswerList().get(pos);
            View answer_item_view = inflater.inflate(R.layout.layout_answer_item, null);
            LinearLayout answer_btn = answer_item_view.findViewById(R.id.answer_btn);
            TextView answer_text = answer_item_view.findViewById(R.id.answer_text);
            answer_text.setText(answer.getAnswer());
            answer_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(answer.isBold()) {
                        sessionManager.setDisableRegister(true);
                    }
                    getNextQuestion(finalPos);
                }
            });
            bind.questionView.answerList.addView(answer_item_view);
        }
    }

    private void getNextQuestion(int answer_index) {
        if (current_question_pos >= question_list.size()) {
            goToRegister();
            return;
        }
        //save question
        Answer answer = question_list.get(current_question_pos).getAnswerList().get(answer_index);
        try{
            if(answer_array == null){
                answer_array = new JSONArray();
            }
            JSONObject answer_obj = new JSONObject();
            answer_obj.put("q", question_list.get(current_question_pos).getQuestion());
            answer_obj.put("a", answer.getAnswer());
            answer_array.put(answer_obj);
        }catch (Exception e){
            e.printStackTrace();
        }
        current_question_pos++;
        if (current_question_pos >= question_list.size()) {
            goToRegister();
            return;
        }
        setQuestion(current_question_pos);
    }

    private void goToRegister() {
        //setQuestion(answer_array.toString());
        if (!sessionManager.getDisableRegister()) {
            //load register view
            bind.questionArea.setVisibility(View.GONE);
            bind.registerArea.setVisibility(View.VISIBLE);
        } else {
            DialogMessage dlg = new DialogMessage();
            dlg.show(getSupportFragmentManager(), DialogMessage.class.getName());
        }
    }

    private void registerCRM() {
        try {
            if (!Server.isNetworkAvailable(this)) {
                showMessage(getString(R.string.no_internet));
                return;
            }
            final String username = bind.registerView.fullname.getText().toString().trim();
            String email = bind.registerView.email.getText().toString().trim();
            String phone = bind.registerView.phoneNumber.getText().toString().trim();
            //String phone = "2312341234";
            if (username.isEmpty()) {
                bind.registerView.fullname.setError(getString(R.string.enter_name));
                return;
            }
            if (email.isEmpty()) {
                bind.registerView.email.setError(getString(R.string.enter_email));
                return;
            }
            if (phone.isEmpty()) {
                bind.registerView.phoneNumber.setError(getString(R.string.enter_phone));
                return;
            }

            if (!EmailValidator.getInstance().isValid(email)) {
                bind.registerView.email.setError(getString(R.string.invalid_email));
                return;
            }

            String answer_str = "";
            if(answer_array != null && answer_array.length() > 0) {
                for(int k = 0; k < answer_array.length(); k++) {
                    JSONObject q_obj = answer_array.getJSONObject(k);
                    answer_str += q_obj.getString("q") + System.lineSeparator();
                    answer_str += q_obj.getString("a") + System.lineSeparator();
                }
            }

            String first_name = "";
            String last_name = "";
            try {
                String[] splits = username.split("\\s+");
                if (splits.length < 2) {
                    first_name = username;
                    last_name = username;
                } else {
                    first_name = splits[0];
                    last_name = splits[1];
                }
            } catch (Exception e) {
                first_name = username;
                last_name = username;
            }

            dialogHelper.showProgressDialog(getString(R.string.please_wait));

            Random rand = new Random();
            String password = (rand.nextInt(9) + 1) + "iKh9pVw6Af" + (rand.nextInt(9) + 1);

            JSONObject params = new JSONObject();
            params.put("ai", Utils.campain.getAi());
            params.put("ci", "1");
            params.put("gi", Utils.campain.getGi());
            params.put("userip", Server.getIPAddr(true));
            //params.put("userip", "0.0.0.0");
            params.put("firstname", first_name);
            params.put("lastname", last_name);
            params.put("email", email);
            params.put("phone_number", phone);
            params.put("password", password);
            params.put("phone", StringHelper.convertNumberToString(Utils.getPhoneNationalNumber(context, phone)));
            params.put("prefix", StringHelper.convertNumberToString(Utils.getPhoneCountryCode(context, phone)));
            params.put("sub", "");
            params.put("mpc_1", Utils.campain.getId());
            params.put("mpc_2", Utils.campain.getName());
            params.put("mpc_3", "");
            params.put("mpc_4", "");
            params.put("mpc_5", "");
            params.put("mpc_6", answer_str);
            params.put("mpc_7", "");
            params.put("mpc_8", "NAP");
            params.put("mpc_9", Utils.campain.getLandingPage().getId());
            params.put("mpc_10", Utils.campain.getLandingPage().getName());
            params.put("so", Utils.campain.getLandingPage().getShortName());
            params.put("country", Utils.campain.getCountry());

            MediaType JSON = MediaType.parse("application/json; charset=utf-8");
            RequestBody body = RequestBody.create(params.toString(), JSON);

            Request request = new Request.Builder()
                    .url(Server.URL + "api_register_crm")
                    .post(body)
                    .build();

            OkHttpClient client = new OkHttpClient.Builder()
                    .connectTimeout(120, TimeUnit.SECONDS)
                    .writeTimeout(300, TimeUnit.SECONDS)
                    .readTimeout(300, TimeUnit.SECONDS)
                    .build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(@NonNull Call call, @NonNull IOException e) {
                    call.cancel();
                    runOnUiThread(() -> {
                        dialogHelper.closeDialog();
                    });
                }

                @Override
                public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                    try {
                        runOnUiThread(() -> {
                            dialogHelper.closeDialog();
                        });
                        String response_str = response.body().string();
                        if (!response_str.trim().isEmpty()) {
                            JSONObject response_obj = new JSONObject(response_str);
                            boolean status = response_obj.getBoolean("status");
                            String data = response_obj.getString("data");
                            if (status) {
                                if (!data.isEmpty() && !data.equals("Cant register lead, no more fallbacks available")) {
                                    runOnUiThread(() -> {
                                        //save landing page
                                        sessionManager.setRegistered();
                                        sessionManager.setUserName(username);
                                        sessionManager.setEmail(email);
                                        sessionManager.setPhone(phone);
                                        sessionManager.setPassword(password);

                                        try {
                                            //add Firebase analytic event
                                            Bundle bundle = new Bundle();
                                            bundle.putString("username", username);
                                            FirebaseAnalytics.getInstance(context).logEvent("Register_Success", bundle);
                                        } catch (Exception ex) {
                                            ex.printStackTrace();
                                        }

                                        if (Utils.campain.getAutoLogin() == 0) {
                                            showView(5);
                                        } else {
                                            sessionManager.setUrl(null);

                                            Intent intent = new Intent(context, WebViewActivity.class);
                                            intent.putExtra("title", "Broker");
                                            intent.putExtra("url", data);
                                            startActivity(intent);
                                            finish();
                                        }
                                    });
                                } else {
                                    runOnUiThread(() -> {
                                        DialogHelper.showNotificationDialog(context, "", data);
                                    });
                                }
                            } else {
                                if (!data.trim().isEmpty()) {
                                    runOnUiThread(() -> {
                                        DialogHelper.showNotificationDialog(context, "", data);
                                    });
                                } else {
                                    runOnUiThread(() -> {
                                        DialogHelper.showNotificationDialog(context, "", getString(R.string.fail_register));
                                    });
                                }
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        runOnUiThread(() -> {
                            dialogHelper.closeDialog();
                            DialogHelper.showNotificationDialog(context, "", getString(R.string.fail_register));
                        });
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            runOnUiThread(() -> {
                dialogHelper.closeDialog();
                DialogHelper.showNotificationDialog(context, "", getString(R.string.fail_register));
            });
        }
    }

    private void contact() {
        try {
            String username = bind.contactView.fullname.getText().toString().trim();
            String email = bind.contactView.email.getText().toString().trim();
            String phone = bind.contactView.contactPhoneNumber.getText().toString().trim();
            String message = bind.contactView.message.getText().toString().trim();

            if (username.isEmpty()) {
                bind.contactView.fullname.setError(getString(R.string.enter_name));
                return;
            }
            if (email.isEmpty()) {
                bind.contactView.email.setError(getString(R.string.enter_email));
                return;
            }
            if (phone.isEmpty()) {
                bind.contactView.contactPhoneNumber.setError(getString(R.string.enter_phone));
                return;
            }

            if (!EmailValidator.getInstance().isValid(email)) {
                bind.contactView.email.setError(getString(R.string.invalid_email));
                return;
            }
            if (message.isEmpty()) {
                bind.contactView.message.setError(getString(R.string.enter_message));
                return;
            }

            if (!Server.isNetworkAvailable(this)) {
                showMessage(getString(R.string.no_internet));
                return;
            }

            String first_name = "";
            String last_name = "";
            try {
                String[] splits = username.split("\\s+");
                if (splits.length < 2) {
                    first_name = username;
                    last_name = username;
                } else {
                    first_name = splits[0];
                    last_name = splits[1];
                }
            } catch (Exception e) {
                first_name = username;
                last_name = username;
            }

            dialogHelper.showProgressDialog(getString(R.string.please_wait));

            Random rand = new Random();

            JSONObject params = new JSONObject();
            params.put("ai", Utils.campain.getAi());
            params.put("ci", "1");
            params.put("gi", Utils.campain.getGi());
            params.put("userip", Server.getIPAddr(true));
            //params.put("userip", "0.0.0.0");
            params.put("firstname", first_name);
            params.put("lastname", last_name);
            params.put("email", email);
            params.put("phone_number", phone);
            params.put("password", (rand.nextInt(9) + 1) + "iKh9pVw6Af" + (rand.nextInt(9) + 1));
            params.put("phone", StringHelper.convertNumberToString(Utils.getPhoneNationalNumber(context, phone)));
            params.put("prefix", StringHelper.convertNumberToString(Utils.getPhoneCountryCode(context, phone)));
            params.put("sub", "");
            params.put("mpc_1", Utils.campain.getId());
            params.put("mpc_2", Utils.campain.getName());
            params.put("mpc_3", message);
            params.put("mpc_4", "");
            params.put("mpc_5", "");
            params.put("mpc_6", "");
            params.put("mpc_7", "");
            params.put("mpc_8", "NAP");
            params.put("mpc_9", Utils.campain.getLandingPage().getId());
            params.put("mpc_10", Utils.campain.getLandingPage().getName());
            params.put("so", Utils.campain.getLandingPage().getShortName());
            params.put("country", Utils.campain.getCountry());

            MediaType JSON = MediaType.parse("application/json; charset=utf-8");
            RequestBody body = RequestBody.create(params.toString(), JSON);

            Request request = new Request.Builder()
                    .url(Server.URL + "api_register_crm")
                    .post(body)
                    .build();

            OkHttpClient client = new OkHttpClient.Builder()
                    .connectTimeout(120, TimeUnit.SECONDS)
                    .writeTimeout(300, TimeUnit.SECONDS)
                    .readTimeout(300, TimeUnit.SECONDS)
                    .build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(@NonNull Call call, @NonNull IOException e) {
                    call.cancel();
                    runOnUiThread(() -> {
                        dialogHelper.closeDialog();
                    });
                }

                @Override
                public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                    try {
                        runOnUiThread(() -> {
                            dialogHelper.closeDialog();
                        });
                        String response_str = response.body().string();
                        if (!response_str.trim().isEmpty()) {
                            JSONObject response_obj = new JSONObject(response_str);
                            boolean status = response_obj.getBoolean("status");
                            String data = response_obj.getString("data");
                            if (status) {
                                if (!data.isEmpty() && !data.equals("Cant register lead, no more fallbacks available")) {
                                    runOnUiThread(() -> {
                                        showMessage(getString(R.string.submit));
                                    });
                                } else {
                                    runOnUiThread(() -> {
                                        DialogHelper.showNotificationDialog(context, "", data);
                                    });
                                }
                            } else {
                                if (!data.trim().isEmpty()) {
                                    runOnUiThread(() -> {
                                        DialogHelper.showNotificationDialog(context, "", data);
                                    });
                                } else {
                                    runOnUiThread(() -> {
                                        DialogHelper.showNotificationDialog(context, "", getString(R.string.fail_send));
                                    });
                                }
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        runOnUiThread(() -> {
                            dialogHelper.closeDialog();
                            DialogHelper.showNotificationDialog(context, "", getString(R.string.fail_send));
                        });
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            runOnUiThread(() -> {
                dialogHelper.closeDialog();
                DialogHelper.showNotificationDialog(context, "", getString(R.string.fail_send));
            });
        }
    }
}
