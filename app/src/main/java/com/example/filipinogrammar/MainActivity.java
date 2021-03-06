package com.example.filipinogrammar;

import android.content.Intent;
import android.text.method.KeyListener;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.AppCompatEditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatEditText etName = findViewById(R.id.etName);
        Button btnStart = findViewById(R.id.btnStart);

        btnStart.setOnClickListener(v -> {
            if (etName.getText().toString().isEmpty()){
                Toast.makeText(getApplicationContext(), "Ilagay ang iyong pangalan", Toast.LENGTH_SHORT).show();
            } else {
                Intent intent = new Intent(this, Choices_Activity.class);
                intent.putExtra("Get_Name", etName.getText().toString());
                startActivity(intent);
                finish();
            }
        });    }

    public void sendMessage(){
        AppCompatEditText etName = findViewById(R.id.etName);
        String name = etName.getText().toString();
        Intent copy = new Intent(this, Result_Activity.class);
        copy.putExtra("Get_Name", name);
        startActivity(copy);
    }
}