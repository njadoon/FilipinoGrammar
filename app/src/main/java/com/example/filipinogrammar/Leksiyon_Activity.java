package com.example.filipinogrammar;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Leksiyon_Activity extends AppCompatActivity {
    Button nextbtn, qzskpbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leksiyon);

        /*nextbtn = (Button) findViewById(R.id.btnNext);
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNextActivity();
            }
        });*/

        qzskpbtn = (Button) findViewById(R.id.btnskip);
        qzskpbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSkiponQuizActivity();
            }
        });
    }
    /*public void openNextActivity() {
        Intent intent = new Intent(this, LeksiyonA2_Activity.class);
        startActivity(intent);
    }*/
    public void openSkiponQuizActivity() {
        Intent intent = new Intent(this, questions.class);
        startActivity(intent);
    }
}