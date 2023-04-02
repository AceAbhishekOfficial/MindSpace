package com.abhishek.mindspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;


public class ActivityDetoxYoga extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detox_yoga);

        Intent intent = getIntent();
        String poseName = intent.getStringExtra("yogaName");
        String poseDesc = intent.getStringExtra("yogaDesc");
        String poseBenifits = intent.getStringExtra("yogaBenifits");
        String poseVideo = intent.getStringExtra("yogaVideo");


        TextView yogaName = findViewById(R.id.yogaName);
        yogaName.setText(poseName);

        TextView yogaName2 = findViewById(R.id.poseName);
        yogaName2.setText(poseName);

        TextView yogaDesc = findViewById(R.id.poseDesc);
        yogaDesc.setText(poseDesc);

        TextView yogaBenifit = findViewById(R.id.posebenifits);
        yogaBenifit.setText(poseBenifits);



        VideoView video = findViewById(R.id.poseVideo);
        String path = "android.resource://"+getPackageName()+"/raw/"+poseVideo;
        video.setVideoPath(path);

        video.start();

        MediaController mc = new MediaController(this);
        video.setMediaController(mc);
        mc.setAnchorView(video);
    }


}