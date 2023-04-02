package com.abhishek.mindspace;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class ActivityMusic extends AppCompatActivity
{

    MediaPlayer player;

    int state=0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        state =1;
        play();

        ImageView playI = findViewById(R.id.play);
        playI.setImageResource(R.drawable.pause);
        playI.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
               if(state==1)
               {
                   state=0;
                   pause();
                   playI.setImageResource(R.drawable.play);
               }
               else
               {
                   state=1;
                   play();
                   playI.setImageResource(R.drawable.pause);
               }
            }
        });



    }
    public void play() {
        if (player == null) {
            player = MediaPlayer.create(this, R.raw.meditation);
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    play();
                }
            });
        }

        player.start();
    }

    public void pause() {
        if (player != null) {
            player.pause();
        }
    }

    public void stop(View v) {
        stopPlayer();
    }

    private void stopPlayer() {
        if (player != null) {
            player.release();
            player = null;
            Toast.makeText(this, "MediaPlayer released", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopPlayer();
    }
}