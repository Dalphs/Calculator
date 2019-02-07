package com.android.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inputA;
    private EditText inputB;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputA = findViewById(R.id.input_a);
        inputB = findViewById(R.id.input_b);
        result = findViewById(R.id.result_text_view);



    }

    public void plusClick(View view) {
        try {
            double a = Double.parseDouble(inputA.getText().toString());
            double b = Double.parseDouble(inputB.getText().toString());
            double res = Calculator.add(a, b);
            result.setText(String.valueOf(res));
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void subtractClick(View view) {
        try {
            double a = Double.parseDouble(inputA.getText().toString());
            double b = Double.parseDouble(inputB.getText().toString());
            double res = Calculator.substract(a, b);
            result.setText(String.valueOf(res));
        }catch(Exception e) {
            e.printStackTrace();
        }

    }

    public void multiplyClick(View view) {
        try {
            double a = Double.parseDouble(inputA.getText().toString());
            double b = Double.parseDouble(inputB.getText().toString());
            double res = Calculator.multiply(a, b);
            result.setText(String.valueOf(res));
        }catch(Exception e) {
                e.printStackTrace();
            }
    }

    public void divideClick(View view) {
        try{
        double a = Double.parseDouble(inputA.getText().toString());
        double b = Double.parseDouble(inputB.getText().toString());
        double res = Calculator.divide(a, b);
        if(res < 2000000000)
        result.setText(String.valueOf(res));
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
