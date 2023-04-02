package com.abhishek.mindspace;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.res.ResourcesCompat;

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
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class ActivityDetox extends AppCompatActivity
{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detox);

        TextView quote = findViewById(R.id.quote);
        TextView quoteBy = findViewById(R.id.quoteBy);

        String Quote[] = getRandomQuote();

        quote.setText(Quote[0]);
        quoteBy.setText(Quote[1]);

        CardView videos = findViewById(R.id.cardView1);
        videos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityDetox.this, ActivityDetoxVideo.class);
                startActivity(intent);
            }
        });
        CardView yoga = findViewById(R.id.cardView2);
        yoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityDetox.this, ActivityDetoxYogaList.class);
                startActivity(intent);
            }
        });
        CardView meditation = findViewById(R.id.cardView3);
        meditation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityDetox.this, ActivityMeditation.class);
                startActivity(intent);
            }
        });

        CardView card4 = findViewById(R.id.cardView4);
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityDetox.this, ActivityMusic.class);
                startActivity(intent);
            }
        });





    }
    public static String[] getRandomQuote()
    {
        Random random = new Random();
        int index = random.nextInt(QUOTES.length);
        return QUOTES[index];
    }
    private static final String[][] QUOTES = {
            {"Arise, awake, and stop not until the goal is reached.", "Swami Vivekananda"},
            {"Be the change you want to see in the world.", "Mahatma Gandhi"},
            {"The mind is everything. What you think you become.", "Lord Buddha"},
            {"Do not dwell in the past, do not dream of the future, concentrate the mind on the present moment.", "Lord Buddha"},
            {"The greatest glory in living lies not in never falling, but in rising every time we fall.", "Nelson Mandela"},
            {"The best way to find yourself is to lose yourself in the service of others.", "Mahatma Gandhi"},
            {"You are not a drop in the ocean. You are the entire ocean in a drop.", "Rumi"},
            {"The only way to do great work is to love what you do.", "Steve Jobs"},
            {"I slept and dreamt that life was joy. I awoke and saw that life was service. I acted and behold, service was joy.", "Rabindranath Tagore"},
            {"Believe you can and you're halfway there.", "Theodore Roosevelt"},
            {"The future belongs to those who believe in the beauty of their dreams.", "Eleanor Roosevelt"},
            {"You must be the change you wish to see in the world.", "Mahatma Gandhi"},
            {"It does not matter how slowly you go as long as you do not stop.", "Confucius"},
            {"The best way to predict the future is to invent it.", "Alan Kay"},
            {"Don't watch the clock; do what it does. Keep going.", "Sam Levenson"},
            {"The weak can never forgive. Forgiveness is the attribute of the strong.", "Mahatma Gandhi"},
            {"The mind is a powerful tool, it can enslave us or empower us. It's up to us to choose.", "Unknown"},
            {"You miss 100% of the shots you don't take.", "Wayne Gretzky"},
            {"Life is 10% what happens to us and 90% how we react to it.", "Charles R. Swindoll"},
            {"Success is not final, failure is not fatal: It is the courage to continue that counts.", "Winston Churchill"},
            {"Do not go where the path may lead, go instead where there is no path and leave a trail.", "Ralph Waldo Emerson"},
            {"The best preparation for tomorrow is doing your best today.", "H. Jackson Brown, Jr."},
            {"Success is not the key to happiness. Happiness is the key to success. If you love what you are doing, you will be successful.", "Albert Schweitzer"},
            {"To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment.", "Ralph Waldo Emerson"},
            {"Believe in yourself and all that you are. Know that there is something inside you that is greater than any obstacle.", "Christian D. Larson"},
            {"It's not the load that breaks you down, it's the way you carry it.", "Lou Holtz"},
            {"In three words I can sum up everything I've learned about life: it goes on.", "Robert Frost"},
            {"The biggest adventure you can ever take is to live the life of your dreams.", "Oprah Winfrey"},
            {"The difference between ordinary and extraordinary is that little extra.", "Jimmy Johnson"}
    };
}