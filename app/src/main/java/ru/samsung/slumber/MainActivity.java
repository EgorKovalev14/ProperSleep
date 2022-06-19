package ru.samsung.slumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.startButton);
        button.setOnClickListener(this);
        if(getSupportActionBar()!=null)
            this.getSupportActionBar().hide();



    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.startButton:
                Log.d("MYTAG", "onClick: " + "начать");
                Intent intent = new Intent(this, NameActivity.class);
                startActivity(intent);
        }
    }
}