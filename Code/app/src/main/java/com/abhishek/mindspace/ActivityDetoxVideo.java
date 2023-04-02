package com.abhishek.mindspace;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class ActivityDetoxVideo extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detox_video);

        Intent i = getIntent();


        int arr[] =
                {
                        R.id.lazy1, R.id.lazy2, R.id.lazy3, R.id.lazy4,
                        R.id.sleepy1,R.id.sleepy2,R.id.sleepy3,
                        R.id.medical1,R.id.medical2,R.id.medical3,R.id.medical5,
                        R.id.drug1,R.id.drug2,R.id.drug3,R.id.drug4,
                        R.id.dopamine1,R.id.dopamine2,R.id.dopamine3,R.id.dopamine4,
                        R.id.demotivated1,R.id.dopamine2,R.id.demotivated3
                };
        String links[]
                =
                {
                        "Laziness1","Laziness2","Laziness3","Laziness4",
                        "Insomnia1","Insomnia2","Insomnia3",
                        "Healthy1","Healthy2","Healthy3","Healthy4",
                        "Addiction1","Addiction2","Addiction3","Addiction4",
                        "Dopamine1","Dopamine2","Dopamine3","Dopamine4",
                        "Motivated1","Motivated2","Motivated3"
                };

        SharedPreferences pref = getSharedPreferences("login",MODE_PRIVATE);
        int addiction = pref.getInt("addiction",0);
        int stress = pref.getInt("stress",0);
        int health = pref.getInt("health",0);

        int lazy = pref.getInt("lazy",0);
        int lonely = pref.getInt("lonely",0);
        int insomnia = pref.getInt("insomnia",0);

        int anxiety = pref.getInt("anxitey",0);
        int depression = pref.getInt("depression",0);
        int dopamine = pref.getInt("dopamine",0);

        for(int a=0;a<arr.length;a++)
        {
            int finalA = a;
            findViewById(arr[a]).setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Intent intent = new Intent(ActivityDetoxVideo.this, ActivityVideos.class);
                    intent.putExtra("url","https://aceabhishekofficial.github.io/webview/video/"+links[finalA]+".html");
                    System.out.println("https://aceabhishekofficial.github.io/webview/video/"+links[finalA]+".html");
                    startActivity(intent);
                }
            });
        }

       findViewById(R.id.detox1).setOnClickListener(new View.OnClickListener()
       {
           @Override
           public void onClick(View v)
           {
               Intent intent = new Intent(ActivityDetoxVideo.this, ActivityVideos.class);
               intent.putExtra("url","https://aceabhishekofficial.github.io/webview/Detox1.html");
               startActivity(intent);

           }
       });
        findViewById(R.id.detox2).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(ActivityDetoxVideo.this, ActivityVideos.class);
                intent.putExtra("url","https://aceabhishekofficial.github.io/webview/Detox2.html");
                startActivity(intent);

            }
        });

        findViewById(R.id.detox3).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(ActivityDetoxVideo.this, ActivityVideos.class);
                intent.putExtra("url","https://aceabhishekofficial.github.io/webview/Detox3.html");
                startActivity(intent);

            }
        });

        findViewById(R.id.detox4).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(ActivityDetoxVideo.this, ActivityVideos.class);
                intent.putExtra("url","https://aceabhishekofficial.github.io/webview/Detox4.html");
                startActivity(intent);

            }
        });

        findViewById(R.id.detox5).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(ActivityDetoxVideo.this, ActivityVideos.class);
                intent.putExtra("url","https://aceabhishekofficial.github.io/webview/Detox5.html");
                startActivity(intent);

            }
        });

        findViewById(R.id.detox6).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(ActivityDetoxVideo.this, ActivityVideos.class);
                intent.putExtra("url","https://aceabhishekofficial.github.io/webview/Detox6.html");
                startActivity(intent);

            }
        });

        findViewById(R.id.detox7).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(ActivityDetoxVideo.this, ActivityVideos.class);
                intent.putExtra("url","https://aceabhishekofficial.github.io/webview/Detox7.html");
                startActivity(intent);

            }
        });

        findViewById(R.id.playlist1).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(ActivityDetoxVideo.this, ActivityVideos.class);
                intent.putExtra("url","https://aceabhishekofficial.github.io/webview/playlist1.html");
                startActivity(intent);

            }
        });

        findViewById(R.id.playlist2).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(ActivityDetoxVideo.this, ActivityVideos.class);
                intent.putExtra("url","https://aceabhishekofficial.github.io/webview/playlist2.html");
                startActivity(intent);

            }
        });

        findViewById(R.id.playlist3).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(ActivityDetoxVideo.this, ActivityVideos.class);
                intent.putExtra("url","https://aceabhishekofficial.github.io/webview/playlist3.html");
                startActivity(intent);

            }
        });

        findViewById(R.id.playlist4).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(ActivityDetoxVideo.this, ActivityVideos.class);
                intent.putExtra("url","https://aceabhishekofficial.github.io/webview/playlist4.html");
                startActivity(intent);

            }
        });

        findViewById(R.id.playlist5).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(ActivityDetoxVideo.this, ActivityVideos.class);
                intent.putExtra("url","https://aceabhishekofficial.github.io/webview/playlist5.html");
                startActivity(intent);

            }
        });

        findViewById(R.id.playlist6).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(ActivityDetoxVideo.this, ActivityVideos.class);
                intent.putExtra("url","https://aceabhishekofficial.github.io/webview/playlist6.html");
                startActivity(intent);

            }
        });

        findViewById(R.id.playlist7).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(ActivityDetoxVideo.this, ActivityVideos.class);
                intent.putExtra("url","https://aceabhishekofficial.github.io/webview/playlist7.html");
                startActivity(intent);

            }
        });


    }
}