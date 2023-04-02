package com.abhishek.mindspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run()
            {
                // Create an Intent to start the new activity
                SharedPreferences pref = getSharedPreferences("login",MODE_PRIVATE);
                Boolean logged = pref.getBoolean("logged",false);

                Intent intent;
                if(logged)
                    intent= new Intent(SplashScreen.this, MainActivity.class);
                else
                    intent= new Intent(SplashScreen.this, ActivityLogin.class);

                startActivity(intent);

                // Finish the current activity to prevent users from returning to it
                finish();
            }
        }, 2000); // 3 seconds delay (in milliseconds)
    }
}