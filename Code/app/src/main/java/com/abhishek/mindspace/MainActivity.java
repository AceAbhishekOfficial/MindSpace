package com.abhishek.mindspace;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.View;

import com.google.android.material.navigation.NavigationView;

import androidx.annotation.RequiresApi;
import androidx.cardview.widget.CardView;
import androidx.core.content.res.ResourcesCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.abhishek.mindspace.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;

    public static final String CHANNEL = "My channel";
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMain.toolbar);

        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_settings, R.id.nav_logout)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);



        CardView evaluation = findViewById(R.id.cardView1);
        evaluation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityResult.class);
                startActivity(intent);
            }
        });

        CardView detox = findViewById(R.id.cardView3);
        detox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityDetox.class);
                startActivity(intent);
            }
        });

        CardView games = findViewById(R.id.cardView4);
        games.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityGames.class);
                startActivity(intent);
            }
        });

        CardView sleep = findViewById(R.id.cardView5);
        sleep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivitySleep.class);
                startActivity(intent);
            }
        });

        CardView expert = findViewById(R.id.cardView6);
        expert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityVideos.class);
                intent.putExtra("url","https://aceabhishekofficial.github.io/webview/maps.html");
                startActivity(intent);
                startActivity(intent);
            }
        });

        CardView addiction = findViewById(R.id.cardView2);
        addiction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityAddictionVideo.class);
                startActivity(intent);
            }
        });
        Handler handler=new Handler();;
        handler.postDelayed(new Runnable() {
            @Override
            public void run()
            {
                Drawable drawable = ResourcesCompat.getDrawable(getResources(),R.drawable.bluebrain,null);
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap icon = bitmapDrawable.getBitmap();
                NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                Notification noti = new Notification.Builder(getApplicationContext())
                        .setLargeIcon(icon)
                        .setSmallIcon(R.drawable.bluebrain)
                        .setContentText("Time to Detox your mind")
                        .setSubText("Watch this video on dopamine detox by Sadguru")

                        .setChannelId(CHANNEL)
                        .build();
                nm.createNotificationChannel(new NotificationChannel(CHANNEL,"New Channel",NotificationManager.IMPORTANCE_HIGH));
                nm.notify(100,noti);
            }
        }, 3 *60* 1000);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}