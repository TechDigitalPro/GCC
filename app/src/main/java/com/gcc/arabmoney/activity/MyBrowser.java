package com.gcc.arabmoney.activity;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.util.Log;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MyBrowser extends WebViewClient {

    private String TAG = "My browser";

    private MyBrowserListener mListener;

    public interface MyBrowserListener{
        void shouldOverrideUrlLoading(String url);
        void onEduPageStarted(WebView view, String url, Bitmap favicon);
        void onEduPageFinished(WebView view, String url);
        void onEduReceivedError(WebView view, WebResourceRequest request, WebResourceError error);
        void onEduReceivedSslError(WebView view, SslErrorHandler handler, SslError er);
    }

    public void setListener(MyBrowserListener listener){
        this.mListener = listener;
    }

    @SuppressWarnings("deprecation")
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        if(mListener != null){
            mListener.shouldOverrideUrlLoading(url);
        }
        return true;
    }

    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        Log.v(TAG, "onPageStarted");
        if(mListener != null){
            mListener.onEduPageStarted(view, url, favicon);
        }
    }

    @Override
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        Log.v(TAG, "onPageFinished");
        if(mListener != null){
            mListener.onEduPageFinished(view, url);
        }
    }
    @Override
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        Log.v(TAG, "onLoadResource");
    }

    @Override
    public void onPageCommitVisible(WebView view, String url) {
        super.onPageCommitVisible(view, url);
        Log.v(TAG, "onPageCommitVisible");
    }
    @Override
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        super.onReceivedError(view, request, error);
        Log.v(TAG, "onReceivedError");
        if(mListener != null){
            //view.stopLoading();
            mListener.onEduReceivedError(view, request, error);
        }
    }
    @Override
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError er) {
        super.onReceivedSslError(view, handler, er);
        if(mListener != null){
            mListener.onEduReceivedSslError(view, handler, er);
        }
    }
}