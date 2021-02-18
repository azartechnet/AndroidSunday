package com.example.webviewconcepts;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.annotation.Nullable;

public class WebViewProcess extends Activity
{
    private WebView wb;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webviewprocess);
        wb=findViewById(R.id.webview);
        wb.loadUrl("https://www.javatpoint.com/android-life-cycle-of-activity");

    }
}
