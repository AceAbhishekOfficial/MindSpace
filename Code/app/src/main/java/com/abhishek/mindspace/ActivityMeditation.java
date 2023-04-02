package com.abhishek.mindspace;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityMeditation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditation);
        CardView meditation = findViewById(R.id.cardView8);
        meditation.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(ActivityMeditation.this, ActivityMeditationTutorial.class);
                startActivity(intent);
            }
        });
        CardView card7 = findViewById(R.id.cardView7);
        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMeditation.this, ActivityMusic.class);
                startActivity(intent);
            }
        });
    }

}