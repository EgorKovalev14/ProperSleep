package ru.samsung.slumber;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.jar.Attributes;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editText;
    Button continueLoginButton, registerButton;
    View background;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editText=findViewById(R.id.loginEditText);
        continueLoginButton = findViewById(R.id.continueLoginButton);
        registerButton = findViewById(R.id.registerButton);
        continueLoginButton.setOnClickListener(this);
        registerButton.setOnClickListener(this);
        background = findViewById(R.id.background_login);
        background.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.registerButton:
                Intent intent = new Intent(this, NameActivity.class);
                startActivity(intent);
                break;
            case R.id.background_login:
                NameActivity.hideKeyboard(this);
                break;
        }


    }
}
