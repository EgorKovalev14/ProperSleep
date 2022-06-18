package ru.samsung.slumber;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener {
    Button continueWelcome;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        continueWelcome = findViewById(R.id.continueWelcomeButton);
        continueWelcome.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.continueWelcomeButton:
                Intent intent = new Intent(this, AlarmActivity.class);
                startActivity(intent);
        }
    }
}
