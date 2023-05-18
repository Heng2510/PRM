package com.example.t3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity1 extends AppCompatActivity {
    public TextView result;
    public EditText edit1, edit2;
    public Button btnAdd, btnSub, btnMul, btnDiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator1);
        result = findViewById(R.id.result);
        edit1 = findViewById(R.id.editNum1);
        edit2 = findViewById(R.id.editNum2);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);

        btnAdd.setOnClickListener(view -> {
            int res = Integer.parseInt(edit1.getText().toString()) + Integer.parseInt(edit2.getText().toString());
            result.setText("Value: " + res);
        });

        btnSub.setOnClickListener(view -> {
            int res = Integer.parseInt(edit1.getText().toString()) - Integer.parseInt(edit2.getText().toString());
            result.setText("Value: " + res);
        });

        btnMul.setOnClickListener(view -> {
            int res = Integer.parseInt(edit1.getText().toString()) * Integer.parseInt(edit2.getText().toString());
            result.setText("Value: " + res);
        });

        btnDiv.setOnClickListener(view -> {
            float res = Float.parseFloat(edit1.getText().toString()) / Float.parseFloat(edit2.getText().toString());
            result.setText("Value: " + res);
        });
    }
}