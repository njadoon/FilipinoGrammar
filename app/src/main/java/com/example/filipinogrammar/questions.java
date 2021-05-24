package com.example.filipinogrammar;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Random;

public class questions extends AppCompatActivity {
    CountDownTimer timer;
    int timerValue = 15;
    private View view;
    private TextView tvQuestion, tvQuestionNo, quiz, fil;
    private Button btnNext, btnChoice1, btnChoice2, btnChoice3, btnChoice4, btnStart;
    private String answer;
    private int score;
    private int questionNumber = 1;
    private QuestionPack current;
    int n = 0;
    int questions[] = new int[10];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        tvQuestion = findViewById(R.id.question);
        fil = findViewById(R.id.fil);
        quiz = findViewById(R.id.quiz);
        view = findViewById(R.id.view5);
        tvQuestionNo = findViewById(R.id.questionNo);
//        timer = findViewById(R.id.timer);
        btnChoice1 = findViewById(R.id.choice1);
        btnChoice2 = findViewById(R.id.choice2);
        btnChoice3 = findViewById(R.id.choice3);
        btnChoice4 = findViewById(R.id.choice4);
        btnNext = findViewById(R.id.btnNext);
        btnStart = findViewById(R.id.btnStartQuiz);
        btnChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnChoicesOff();
                if (btnChoice1.getText() == answer) {
                    score++;
                }
            }
        });
        btnChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnChoicesOff();
                if (btnChoice1.getText() == answer) {
                    score++;
                }
            }
        });
        btnChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnChoicesOff();
                if (btnChoice1.getText() == answer) {
                    score++;
                }
            }
        });
        btnChoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnChoicesOff();
                if (btnChoice1.getText() == answer) {
                    score++;
                }
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n++;
                questionNumber++;
                tvQuestionNo.setText(questionNumber + "/10");
                updateQuestion(n);
                btnChoicesOn();
                btnNext.setEnabled(false);
            }
        });
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("hereeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee","questionNumber");
                btnChoice1.setVisibility(View.VISIBLE);
                btnChoice2.setVisibility(View.VISIBLE);
                btnChoice3.setVisibility(View.VISIBLE);
                btnChoice4.setVisibility(View.VISIBLE);

                Random random = new Random();
                for (int i = 0; i < questions.length; i++) {
                    questions[i] = random.nextInt(39);
                    for (int j = 0; j < i; j++) {
                        if (questions[i] == questions[j]) {
                            i--;
                            break;
                        }
                    }
                } updateQuestion(n);
            }
        });
    }
    private void updateQuestion(int n){
        tvQuestion.setText(current.getQuestion(questions[n]));
        btnChoice1.setText(current.getChoice1(questions[n]));
        btnChoice2.setText(current.getChoice2(questions[n]));
        btnChoice3.setText(current.getChoice3(questions[n]));
        btnChoice4.setText(current.getChoice4(questions[n]));
        answer = current.getCorrectAnswer(questions[n]);
    }
    public void btnChoicesOff(){
        btnChoice1.setEnabled(false);
        btnChoice2.setEnabled(false);
        btnChoice3.setEnabled(false);
        btnChoice4.setEnabled(false);
    }
    public void btnChoicesOn(){
        btnChoice1.setEnabled(true);
        btnChoice2.setEnabled(true);
        btnChoice3.setEnabled(true);
        btnChoice4.setEnabled(true);
    }
}
