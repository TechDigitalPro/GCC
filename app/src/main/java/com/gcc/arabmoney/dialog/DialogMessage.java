package com.gcc.arabmoney.dialog;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.gcc.arabmoney.base.BaseDialog;
import com.gcc.arabmoney.databinding.DialogMessageBinding;

public class DialogMessage extends BaseDialog {
    DialogMessageBinding bind;
    Listener mListener;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
        bind();
        builder.setView(bind.getRoot());
        return builder.create();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (getDialog() != null && getDialog().getWindow() != null) {
            getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);
            getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            getDialog().setCancelable(false);
        }
        initView();
        return super.getView();
    }
    @SuppressLint("ResourceType")
    private void bind(){
        bind = DialogMessageBinding.inflate(requireActivity().getLayoutInflater());
    }
    public interface Listener{
        void onWatch();
        void onUpgrade();
    }
    public void setListener(Listener listener){
        this.mListener = listener;
    }
    private void initView(){
        //bind.closeBtn.setOnClickListener(this);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
    @Override
    public void onClick(View view) {
//        if(view == bind.closeBtn){
//            dismiss();
//        }
    }
}
