package com.gcc.arabmoney.base;

import android.Manifest;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Toast;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.gcc.arabmoney.utils.DialogHelper;
import com.gcc.arabmoney.utils.SessionManager;


public abstract class BaseActivity extends AppCompatActivity implements View.OnClickListener {

    public Context context;
    public SessionManager sessionManager;
    public DialogHelper dialogHelper;

    public String[] notification_permissions = new String[]{Manifest.permission.POST_NOTIFICATIONS};
    public final int NOTIFICATION_PERMISSION_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        sessionManager = new SessionManager(context);
        dialogHelper = new DialogHelper(context);
        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                onBackPressAction();
            }
        });
    }
    @Override
    public void onClick(View view){

    }

    public void onBackPressAction(){
        finish();
    }

    public void refresh(){
        finish();
        startActivity(getIntent());
    }
    public void showMessage(String message){
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
    public void showMessageShort(String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
    public void startIntentAsFinishMode(Class<?> cls){
        Intent intent = new Intent(context, cls);
        startActivity(intent);
        finish();
    }
    public void startIntentAsCleanMode(Class<?> cls){
        Intent intent = new Intent(context, cls);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
    public void startIntentLiveMode(Class<?> cls){
        Intent intent = new Intent(context, cls);
        startActivity(intent);
    }

    public void adsStart(){

    }
    public void adsDismiss(){

    }
    public void onNotificationPermissionGranted() {

    }
    public void checkNotificationPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            boolean missingPermissions = checkSelfPermission(Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED;
            boolean showRationale = shouldShowRequestPermissionRationale(Manifest.permission.POST_NOTIFICATIONS);
            if (missingPermissions) {
                if (showRationale) {
                    showRationaleDialog("Notification Permission", "Notification permission is required by this App. Please grant in next dialog.", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            ActivityCompat.requestPermissions(BaseActivity.this, notification_permissions, NOTIFICATION_PERMISSION_CODE);
                        }
                    });
                } else {
                    ActivityCompat.requestPermissions(this, notification_permissions, NOTIFICATION_PERMISSION_CODE);
                }
            } else {
                onNotificationPermissionGranted();
            }
        } else {
            onNotificationPermissionGranted();
        }
    }
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == NOTIFICATION_PERMISSION_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                onNotificationPermissionGranted();
            } else {
                //showMessage("Permission denied !");
                //showPermissionExplanation("Notification Permission", "Notification permission was permanently denied. You have to enable permission  in App settings.");
            }
        }
    }
    private boolean isLocationEnabled(Context context) {
        int locationMode = 0;
        try {
            locationMode = Settings.Secure.getInt(context.getContentResolver(), Settings.Secure.LOCATION_MODE);
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
        }
        return locationMode != Settings.Secure.LOCATION_MODE_OFF;
    }
    private void showRationaleDialog(String title, String message, DialogInterface.OnClickListener listener) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setNegativeButton("Cancel", null);
        builder.setPositiveButton("Continue", listener);
        builder.show();
    }
    public void showPermissionExplanation(String title, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title)
                .setMessage(message)
                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        final Intent i = new Intent();
                        i.setAction(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
                        i.addCategory(Intent.CATEGORY_DEFAULT);
                        i.setData(Uri.parse("package:" + getPackageName()));
                        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        i.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                        i.addFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                        startActivity(i);
                        //ActivityCompat.requestPermissions(MainActivity.this, permissions, PERMISSION_CODE);
                    }
                });
        builder.create().show();
    }
}
