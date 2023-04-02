package com.abhishek.mindspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class ActivityVideos extends AppCompatActivity
{
WebView video;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);
        video = findViewById(R.id.detoxvideo);
        Intent intent = getIntent();

        String url = intent.getStringExtra("url");
        video.loadUrl(url);

        WebSettings webSettings = video.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}