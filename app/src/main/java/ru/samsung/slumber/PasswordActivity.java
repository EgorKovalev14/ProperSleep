package ru.samsung.slumber;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PasswordActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonContinue;
    EditText editText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        buttonContinue = findViewById(R.id.continuePasswordButton);
        editText = findViewById(R.id.passwordEditText);
        buttonContinue.setOnClickListener(this);
        if(getSupportActionBar()!=null)
            this.getSupportActionBar().hide();


    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.continuePasswordButton:
                Intent intent = new Intent(this, GoalActivity.class);
                startActivity(intent);

        }
    }
}
