package com.example.hackathon;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class Avail_raw extends AppCompatActivity {
    private WebView web;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avail_raw);

        web =(WebView)findViewById(R.id.webView);
        web = (WebView) findViewById(R.id.webView);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        web.setWebViewClient(new myWebClient());
        web.getSettings().setJavaScriptEnabled(true);
        web.loadUrl("https://docs.google.com/spreadsheets/d/1Vh59jjH7efQA9T4hYIa-PBWdLQq0TI1UgWFh6_yUwRY/edit#gid=0");
    }

    public class myWebClient extends WebViewClient
    {
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            // TODO Auto-generated method stub
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            // TODO Auto-generated method stub

            view.loadUrl(url);
            return true;

        }

        @Override
        public void onPageFinished(WebView view, String url) {
            // TODO Auto-generated method stub
            super.onPageFinished(view, url);

            progressBar.setVisibility(View.GONE);
        }
    }

    // To handle "Back" key press event for WebView to go back to previous screen.
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && web.canGoBack()) {
            web.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}




