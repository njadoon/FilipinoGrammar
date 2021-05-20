package com.example.filipinogrammar;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Choices_Activity extends AppCompatActivity {
    Button leksiyonbtn, pagsusulitbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choices_);

        leksiyonbtn = (Button) findViewById(R.id.btnlesson);
        leksiyonbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLeksiyonActivity();
            }
        });

        pagsusulitbtn = (Button) findViewById(R.id.btnquiz);
        pagsusulitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuizActivity();
            }
        });
    }
    public void openLeksiyonActivity() {
        Intent intent = new Intent(this, Leksiyon_Activity.class);
        startActivity(intent);
    }
    public void openQuizActivity() {
        Intent intent = new Intent(this, questions.class);
        startActivity(intent);
    }
}