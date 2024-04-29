package com.gcc.arabmoney.service;

import android.app.Service;
import android.content.Intent;
import android.os.CountDownTimer;
import android.os.IBinder;

import com.gcc.arabmoney.utils.Utils;

public class AccountCounterService extends Service {

    private final static String TAG = "AccountCounterService";

    public static final String COUNTDOWN_BR = "account_counter";
    Intent bi;
    CountDownTimer cdt = null;

    @Override
    public void onCreate() {
        super.onCreate();
        bi = new Intent(COUNTDOWN_BR);
        cdt = new CountDownTimer(Long.MAX_VALUE, 60000) {
            @Override
            public void onTick(long millisUntilFinished) {
                if(Utils.account_num > 0){
                    Utils.account_num--;
                }
                bi.putExtra("account_num",  Utils.account_num);
                sendBroadcast(bi);
            }

            @Override
            public void onFinish() {

            }
        };

        cdt.start();
    }

    @Override
    public void onDestroy() {
        cdt.cancel();
        super.onDestroy();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent arg0) {
        return null;
    }
}