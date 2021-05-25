package com.example.filipinogrammar;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Choices_Activity extends AppCompatActivity {
    Button btnLeksiyon, btnPagsususlit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choices_);

        btnLeksiyon = findViewById(R.id.btnlesson);
        btnLeksiyon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLeksiyonActivity();
            }
        });
        btnPagsususlit = findViewById(R.id.btnQuiz);
        btnPagsususlit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuizActivity();
            }
        });
    }
    public void openLeksiyonActivity() {
        Intent intent = new Intent(this, Lesson.class);
        startActivity(intent);
    }
    public void openQuizActivity() {
        Intent intent = new Intent(this, Questions.class);
        startActivity(intent);
    }
}