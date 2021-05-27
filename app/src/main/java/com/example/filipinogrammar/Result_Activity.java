package com.example.filipinogrammar;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import org.w3c.dom.Text;

public class Result_Activity extends AppCompatActivity {

    private Button done;
    //MainActivity mainActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        TextView resultLabel = (TextView) findViewById(R.id.score);
        TextView totalScoreLabel = (TextView) findViewById(R.id.reslabel);

        int score = getIntent().getIntExtra("finalscore", 0);

        //score = findViewById(R.id.score);
        done = findViewById(R.id.donebtn);


        SharedPreferences settings = getSharedPreferences("quizApp", Context.MODE_PRIVATE);
        int totalScore = settings.getInt("totalScore", 0);
        totalScore += score;

        resultLabel.setText(score + " / 10");
        totalScoreLabel.setText("Total Score: " + totalScore);

        //Update total score.
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt("total Score: ", totalScore);
        editor.commit();

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

        //Bundle bundle = getIntent().getExtras();

        /*if(bundle.getString("Get_Name")!= null)
        {
            name = bundle.getString("Get_Name");
            TextView textView = findViewById(R.id.namedisplay);
            textView.setText(name);
        }*/


        //int score = getIntent().getIntExtra("finalscore", 0);
        //TextView tvfinalscore = findViewById(R.id.score);
        //tvfinalscore.setText(score + " / 10");





    }
}