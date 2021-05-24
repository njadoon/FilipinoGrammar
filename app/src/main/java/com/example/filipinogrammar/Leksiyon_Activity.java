package com.example.filipinogrammar;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Leksiyon_Activity extends AppCompatActivity {
    Button nextbtn, qzskpbtn;
    TextView lessonHeader, lesson;
    int lessons = 0;
    private Lessons current;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leksiyon);
        lessonHeader = findViewById(R.id.lesson1);
        lesson = findViewById(R.id.text1);

        nextbtn = (Button) findViewById(R.id.btnNext);
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lessons++;

                lessonHeader.setText(current.getLessonHeader(lessons));
                lesson.setText(current.getLesson(lessons));
                if(lessons == 10){
                    nextbtn.setVisibility(View.INVISIBLE);
                }
            }
        });

        qzskpbtn = (Button) findViewById(R.id.btnskip);
        qzskpbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSkiponQuizActivity();
            }
        });
    }

    public void openSkiponQuizActivity() {
        Intent intent = new Intent(this, questions.class);
        startActivity(intent);
    }
}