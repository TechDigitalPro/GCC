package com.gcc.arabmoney.utils;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.widget.TextView;

import com.gcc.arabmoney.R;

public class DialogHelper {

    private Context context;
    private ProgressDialog dialog;
    public static int NOTIFICATION_ID = 10;

    public interface MyDialogListener{
        void onClickOk();
        void onClickNo();
    }

    public DialogHelper(Context context){
        this.context = context;
        dialog = new ProgressDialog(context, R.style.DialogTheme);
    }

    public void setDialogInfo(String title, String message){
        dialog.setCancelable(false);

        dialog.setTitle(title);
        dialog.setMessage(message);

    }

    public void showProgressDialog(){
        if(dialog != null){
            dialog.setCancelable(false);
            dialog.show();
            dialog.setContentView(R.layout.layout_progress_view);
        }
    }

    public void showProgressDialog(String text){
        if(dialog != null){
            dialog.setCancelable(false);
            dialog.show();
            dialog.setContentView(R.layout.layout_progress_view);
            TextView textView = dialog.findViewById(R.id.text);
            textView.setText(text);
        }
    }

    public void closeDialog(){
        if(dialog != null){
            dialog.dismiss();
        }
    }

    public static void showMessageDialog(Context context, String title, String message, final MyDialogListener listener){
        AlertDialog.Builder builder = new AlertDialog.Builder(context, R.style.AlertDialogTheme);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setCancelable(false);
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if(listener != null){
                    listener.onClickOk();
                }
            }
        });
        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if(listener != null){
                    listener.onClickNo();
                }
            }
        });
        builder.create().show();
    }

    public static void showNotificationDialog(final Context context, String title, String message){

        AlertDialog.Builder builder = new AlertDialog.Builder(context, R.style.AlertDialogTheme);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setCancelable(false);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        builder.create().show();
    }
    private void ring() {
        Uri alarmSound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        MediaPlayer mp = MediaPlayer.create(context, alarmSound);
        mp.start();
    }
}
