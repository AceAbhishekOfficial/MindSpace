package com.abhishek.mindspace;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class ActivityGames extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);

        TextView quote = findViewById(R.id.quote);
        quote.setText(getRandomFact());

        CardView card1 = findViewById(R.id.cardView1);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityGames.this, ActivityVideos.class);
                intent.putExtra("url","https://aceabhishekofficial.github.io/webview/focus/Hit_the_Dot.html");
                startActivity(intent);
            }
        });

        CardView card2 = findViewById(R.id.cardView2);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityGames.this, ActivityVideos.class);
                intent.putExtra("url","https://aceabhishekofficial.github.io/webview/Concentration_game/chasing_white.html");
                startActivity(intent);
            }
        });

        CardView card3 = findViewById(R.id.cardView3);
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityGames.this, ActivityVideos.class);
                intent.putExtra("url","https://aceabhishekofficial.github.io/webview/memory/Repeat_the_beat.html");
                startActivity(intent);
            }
        });

        CardView card4 = findViewById(R.id.cardView4);
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityGames.this, ActivityVideos.class);
                intent.putExtra("url","https://aceabhishekofficial.github.io/webview/Concentration_game/bigger.html");
                startActivity(intent);
            }
        });
    }
    private static final String[] FACTS = {
            "The mind can process up to 70,000 thoughts per day.",
            "Meditation can increase gray matter in the brain.",
            "The mind can influence physical healing.",
            "It is estimated that 95% of our thoughts are repetitive.",
            "Daydreaming can lead to increased creativity.",
            "The mind can create and overcome phobias.",
            "The placebo effect is a powerful demonstration of the mind's influence.",
            "It is possible to train the mind to control pain.",
            "The mind and body are deeply interconnected.",
            "The mind can improve cognitive function through exercise.",
            "The mind can change the structure of the brain through neuroplasticity.",
            "The mind can improve memory through repetition.",
            "The mind can be trained to increase focus and attention.",
            "The mind can process information faster than the conscious awareness.",
            "Sleep is essential for the mind to function optimally.",
            "The mind can experience synesthesia, where one sense triggers another.",
            "The mind can experience hallucinations under certain conditions.",
            "The mind can have a significant impact on stress levels.",
            "The mind can create and store memories from past experiences.",
            "The mind can experience altered states of consciousness.",
            "The mind can have a profound effect on mood and emotions.",
            "The mind can generate creative ideas through brainstorming.",
            "The mind can experience cognitive biases that affect decision-making.",
            "The mind can perceive time differently under different circumstances.",
            "The mind can experience flow states during activities that require full focus."
    };

    private static final Random RANDOM = new Random();

    public static String getRandomFact() {
        int index = RANDOM.nextInt(FACTS.length);
        return FACTS[index];
    }
}