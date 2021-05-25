package com.example.filipinogrammar;

import android.content.Intent;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Lesson extends AppCompatActivity {
    TextView tvLessonHeader, tvLesson;
    TextView btnNext, btnSkip;
    int lessons = 0;
    Lessons current = new Lessons();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);
        tvLesson = findViewById(R.id.lesson);
        tvLessonHeader = findViewById(R.id.lessonHeader);
        btnNext = findViewById(R.id.nextLesson);
        btnSkip = findViewById(R.id.skip);

        String lessonHeader = current.getLessonHeader(0);
        String lesson = current.getLesson(0);

        tvLessonHeader.setText(lessonHeader);
        tvLesson.setText(lesson);

        tvLesson.setMovementMethod(new ScrollingMovementMethod());
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lessons++;
                tvLessonHeader.setText(current.getLessonHeader(lessons));
                tvLesson.setText(current.getLesson(lessons));
                if(lessons == 9){
                    btnNext.setVisibility(View.GONE);
                }
            }
        });
        btnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuizActivity();
            }
        });
    }
    public void openQuizActivity() {
        Intent intent = new Intent(this, Questions.class);
        startActivity(intent);
    }
}