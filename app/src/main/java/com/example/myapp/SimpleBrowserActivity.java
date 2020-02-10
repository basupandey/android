package com.example.myapp;

import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SimpleBrowserActivity extends AppCompatActivity {
    private EditText edtUrl;
    private WebView webView;
    WebViewClient client;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_browser);
        edtUrl=findViewById(R.id.edit_url);
        webView=findViewById(R.id.web_view);
        WebSettings settings=webView.getSettings();
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setJavaScriptEnabled(true);
        client=new WebViewClient();
        webView.setWebViewClient(client);
        webView.loadUrl("http://www.google.com");

    }

    public void go(View view) {
        String s=edtUrl.getText().toString();
        webView.loadUrl(s);

    }

    public void back(View view) {
        if (webView.canGoBack()){
            webView.goBack();
        }
        else {
            Toast.makeText(getApplicationContext(),"You cannot go back",Toast.LENGTH_SHORT).show();
        }
    }

    public void forward(View view) {
        if (webView.canGoForward()){
            webView.goForward();
        }

        else {
            Toast.makeText(getApplicationContext(),"You cannot go back",Toast.LENGTH_SHORT).show();
        }

    }

    public void load(View view) {
        webView.reload();
    }

    public void clear(View view) {
        webView.clearHistory();

    }
}
