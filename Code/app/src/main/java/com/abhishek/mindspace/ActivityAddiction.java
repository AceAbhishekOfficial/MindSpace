package com.abhishek.mindspace;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;

public class ActivityAddiction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addiction);

        CardView timer = findViewById(R.id.cardView1);
        timer.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent();
                intent.setAction("com.google.android.apps.wellbeing.settings.action.SET_APP_TIMER");
                startActivity(intent);
            }
        });

        CardView analytics = findViewById(R.id.cardView2);
        analytics.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent();
                intent.setAction("com.google.android.apps.wellbeing.settings.action.VIEW_WEEKLY_REPORT");
                startActivity(intent);



            }
        });

    }
}