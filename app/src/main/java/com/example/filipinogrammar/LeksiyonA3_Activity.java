package com.example.filipinogrammar;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class LeksiyonA3_Activity extends AppCompatActivity {
    Button nextbtn, qzskpbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leksiyon_a3_);

        /*nextbtn = (Button) findViewById(R.id.btnNext);
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNextActivity();
            }
        });*/

        /*qzskpbtn = (Button) findViewById(R.id.btnskip);
        qzskpbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSkiponQuizActivity();
            }
        });*/
    }

    /*public void openNextActivity() {
        Intent intent = new Intent(this, LeksiyonA3_Activity.class);
        startActivity(intent);
    }

    public void openSkiponQuizActivity() {
        Intent intent = new Intent(this, Quiz_Activity.class);
        startActivity(intent);
    }*/
}