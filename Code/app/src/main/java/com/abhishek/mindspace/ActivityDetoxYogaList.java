package com.abhishek.mindspace;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.abhishek.mindspace.ui.YogaPose;

import java.util.ArrayList;

public class ActivityDetoxYogaList extends AppCompatActivity
{
    ArrayList<YogaPose> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detox_yoga_list);
        loadYogaList();

        TextView title1 = findViewById(R.id.title1);
        title1.setText((list.get(0)).Name);
        TextView benifit1 = findViewById(R.id.benifit1);
        benifit1.setText((list.get(0)).Benifits);

        CardView card1 = findViewById(R.id.yoga1);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityDetoxYogaList.this, ActivityDetoxYoga.class);
                intent.putExtra("yogaName",list.get(0).Name);
                intent.putExtra("yogaDesc",list.get(0).Desc);
                intent.putExtra("yogaVideo",list.get(0).Video);
                intent.putExtra("yogaBenifits",list.get(0).Benifits);

                startActivity(intent);

            }
        });

        CardView card2 = findViewById(R.id.yoga2);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityDetoxYogaList.this, ActivityDetoxYoga.class);
                intent.putExtra("yogaName",list.get(1).Name);
                intent.putExtra("yogaDesc",list.get(1).Desc);
                intent.putExtra("yogaVideo",list.get(1).Video);
                intent.putExtra("yogaBenifits",list.get(1).Benifits);

                startActivity(intent);

            }
        });

        CardView card3 = findViewById(R.id.yoga3);
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityDetoxYogaList.this, ActivityDetoxYoga.class);
                intent.putExtra("yogaName",list.get(2).Name);
                intent.putExtra("yogaDesc",list.get(2).Desc);
                intent.putExtra("yogaVideo",list.get(2).Video);
                intent.putExtra("yogaBenifits",list.get(2).Benifits);

                startActivity(intent);

            }
        });

        CardView card4 = findViewById(R.id.yoga4);
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityDetoxYogaList.this, ActivityDetoxYoga.class);
                intent.putExtra("yogaName",list.get(3).Name);
                intent.putExtra("yogaDesc",list.get(3).Desc);
                intent.putExtra("yogaVideo",list.get(3).Video);
                intent.putExtra("yogaBenifits",list.get(3).Benifits);

                startActivity(intent);

            }
        });

        CardView card5 = findViewById(R.id.yoga5);
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityDetoxYogaList.this, ActivityDetoxYoga.class);
                intent.putExtra("yogaName",list.get(4).Name);
                intent.putExtra("yogaDesc",list.get(4).Desc);
                intent.putExtra("yogaVideo",list.get(4).Video);
                intent.putExtra("yogaBenifits",list.get(4).Benifits);

                startActivity(intent);

            }
        });

        CardView card6 = findViewById(R.id.yoga6);
        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityDetoxYogaList.this, ActivityDetoxYoga.class);
                intent.putExtra("yogaName",list.get(5).Name);
                intent.putExtra("yogaDesc",list.get(5).Desc);
                intent.putExtra("yogaVideo",list.get(5).Video);
                intent.putExtra("yogaBenifits",list.get(5).Benifits);

                startActivity(intent);

            }
        });

        CardView card7 = findViewById(R.id.yoga7);
        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityDetoxYogaList.this, ActivityDetoxYoga.class);
                intent.putExtra("yogaName",list.get(6).Name);
                intent.putExtra("yogaDesc",list.get(6).Desc);
                intent.putExtra("yogaVideo",list.get(6).Video);
                intent.putExtra("yogaBenifits",list.get(6).Benifits);

                startActivity(intent);

            }
        });

        CardView card8 = findViewById(R.id.yoga8);
        card8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityDetoxYogaList.this, ActivityDetoxYoga.class);
                intent.putExtra("yogaName",list.get(7).Name);
                intent.putExtra("yogaDesc",list.get(7).Desc);
                intent.putExtra("yogaVideo",list.get(7).Video);
                intent.putExtra("yogaBenifits",list.get(7).Benifits);

                startActivity(intent);

            }
        });

        CardView card9 = findViewById(R.id.yoga9);
        card9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityDetoxYogaList.this, ActivityDetoxYoga.class);
                intent.putExtra("yogaName",list.get(8).Name);
                intent.putExtra("yogaDesc",list.get(8).Desc);
                intent.putExtra("yogaVideo",list.get(8).Video);
                intent.putExtra("yogaBenifits",list.get(8).Benifits);

                startActivity(intent);

            }
        });





        TextView title2 = findViewById(R.id.title2);
        title2.setText((list.get(1)).Name);
        TextView benifit2 = findViewById(R.id.benifit2);
        benifit2.setText((list.get(1)).Benifits);

        TextView title4 = findViewById(R.id.title4);
        title4.setText((list.get(3)).Name);
        TextView benifit4 = findViewById(R.id.benifit4);
        benifit4.setText((list.get(3)).Benifits);

        TextView title3 = findViewById(R.id.title3);
        title3.setText((list.get(2)).Name);
        TextView benifit3 = findViewById(R.id.benifit3);
        benifit3.setText((list.get(2)).Benifits);

        TextView title5 = findViewById(R.id.title5);
        title5.setText((list.get(4)).Name);
        TextView benifit5 = findViewById(R.id.benifit5);
        benifit5.setText((list.get(4)).Benifits);

        TextView title6 = findViewById(R.id.title6);
        title6.setText((list.get(5)).Name);
        TextView benifit6 = findViewById(R.id.benifit6);
        benifit6.setText((list.get(5)).Benifits);

        TextView title7 = findViewById(R.id.title7);
        title7.setText((list.get(6)).Name);
        TextView benifit7 = findViewById(R.id.benifit7);
        benifit7.setText((list.get(6)).Benifits);

        TextView title8 = findViewById(R.id.title8);
        title8.setText((list.get(7)).Name);
        TextView benifit8 = findViewById(R.id.benifit8);
        benifit8.setText((list.get(7)).Benifits);

        TextView title9 = findViewById(R.id.title9);
        title9.setText((list.get(8)).Name);
        TextView benifit9 = findViewById(R.id.benifit9);
        benifit9.setText((list.get(8)).Benifits);


    }
    public  void loadYogaList()
    {
        list.add(new YogaPose(1,
                "Vrikshasana",
                " Stand straight and place your right foot on your left thigh. Keep your left leg straight and balance your body weight on your left leg.\nBring your hands together in front of your chest and hold the pose for 30 seconds. Repeat with the other leg.",
                "vrikshasana",
                "It gives tranquillity to your mind thus good for those who are facing the problem of depression and anxiety"));
//        list.add(new YogaPose(1,
//                "",
//                "",
//                "",
//                ""));
        list.add(new YogaPose(2,
                "Trikonasana",
                "Stand straight with your feet apart. Turn your right foot outwards and bend to touch your right foot with your right hand. Stretch your left arm upwards and look up at your left hand.\nHold the pose for 30 seconds and repeat with the other side.",
                "trikonasana",
                "It helps to stretch your hamstrings, hips, and spine. It also helps to improve your balance and stability."));
        list.add(new YogaPose(3,
                "Ardha Chakrasana",
                "Stand straight with your feet apart. Place your hands on your lower back and bend backwards as far as you can. Hold the pose for 30 seconds.\n",
                "ardhachakrasana",
                "It opens up your chest and shoulders, which can help you breathe more deeply."));
        list.add(new YogaPose(4,
                "Padahastasana",
                "Stand straight with your feet together. Bend forward and try to touch the floor with your palms while keeping your legs straight.\nHold the pose for 30 seconds.",
                "padahastasana",
                " It helps to stretch your hamstrings, calves, and hips. It also helps to calm your mind."));
        list.add(new YogaPose(5,
                "Bhadrasana",
                "Sit down with your legs stretched out in front of you. Bend both knees and bring the soles of your feet together. Hold onto your feet with both hands and gently push down on your knees with your elbows to stretch further.",
                "bhadrasana",
                " It helps in keeping a balance of body during the pose can also help to maintain mental balance/stillness (Gives calmness to mind)."));
        list.add(new YogaPose(6,
                "Ustrasana",
                "Kneel down on the floor with your knees hip-width apart. Place your hands on your lower back and bend backwards as far as you can while keeping your thighs vertical to the floor.\nHold the pose for 30 seconds.",
                "ustrasana",
                "It helps to stretch your chest and shoulders. It also helps to improve your posture."));
        list.add(new YogaPose(7,
                "Vajrasana",
                "Kneel down on the floor with both knees together and sit back on your heels while keeping your spine straight.",
                "vajrasana",
                "This pose is also known as a meditative pose that calms the mind."));
        list.add(new YogaPose(8,
                "Bhujangasana",
                "Lie down on your stomach with palms facing downwards under shoulders. Lift up chin and arch backwards as much as possible.\nHold the pose for 30 seconds.",
                "bhujangasana",
                "This pose is also known for reducing stress and fatigue."));
        list.add(new YogaPose(9,
                "Shalabhasana",
                " Lie down on stomach with chin touching ground. Place hands under thighs, palms facing downwards.\nRaise legs up without bending at knees and hold for 30 seconds.",
                "shalabhasana",
                "This pose strengthens the lower back muscles and improves flexibility."));
    }
}