package com.example.filipinogrammar;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Result_Activity extends AppCompatActivity {
    String name, score;
    private Button done;
    TextView nameDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        Bundle bundle = getIntent().getExtras();
        name = bundle.getString("Get_Name");
        score = bundle.getString("finalscore");
        done = findViewById(R.id.donebtn);
        done.setOnClickListener(v -> {
            Intent intent = new Intent(Result_Activity.this, MainActivity.class);
            Result_Activity.this.startActivity(intent);
            Result_Activity.this.finish();
            openMain();
        });
        nameDisplay= findViewById(R.id.nameDisplay);
        nameDisplay.setText(name);
        TextView finalScore = findViewById(R.id.score);
        finalScore.setText(score + " / 10");
        TextView scoreDisplay = findViewById(R.id.scoreDisplay);
        scoreDisplay.setText(score);
    }
    public void openMain(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}