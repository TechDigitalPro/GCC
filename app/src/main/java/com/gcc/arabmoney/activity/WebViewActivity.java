package com.gcc.arabmoney.activity;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;

import com.gcc.arabmoney.R;
import com.gcc.arabmoney.base.BaseActivity;
import com.gcc.arabmoney.databinding.ActivityWebViewBinding;
import com.gcc.arabmoney.server.Server;

public class WebViewActivity extends BaseActivity implements MyBrowser.MyBrowserListener {
    ActivityWebViewBinding bind;
    String url;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = ActivityWebViewBinding.inflate(getLayoutInflater());
        setContentView(bind.getRoot());
        bind.backBtn.setOnClickListener(this);

        String title = getIntent().getStringExtra("title");
        if(title != null){
            bind.titleView.setText(title);
        }
        checkInternet();
    }

    public void checkInternet() {
        if (!Server.isNetworkAvailable(this)) {
            showMessage(getString(R.string.no_internet));
        } else {
            initialization();
        }
    }

    public void onClick(View view) {
        if (view == bind.backBtn) {
            finish();
        }
    }

    @SuppressLint("SetJavaScriptEnabled")
    private void initialization() {
        url = getIntent().getStringExtra("url");
        // Configure related browser settings

        // Configure the client to use when opening URLs
        MyBrowser browser = new MyBrowser();
        browser.setListener(this);
        bind.webView.setWebViewClient(browser);

        // Enable responsive layout
        bind.webView.getSettings().setLoadsImagesAutomatically(true);
        bind.webView.getSettings().setJavaScriptEnabled(true);
        bind.webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        bind.webView.getSettings().setUseWideViewPort(true);
        bind.webView.getSettings().setLoadWithOverviewMode(true);
        bind.webView.getSettings().setDomStorageEnabled(true);
        bind.webView.getSettings().setAllowFileAccess(true);
        //bind.webView.getSettings().setAppCacheEnabled(true);
        // Load the initial URL
        bind.webView.loadUrl(url);
    }

    @Override
    public void shouldOverrideUrlLoading(String url) {
        sessionManager.setUrl(url);
        bind.webView.loadUrl(url);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // Check if the key event was the Back button and if there's history
//        if ((keyCode == android.view.KeyEvent.KEYCODE_BACK) && bind.webView.canGoBack()) {
//            bind.webView.goBack();
//            return true;
//        }
        // If it wasn't the Back key or there's no web page history, bubble up to the default
        // system behavior (probably exit the activity)
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onEduPageStarted(WebView view, String url, Bitmap favicon) {
        bind.progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void onEduPageFinished(WebView view, String url) {
        bind.progressBar.setVisibility(View.GONE);
    }

    @Override
    public void onEduReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        //bind.progressBar.setVisibility(View.GONE);
    }

    @Override
    public void onEduReceivedSslError(WebView view, SslErrorHandler handler, SslError er) {
        handler.proceed();
//        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        String message = "SSL Certificate error.";
//        switch (er.getPrimaryError()) {
//            case SslError.SSL_UNTRUSTED:
//                message = "The certificate authority is not trusted.";
//                break;
//            case SslError.SSL_EXPIRED:
//                message = "The certificate has expired.";
//                break;
//            case SslError.SSL_IDMISMATCH:
//                message = "The certificate Hostname mismatch.";
//                break;
//            case SslError.SSL_NOTYETVALID:
//                message = "The certificate is not yet valid.";
//                break;
//        }
//        message += " Do you want to continue anyway?";
//
//        builder.setMessage(message);
//        builder.setPositiveButton("Continue", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                handler.proceed();
//            }
//        });
//        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                handler.cancel();
//            }
//        });
//        final AlertDialog dialog = builder.create();
//        dialog.show();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        //ConstParams.VISIT_STREAM = false;
    }
}
