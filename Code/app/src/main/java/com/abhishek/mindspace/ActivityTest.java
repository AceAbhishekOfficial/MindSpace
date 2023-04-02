package com.abhishek.mindspace;

import static android.content.ContentValues.TAG;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ActivityTest extends AppCompatActivity
{
    User user;

    TextView texto1;
    TextView texto2;
    TextView texto3;
    TextView texto4;
    TextView question;

    CardView option1;
    CardView option2;
    CardView option3;
    CardView option4;

    String arr[][]=
            {
                    //Addiction
                    {"DO You have any addiction or dependence on substances or activities ?","Neither","Some","Most","Many"},

                    //Stress
                    {"How often have you experience feeling irritable or difficulty in relaxing?","Never felt that","Sometimes","Most of times","Always"},
                    //Health
                    {"How often do you consume processed and high-fat foods ?","Never","Sometimes","Most of times","Always"},

                    //Lazy
                    {"What is your routine of excercise/yoga or any kind of physical activity ?","Regularly","Sometimes in week ","Once a week","Never"},

                    //Lonely
                    {"How often have you experience felt left ou or no one to turn on","Never felt that","Sometimes","Most of times","Always"},

                    //Insomnia
                    {"How many hours of sleep do you typically get on an average ?","Upto 8 Hours","Upto 6 hrs","Less than 6 hrs","Less than 4 hrs"},

                    //Anxiety
                    {"How often have you experienced not being able to stop or control worrying?","Never felt that","Sometimes","Most of times","Always"},

                    //Dopamine
                    {"How long you use phone for insta/reel/shorts etc. ? ","upto 1 hr","1 to 3 hrs","3 to 5 hrs","more than 5"},

                    //Depression
                    {"How often have you experience depressed, or hopeless or having little energy ?","Never felt that","Sometimes","Most of times","Always"}




    };
    int qno = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        user = new User("Abhishek");

        question = findViewById(R.id.question);
        texto1 = findViewById(R.id.texto1);
        texto2 = findViewById(R.id.texto2);
        texto3 = findViewById(R.id.texto3);
        texto4 = findViewById(R.id.texto4);

        updatequestion();
        option1 = findViewById(R.id.option1);
        option1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                select(1);
                updatequestion();
            }
        });

        option2 = findViewById(R.id.option2);
        option2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                select(2);
                updatequestion();
            }
        });

        option3 = findViewById(R.id.option3);
        option3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                select(3);
                updatequestion();
            }
        });

        option4 = findViewById(R.id.option4);
        option4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                select(4);
                updatequestion();
            }
        });




    }

    public void updatequestion()
    {
        qno++;
        if(qno>=9)
        {
            System.out.println("working");
            user.print();
            float res = user.getMarks();



            String date = "Given on 2nd April";
//            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O)
//            {
//                String date = "Given on "+getCurrentDateAndMonth();
//                intent.putExtra("date",date);
//            }

            SharedPreferences pref = getSharedPreferences("login",MODE_PRIVATE);
            SharedPreferences.Editor editor = pref.edit();
            editor.putFloat("marks",res);
            editor.putString("date",date);

            editor.putInt("addiction", user.addiction);
            editor.putInt("stress",user.stress);
            editor.putInt("health",user.health);


            editor.putInt("lazy",user.lazy);
            editor.putInt("lonely",user.lonely);
            editor.putInt("insomnia",user.insomnia);


            editor.putInt("anxiety",user.anxiety);
            editor.putInt("depression", user.depression);
            editor.putInt("domaine",user.dopamine);


            editor.apply();

            Intent intent = new Intent(ActivityTest.this, ActivityResult.class);
            startActivity(intent);
            finish();

        }
        else {
            question.setText(arr[qno - 1][0]);
            texto1.setText(arr[qno - 1][1]);
            texto2.setText(arr[qno - 1][2]);
            texto3.setText(arr[qno - 1][3]);
            texto4.setText(arr[qno - 1][4]);
        }


    }

    public void select(int option)
    {
        if(qno==1)
        {
            user.addiction = 5-option;
        }
        else if(qno==2)
        {
            user.stress = 5-option;
        }
        else if(qno==3)
        {
            user.health  = 5-option;
        }
        else if(qno==4)
        {
            user.lazy = 5-option;
        }
        else if(qno==5)
        {
            user.lonely  = 5-option;
        }
        else if(qno==6)
        {
            user.insomnia = 5-option;
        }
        else if(qno==7)
        {
            user.anxiety = 5-option;
        }
        else if(qno==8)
        {
            user.dopamine = 5-option;
        }
        else if(qno==9)
        {
            user.depression = 5-option;
        }


    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String getCurrentDateAndMonth()
    {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM");
        String formattedDate = currentDate.format(formatter);
        String dayOfMonthSuffix;
        int dayOfMonth = currentDate.getDayOfMonth();
        if (dayOfMonth >= 11 && dayOfMonth <= 13) {
            dayOfMonthSuffix = "th";
        } else {
            switch (dayOfMonth % 10) {
                case 1:
                    dayOfMonthSuffix = "st";
                    break;
                case 2:
                    dayOfMonthSuffix = "nd";
                    break;
                case 3:
                    dayOfMonthSuffix = "rd";
                    break;
                default:
                    dayOfMonthSuffix = "th";
                    break;
            }
        }
        return formattedDate ;//+ dayOfMonthSuffix;
    }

}