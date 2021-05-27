package com.example.filipinogrammar;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Result_Activity extends AppCompatActivity {
    String name, score;
    private Button done;
    //MainActivity mainActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        Bundle bundle = getIntent().getExtras();
        name = bundle.getString("Get_Name");
        score = bundle.getString("finalscore");




        //score = findViewById(R.id.score);
        done = findViewById(R.id.donebtn);
/*
        String score_str = getIntent().getStringExtra("score");
        score.setText(score_str);

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Result_Activity.this, MainActivity.class);
                Result_Activity.this.startActivity(intent);
                Result_Activity.this.finish();
            }
        });
*/
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Result_Activity.this, MainActivity.class);
                Result_Activity.this.startActivity(intent);
                Result_Activity.this.finish();
            }
        });


        //Intent intent = getIntent();

        //getting the name input of player
        /*name = intent.getStringExtra("Get_Name");
        TextView textView = findViewById(R.id.namedisplay);
        textView.setText(name);
        textView.setText(mainActivity.getName());*/

        /*Bundle bundle = getIntent().getExtras();*/

        if(bundle.getString("Get_Name")!= null)
        {
            name = bundle.getString("Get_Name");
            TextView textView = findViewById(R.id.namedisplay);
            textView.setText(name);



        }


//        int score = getIntent().getIntExtra("finalscore", 0);
        TextView tvfinalscore = findViewById(R.id.score);
        tvfinalscore.setText(score + " / 10");





    }
}