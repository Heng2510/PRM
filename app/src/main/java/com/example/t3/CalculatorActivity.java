package com.example.t3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {
    public TextView result;
    public EditText edit1, edit2;
    public Button btnAdd, btnSub, btnMul, btnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        result = findViewById(R.id.result);
        edit1 = findViewById(R.id.editNum1);
        edit2 = findViewById(R.id.editNum2);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
    }

    public void onAdd(View view) {
        int res = Integer.parseInt(edit1.getText().toString()) + Integer.parseInt(edit2.getText().toString());
        result.setText("Value: " + res);
    }

    public void onSub(View view) {
        int res = Integer.parseInt(edit1.getText().toString()) - Integer.parseInt(edit2.getText().toString());
        result.setText("Value: " + res);
    }

    public void onMul(View view) {
        int res = Integer.parseInt(edit1.getText().toString()) * Integer.parseInt(edit2.getText().toString());
        result.setText("Value: " + res);
    }

    public void onDiv(View view) {
        float res = Float.parseFloat(edit1.getText().toString()) / Float.parseFloat(edit2.getText().toString());
        result.setText("Value: " + res);
    }
}