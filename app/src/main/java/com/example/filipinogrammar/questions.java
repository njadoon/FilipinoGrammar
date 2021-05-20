package com.example.filipinogrammar;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class questions extends AppCompatActivity {
    private TextView question, questionNo, timer;
    private Button btnNext, choice1, choice2, choice3, choice4;
    private List<QuestionPack> questionList;
    int totalQuestions;
    int counter = 0;
    private QuestionPack current;
    ColorStateList dfRbColor;
    boolean answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        questionList = new ArrayList<>();
        question = findViewById(R.id.question);
        questionNo = findViewById(R.id.questionNo);
        timer = findViewById(R.id.timer);
        choice1 = findViewById(R.id.choice1);
        choice2 = findViewById(R.id.choice2);
        choice3 = findViewById(R.id.choice3);
        choice4 = findViewById(R.id.choice4);
        btnNext = findViewById(R.id.btnNext);

        dfRbColor = choice1.getTextColors();

        addQuestions();
        totalQuestions= questionList.size();
        showNext();
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNext();
            }
        });
    }

    private void checkAnswer() {
    }

    private void showNext() {
        if(counter < totalQuestions){
            choice1.setTextColor(dfRbColor);
            choice2.setTextColor(dfRbColor);
            choice3.setTextColor(dfRbColor);
            current = questionList.get(counter);
            question.setText(current.getQuestion());
            choice1.setText(current.getChoice1());
            choice2.setText(current.getChoice2());
            choice3.setText(current.getChoice3());
            choice4.setText(current.getChoice4());
            counter++;
            btnNext.setText("Enter");
            questionNo.setText(counter +"/"+totalQuestions);

        }else {
            finish();
        }
    }

    private void addQuestions() {
        questionList.add(new QuestionPack("Musta?", "OK lang", "Malungkot", "Tama lang", "masaya", 4));
        questionList.add(new QuestionPack("panget?", "OK lang", "Malungkot", "Tama lang", "masaya", 4));
        questionList.add(new QuestionPack("pogi?", "OK lang", "Malungkot", "Tama lang", "masaya", 4));
        questionList.add(new QuestionPack("matangkad?", "OK lang", "Malungkot", "Tama lang", "masaya", 4));
        questionList.add(new QuestionPack("pandak?", "OK lang", "Malungkot", "Tama lang", "masaya", 4));
        questionList.add(new QuestionPack("mataba?", "OK lang", "Malungkot", "Tama lang", "masaya", 4));
        questionList.add(new QuestionPack("Payat?", "OK lang", "Malungkot", "Tama lang", "masaya", 4));
        questionList.add(new QuestionPack("matalino?", "OK lang", "Malungkot", "Tama lang", "masaya", 4));
        questionList.add(new QuestionPack("Bobo?", "OK lang", "Malungkot", "Tama lang", "masaya", 4));

    }
}