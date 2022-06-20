package ru.samsung.slumber;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HowOldActivivty extends AppCompatActivity implements View.OnClickListener {
    Button howOldButton1;
    Button howOldButton2;
    Button howOldButton3;
    Boolean howOld1 = false;
    Boolean howOld2 = false;
    Boolean howOld3 = false;
    Button howOldContinueButton;
    TextView textViewName;
    static Integer age = -1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_old);
        howOldButton1 = findViewById(R.id.howOldButton1);
        howOldButton2 = findViewById(R.id.howOldButton2);
        howOldButton3 = findViewById(R.id.howOldButton3);
        howOldButton1.setOnClickListener(this);
        howOldButton2.setOnClickListener(this);
        howOldButton3.setOnClickListener(this);
        howOldContinueButton = findViewById(R.id.continueHowOldButton);
        howOldContinueButton.setOnClickListener(this);
        textViewName = findViewById(R.id.howOldNameTextView);
        textViewName.setText(NameActivity.name);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.howOldButton1:
                if (!howOld1) {
                    howOldButton1.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                    howOldButton2.setBackgroundResource(R.drawable.multi_choosing_button);
                    howOldButton3.setBackgroundResource(R.drawable.multi_choosing_button);
                    howOld1 = true;
                    howOld2 = false;
                    howOld3 = false;
                    age = 0;
                } else {
                    howOldButton1.setBackgroundResource(R.drawable.multi_choosing_button);
                    howOldButton2.setBackgroundResource(R.drawable.multi_choosing_button);
                    howOldButton3.setBackgroundResource(R.drawable.multi_choosing_button);
                    howOld1 = false;
                    howOld2 = false;
                    howOld3 = false;
                    age = -1;
                }
                break;
            case R.id.howOldButton2:
                if (!howOld2) {
                    howOldButton2.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                    howOldButton1.setBackgroundResource(R.drawable.multi_choosing_button);
                    howOldButton3.setBackgroundResource(R.drawable.multi_choosing_button);
                    howOld2 = true;
                    howOld1 = false;
                    howOld3 = false;
                    age = 1;
                } else {
                    howOldButton1.setBackgroundResource(R.drawable.multi_choosing_button);
                    howOldButton2.setBackgroundResource(R.drawable.multi_choosing_button);
                    howOldButton3.setBackgroundResource(R.drawable.multi_choosing_button);
                    howOld1 = false;
                    howOld2 = false;
                    howOld3 = false;
                    age = -1;
                }
                break;
            case R.id.howOldButton3:
                if (!howOld3) {
                    howOldButton3.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                    howOldButton2.setBackgroundResource(R.drawable.multi_choosing_button);
                    howOldButton1.setBackgroundResource(R.drawable.multi_choosing_button);
                    howOld3 = true;
                    howOld2 = false;
                    howOld1 = false;
                    age = 2;
                } else {
                    howOldButton1.setBackgroundResource(R.drawable.multi_choosing_button);
                    howOldButton2.setBackgroundResource(R.drawable.multi_choosing_button);
                    howOldButton3.setBackgroundResource(R.drawable.multi_choosing_button);
                    howOld1 = false;
                    howOld2 = false;
                    howOld3 = false;
                    age = -1;
                }
                break;
            case R.id.continueHowOldButton:
                if (howOld1 || howOld2 || howOld3) {
                    if (age != -1) {
                        Intent intent = new Intent(this, GoToSleepActivity.class);
                        startActivity(intent);
                    }
                }else {
                    Toast toast = new Toast(this);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    View view1 = inflater.inflate(R.layout.toast_age, null);
                    toast.setView(view1);
                    toast.show();
                }
                break;

        }
    }
}

