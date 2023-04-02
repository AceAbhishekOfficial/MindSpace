package com.abhishek.mindspace;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class ActivityResult extends AppCompatActivity
{

    ProgressBar percent;
    TextView score;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        percent = findViewById(R.id.scorebar);
        score = findViewById(R.id.percent);

        SharedPreferences pref = getSharedPreferences("login",MODE_PRIVATE);

        float per = pref.getFloat("marks",56.7f);
        String date = pref.getString("date"," ");

        TextView Date = findViewById(R.id.date);
        Date.setText(date);

        String formattedNum = String.format("%.2f", per);
        score.setText(formattedNum);
        percent.setProgress((int)per);

        CardView reEvaluate = findViewById(R.id.reEvaluate);
        reEvaluate.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(), "Please wait for next month", Toast.LENGTH_SHORT).show();
            }
        });

        CardView previous = findViewById(R.id.previous);
        previous.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(), "No previous results found", Toast.LENGTH_SHORT).show();
            }
        });





    }

}