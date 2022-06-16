package ru.samsung.slumber;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class EmailActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;
    String email;
    EditText editText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        button = findViewById(R.id.continueEmailButton);
        button.setOnClickListener(this);
        editText = findViewById(R.id.emailEditText);
        if(getSupportActionBar()!=null)
            this.getSupportActionBar().hide();
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.continueEmailButton:
                Intent intent = new Intent(this, PasswordActivity.class);
                email = String.valueOf(editText.getText());
                startActivity(intent);
        }
    }
}
