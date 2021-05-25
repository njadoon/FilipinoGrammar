package com.example.filipinogrammar;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Random;

public class Questions extends AppCompatActivity {
    CountDownTimer timer;
    int timerValue = 15;
    private View view;
    private TextView tvQuestion, tvQuestionNo, btnChoice1, btnChoice2, btnChoice3, btnChoice4;
    private Button btnNext;
    String question, choice1, choice2, choice3, choice4, answer;
    private int score;
    private int questionNumber = 1;
    QuestionPack current = new QuestionPack();
    int n = 0;
    int[] questions = new int[10];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        tvQuestion = findViewById(R.id.question);
        tvQuestionNo = findViewById(R.id.tvQuestionNo);
//        timer = findViewById(R.id.timer);
        btnChoice1 = findViewById(R.id.choice1);
        btnChoice2 = findViewById(R.id.choice2);
        btnChoice3 = findViewById(R.id.choice3);
        btnChoice4 = findViewById(R.id.choice4);
        btnNext = findViewById(R.id.btnNext);
        Random random = new Random();
        for (int i = 0; i < questions.length; i++) {
            questions[i] = random.nextInt(34);
            for (int j = 0; j < i; j++) {
                if (questions[i] == questions[j]) {
                    i--;
                    break;
                }
            }
        }
        updateQuestion(n);
        btnChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnChoicesOff();
                System.out.println("Score = "+ score);
                if (btnChoice1.getText() == answer) {
                    score++;
                    btnChoice1.setBackgroundColor(Color.green(255));
                }else
                    btnChoice1.setBackgroundColor(Color.red(255));

            }
        });
        btnChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnChoicesOff();
                System.out.println("Score = "+ score);
                if (btnChoice1.getText() == answer) {
                    score++;
                    btnChoice2.setBackgroundColor(Color.green(255));
                }else
                    btnChoice2.setBackgroundColor(Color.red(255));
            }
        });
        btnChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnChoicesOff();
                System.out.println("Score = "+ score);
                if (btnChoice1.getText() == answer) {
                    score++;
                    btnChoice3.setBackgroundColor(Color.green(255));
                }else
                    btnChoice3.setBackgroundColor(Color.red(255));
            }
        });
        btnChoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnChoicesOff();
                System.out.println("Score = "+ score);
                if (btnChoice1.getText() == answer) {
                    score++;
                    btnChoice4.setBackgroundColor(Color.green(255));
                } else
                    btnChoice4.setBackgroundColor(Color.red(255));
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                questionNumber++;
                n++;
                System.out.println("Question number "+ questionNumber);
                System.out.println("Array number "+ n);
                tvQuestionNo.setText(questionNumber + "/10");
                updateQuestion(n);
                btnChoicesOn();
            }
        });
            }
    private void updateQuestion(int n){
        question = current.getQuestion(questions[n]);
        choice1 = current.getChoice1(questions[n]);
        choice2 = current.getChoice2(questions[n]);
        choice3 = current.getChoice3(questions[n]);
        choice4 = current.getChoice4(questions[n]);
        answer = current.getCorrectAnswer(questions[n]);
        tvQuestion.setText(question);
        btnChoice1.setText(choice1);
        btnChoice2.setText(choice2);
        btnChoice3.setText(choice3);
        btnChoice4.setText(choice4);
    }
    public void btnChoicesOff(){
        btnChoice1.setEnabled(false);
        btnChoice2.setEnabled(false);
        btnChoice3.setEnabled(false);
        btnChoice4.setEnabled(false);
        btnNext.setEnabled(true);
    }
    public void btnChoicesOn(){
        btnChoice1.setEnabled(true);
        btnChoice2.setEnabled(true);
        btnChoice3.setEnabled(true);
        btnChoice4.setEnabled(true);
        btnNext.setEnabled(false);
    }
}
