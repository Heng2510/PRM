package com.example.t3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity1 extends AppCompatActivity {
    public Button myButton1;
    public EditText myUser1;
    public EditText myPass1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        myButton1 = findViewById(R.id.loginbtn);
        myUser1 = findViewById(R.id.username);
        myPass1 = findViewById(R.id.password);
        myButton1.setOnClickListener(view -> {
            if (myUser1.getText().toString().equals("admin") && myPass1.getText().toString().equals("123456"))
            {
                Toast.makeText(getApplicationContext(),"Login Successfully (test 2)", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(),"Login failed (test 2)", Toast.LENGTH_SHORT).show();
            }
        });
    }
}