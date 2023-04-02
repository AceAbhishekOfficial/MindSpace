package com.abhishek.mindspace;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivtySleepMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activty_sleep_music);

        CardView card1 = findViewById(R.id.yoga1);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivtySleepMusic.this, ActivityVideos.class);
                intent.putExtra("url","https://aceabhishekofficial.github.io/webview/video/sleepa.html");
                startActivity(intent);

            }
        });

        CardView card2 = findViewById(R.id.yoga2);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivtySleepMusic.this, ActivityVideos.class);
                intent.putExtra("url","https://aceabhishekofficial.github.io/webview/video/sleepb.html");
                startActivity(intent);

            }
        });

        CardView card3 = findViewById(R.id.yoga3);
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivtySleepMusic.this, ActivityVideos.class);
                intent.putExtra("url","https://aceabhishekofficial.github.io/webview/video/sleepc.html");
                startActivity(intent);

            }
        });

        CardView card4 = findViewById(R.id.yoga4);
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivtySleepMusic.this, ActivityVideos.class);
                intent.putExtra("url","https://aceabhishekofficial.github.io/webview/video/sleepd.html");
                startActivity(intent);

            }
        });

        CardView card5 = findViewById(R.id.yoga5);
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivtySleepMusic.this, ActivityVideos.class);
                intent.putExtra("url","https://aceabhishekofficial.github.io/webview/video/sleepe.html");
                startActivity(intent);

            }
        });

    }
}