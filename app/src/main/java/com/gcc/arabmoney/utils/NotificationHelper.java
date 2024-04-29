package com.gcc.arabmoney.utils;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.gcc.arabmoney.R;
import com.gcc.arabmoney.activity.MainActivity;

public class NotificationHelper {
    private static int REMINDER_NOTIFICATION_ID = 1;
    @SuppressLint("MissingPermission")
    public static void showNotification(Context context, String notification_id, String title, String message) {
        String NOTIF_CHANNEL_ID = context.getPackageName() + ".arabmoney";

        Intent resultIntent = new Intent(context, MainActivity.class);
        resultIntent.putExtra("from", "notification");
        resultIntent.putExtra("notification_id", notification_id);

        PendingIntent pendingIntent;

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            pendingIntent = PendingIntent.getActivity(context, 0,
                    resultIntent, PendingIntent.FLAG_IMMUTABLE);
        } else {
            pendingIntent = PendingIntent.getActivity(context, 0,
                    resultIntent, PendingIntent.FLAG_UPDATE_CURRENT);
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(NOTIF_CHANNEL_ID, "ArabMoney", NotificationManager.IMPORTANCE_HIGH);
            channel.setLightColor(Color.BLUE);
            channel.enableVibration(true);
            channel.setLockscreenVisibility(Notification.VISIBILITY_PUBLIC);
            NotificationManager manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
            manager.createNotificationChannel(channel);

            NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(context, NOTIF_CHANNEL_ID);
            Uri alarmSound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);
            notificationBuilder.setContentIntent(pendingIntent);

            Notification notification = notificationBuilder
                    .setWhen(System.currentTimeMillis())
                    .setSmallIcon(R.mipmap.ic_launcher)
                    //.setContentTitle(title)
                    .setContentText(message)
                    .setAutoCancel(true)
                    .setSound(alarmSound)
                    .setVisibility(NotificationCompat.VISIBILITY_PUBLIC)
                    .build();

            manager.notify(REMINDER_NOTIFICATION_ID, notification);
        } else {
            Uri alarmSound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);

            NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(context, NOTIF_CHANNEL_ID)
                    .setWhen(System.currentTimeMillis())
                    .setSmallIcon(R.mipmap.ic_launcher)
                    //.setContentTitle(title)
                    .setContentText(message)
                    .setAutoCancel(true)
                    .setSound(alarmSound)
                    .setVisibility(NotificationCompat.VISIBILITY_PUBLIC);

            mBuilder.setContentIntent(pendingIntent);

            NotificationManagerCompat managerCompat = NotificationManagerCompat.from(context);
            managerCompat.notify(REMINDER_NOTIFICATION_ID, mBuilder.build());
        }
        REMINDER_NOTIFICATION_ID++;
        if (REMINDER_NOTIFICATION_ID > 100000) {
            REMINDER_NOTIFICATION_ID = 1;
        }
    }
}
