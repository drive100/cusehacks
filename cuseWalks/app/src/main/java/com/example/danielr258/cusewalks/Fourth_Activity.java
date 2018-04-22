package com.example.danielr258.cusewalks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Fourth_Activity extends AppCompatActivity {

    private WebView webview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_);

        webview2 =(WebView)findViewById(R.id.webView2);

        webview2.setWebViewClient(new WebViewClient());
        webview2.getSettings().setJavaScriptEnabled(true);
        webview2.getSettings().setDomStorageEnabled(true);
        webview2.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
        webview2.loadUrl("https://dps.syr.edu/category/public-safety-notices-2017/");
    }
}
