package com.example.weatherapplearning;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    MaterialButton button1,button2,button3,button4;
    EditText edit1,edit2;
    TextView Answer;
    int num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);
        button4 = findViewById(R.id.btn4);
        edit1 = findViewById(R.id.ed1);
        edit2 = findViewById(R.id.ed2);
        Answer = findViewById(R.id.answer);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);

    }

    public int getIntFromEditText(EditText editText){
        if (editText.getText().toString().isEmpty()){
            Toast.makeText(this, "Enter number", Toast.LENGTH_SHORT).show();
            return 0;
        } else
            return Integer.parseInt(editText.getText().toString());
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {
            num1 = getIntFromEditText(edit1);
            num2 = getIntFromEditText(edit2);
            if (v == button1){
                Answer.setText("Answer = " + (num1+num2));
           } else if (v == button2) {
                Answer.setText("Answer = " + (num1*num2));
            } else if (v == button3) {
                Answer.setText("Answer = " + (num1-num2));
            } else if (v == button4) {
                Answer.setText("Answer = " + ((float)num1/(float)num2));
            }
    }
}