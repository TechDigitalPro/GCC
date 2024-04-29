package com.gcc.arabmoney.base;

import android.app.Application;

import androidx.annotation.NonNull;

import com.gcc.arabmoney.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.smartlook.android.core.api.Smartlook;
import com.smartlook.android.core.api.enumeration.Status;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        subscribe_topic();
        initSmartLook();
    }

    private void subscribe_topic(){
        FirebaseMessaging.getInstance().subscribeToTopic("arabmoney")
                .addOnCompleteListener(task -> {
                    String msg = "Subscribed";
                    if (!task.isSuccessful()) {
                        msg = "Subscribe failed";
                    }
                });
    }
    private void initSmartLook() {
        Smartlook smartlook = Smartlook.getInstance();
        smartlook.getPreferences().setProjectKey(getString(R.string.smart_look_key));
        smartlook.start();
//        Status status = smartlook.getState().getStatus();
//
//        if (status instanceof Status.Recording) {
//        } else if (status instanceof Status.NotRecording) {
//            switch (((Status.NotRecording) status).getCause()) {
//                case NOT_STARTED:
//                    break;
//                case STOPPED:
//                    break;
//                case PROJECT_LIMIT_REACHED:
//                    break;
//                case STORAGE_LIMIT_REACHED:
//                    break;
//                case INTERNAL_ERROR:
//                    break;
//            }
//        }
    }
}
