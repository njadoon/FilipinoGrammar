package com.example.filipinogrammar;

import android.content.Intent;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
public class Lesson extends AppCompatActivity {
    TextView tvLessonHeader, tvLesson;
    TextView btnNext, btnSkip, btnPrev;
    int lessons = 0;
    Lessons current = new Lessons();
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);
        Bundle bundle = getIntent().getExtras();
        name = bundle.getString("Get_Name");
        String lessonHeader = current.getLessonHeader(0);
        String lesson = current.getLesson(0);
        tvLesson = findViewById(R.id.lesson);
        tvLessonHeader = findViewById(R.id.lessonHeader);
        btnNext = findViewById(R.id.nextLesson);
        btnPrev = findViewById(R.id.prevLesson);
        btnSkip = findViewById(R.id.skip);
        tvLessonHeader.setText(lessonHeader);
        tvLesson.setText(lesson);
        tvLesson.setMovementMethod(new ScrollingMovementMethod());
        btnNext.setOnClickListener(v -> {
            lessons++;
            tvLessonHeader.setText(current.getLessonHeader(lessons));
            tvLesson.setText(current.getLesson(lessons));
            btnPrev.setVisibility(View.VISIBLE);
            if(lessons == 9){
                btnNext.setVisibility(View.INVISIBLE);
            }
        });
        btnPrev.setOnClickListener(v -> {
            lessons--;
            tvLessonHeader.setText(current.getLessonHeader(lessons));
            tvLesson.setText(current.getLesson(lessons));
            btnNext.setVisibility(View.VISIBLE);
            if(lessons == 0){
                btnPrev.setVisibility(View.INVISIBLE);
            }
        });
        btnSkip.setOnClickListener(v -> openQuizActivity());
    }
    public void openQuizActivity() {
        Intent intent = new Intent(this, Questions.class);
        intent.putExtra("Get_Name", name);
        startActivity(intent);
    }
}