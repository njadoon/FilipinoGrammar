package com.example.filipinogrammar;
import android.content.Intent;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Random;

public class Questions extends AppCompatActivity {
    CountDownTimer timer;
    private TextView tvTimer, tvQuestion, tvQuestionNo, btnChoice1, btnChoice2, btnChoice3, btnChoice4, selected;
    private Button btnNext;
    String question, choice1, choice2, choice3, choice4, answer, selectedAnswer;
    private int score = 0; private int questionNumber = 1; int n = 0;
    QuestionPack current = new QuestionPack();
    int[] questions = new int[10];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        tvQuestion = findViewById(R.id.question);
        tvQuestionNo = findViewById(R.id.tvQuestionNo);
        tvTimer = findViewById(R.id.timer);
        btnChoice1 = findViewById(R.id.choice1);
        btnChoice2 = findViewById(R.id.choice2);
        btnChoice3 = findViewById(R.id.choice3);
        btnChoice4 = findViewById(R.id.choice4);
        btnNext = findViewById(R.id.btnNext);
        Random random = new Random();
        timer = new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                tvTimer.setText("" + millisUntilFinished / 1000);
            }
            @Override
            public void onFinish() {
                showAnswer();
                btnChoicesOff();
                timesUp();
            }
        };
        for (int i = 0; i < questions.length; i++) {
            questions[i] = random.nextInt(32);
            for (int j = 0; j < i; j++) {
                if (questions[i] == questions[j]) {
                    i--;
                    break;
                }
            }
        }
        updateQuestion();
        timer.start();
    }
    private void timesUp(){
        Toast.makeText(this,"Times Up",Toast.LENGTH_SHORT).show();
}
    private void updateQuestion(){
        questionNumber++;
        n++;
        resetTimer();
        tvQuestionNo.setText(questionNumber + "/10");
        if(timer != null){
            timer.cancel();
        }
        timer.start();
        if (questionNumber < questions.length) {
            btnChoicesOn();
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
        }else {
            Toast.makeText(this,"Quiz finished",Toast.LENGTH_SHORT).show();
            openResults();
        }
    }
    public void openResults() {
        Intent intent = new Intent(this, Result_Activity.class);
        startActivity(intent);
    }
    public void btnChoicesOff(){
        btnChoice1.setEnabled(false);
        btnChoice2.setEnabled(false);
        btnChoice3.setEnabled(false);
        btnChoice4.setEnabled(false);
        btnNext.setEnabled(true);
    }
    public void btnChoicesOn(){
        btnChoice1.setBackground(getDrawable(R.drawable.unselected));
        btnChoice2.setBackground(getDrawable(R.drawable.unselected));
        btnChoice3.setBackground(getDrawable(R.drawable.unselected));
        btnChoice4.setBackground(getDrawable(R.drawable.unselected));
        btnChoice1.setEnabled(true);
        btnChoice2.setEnabled(true);
        btnChoice3.setEnabled(true);
        btnChoice4.setEnabled(true);
        btnNext.setEnabled(false);
    }
    void checkAnswer(TextView textView) {
        selectedAnswer = textView.getText().toString();
        if(selectedAnswer.equals(current.getCorrectAnswer(questions[n]))) {
            score++;
            textView.setBackground(getDrawable(R.drawable.right));
        } else {
            showAnswer();
            textView.setBackground(getDrawable(R.drawable.wrong));
        }
    }
    void showAnswer() {
        if (current.getCorrectAnswer(questions[n]).equalsIgnoreCase(current.getChoice1(questions[n])))
            btnChoice1.setBackground(getDrawable(R.drawable.right));
        else if (current.getCorrectAnswer(questions[n]).equalsIgnoreCase(current.getChoice2(questions[n])))
            btnChoice2.setBackground(getDrawable(R.drawable.right));
        else if (current.getCorrectAnswer(questions[n]).equalsIgnoreCase(current.getChoice3(questions[n])))
            btnChoice3.setBackground(getDrawable(R.drawable.right));
        else if (current.getCorrectAnswer(questions[n]).equalsIgnoreCase(current.getChoice4(questions[n])))
            btnChoice4.setBackground(getDrawable(R.drawable.right));
    }
    void resetTimer() {
        timer = new CountDownTimer(10000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                tvTimer.setText(String.valueOf(millisUntilFinished/1000));
            }
            @Override
            public void onFinish() {
            }
        };
    }
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.choice1:
            case R.id.choice2:
            case R.id.choice3:
            case R.id.choice4:
                if(timer!=null){
                    timer.cancel();}
                selected = (TextView) view;
                checkAnswer(selected);
                btnChoicesOff();
                break;
            case R.id.btnNext:
                if(n <= questions.length){
                    updateQuestion();
                } else {
                    Intent intent = new Intent(Questions.this, Result_Activity.class);
                    intent.putExtra("finalscore", score);
                    intent.putExtra("total", questions.length);
                    startActivity(intent);
                }
                break;
            case R.id.btnQuit:

        }
    }
}
