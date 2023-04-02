package com.abhishek.mindspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        final boolean[] send_OTP = {false};
        findViewById(R.id.loginbtn).setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                if(send_OTP[0])
                {
                    SharedPreferences pref = getSharedPreferences("login",MODE_PRIVATE);
                    SharedPreferences.Editor editor = pref.edit();
                    editor.putBoolean("logged",true);
                    editor.apply();
                    Intent intent = new Intent(ActivityLogin.this, ActivityTest.class);
                    startActivity(intent);
                    finish();

                }
                else
                {
                    send_OTP[0] =true;
                    TextView tv= findViewById(R.id.logintext);
                    tv.setText("Verify");
                    Toast.makeText(getApplicationContext(), "OTP Send Successfully", Toast.LENGTH_SHORT).show();

                }

            }
        });

    }
}