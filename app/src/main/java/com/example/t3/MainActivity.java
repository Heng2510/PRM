package com.example.t3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.example.t3.R.layout;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

//@Metadata(
//    mv = {1, 8, 0},
//    k = 1,
//    d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u0007"},
//    d2 = {"Lcom/example/t3/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"}
//)
public final class MainActivity extends AppCompatActivity {
    public Button myButton;
    public EditText myUser;
    public EditText myPass;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(layout.activity_main);

        myButton = findViewById(R.id.loginbtn);
        myUser = findViewById(R.id.username);
        myPass = findViewById(R.id.password);
    }

    public void onLogin(View view) {
        if (myUser.getText().toString().equals("admin") && myPass.getText().toString().equals("123456")) {
            Toast.makeText(getApplicationContext(),"Login Succesfully (test 1)",Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(),"Login failed (test 1)",Toast.LENGTH_SHORT).show();
        }
    }
}
