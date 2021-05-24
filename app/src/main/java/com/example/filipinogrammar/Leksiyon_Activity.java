package com.example.filipinogrammar;

import android.content.Intent;
import android.util.Log;
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

        Lessons test = new Lessons();
        String ztest = test.getLessonHeader(0);
        String xtest = test.getLesson(0);

        lesson.setText((xtest));
        lessonHeader.setText((ztest));

        nextbtn = (Button) findViewById(R.id.btnNext);
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Log.e("hereeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee","lessons");
                String xtest = test.getLesson(lessons);
                lesson.setText((xtest));


                lessons++;


                lessonHeader.setText(test.getLessonHeader(lessons));
                lesson.setText(test.getLesson(lessons));
                if(lessons == 9){
                    nextbtn.setVisibility(View.GONE);
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