package ru.samsung.slumber;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GoalActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView;
    Button trackingSleepButton;
    Button fasterSleepButton;
    Button betterSleep;
    Button easierWakeUpButton;
    Button regulateRythmButton;
    Button relaxButton;
    TextView trackingTextView;
    TextView fasterTextView;
    TextView betterTextView;
    TextView easierTextView;
    TextView relaxTextView;
    TextView regulateTextView;
    ImageView trackingImageView;
    ImageView fasterImageView;
    ImageView betterImageView;
    ImageView easierImageView;
    ImageView regulateImageView;
    ImageView relaxImageView;
    Boolean tracking;
    Boolean faster;
    Boolean better;
    Boolean easier;
    Boolean regulate;
    Boolean relax;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal);
        textView = findViewById(R.id.goalNameTextView);
        textView.setText(NameActivity.name);
        trackingSleepButton = findViewById(R.id.trackingSleepButton);
        fasterSleepButton = findViewById(R.id.fasterSleepButton);
        betterSleep = findViewById(R.id.betterSleepButton);
        easierWakeUpButton = findViewById(R.id.betterWakeUpButton);
        regulateRythmButton = findViewById(R.id.regulateRythmButton);
        relaxButton = findViewById(R.id.relaxButton);
        trackingSleepButton.setOnClickListener(this);
        trackingTextView = findViewById(R.id.trackingSleepTextView);
        fasterTextView = findViewById(R.id.fasterSleepTextView);
        betterTextView = findViewById(R.id.betterSleepTextView);
        easierTextView = findViewById(R.id.easierWakeUpTextView);
        relaxTextView = findViewById(R.id.relaxTextView);
        regulateTextView = findViewById(R.id.regulateRythmTextView);
        trackingImageView = findViewById(R.id.trackingSleepImageView);
        fasterImageView = findViewById(R.id.fasterSleepImageView);
        betterImageView = findViewById(R.id.betterSleepImageView);
        easierImageView = findViewById(R.id.easierWakeUpImageView);
        regulateImageView = findViewById(R.id.regulateImageView);
        relaxImageView = findViewById(R.id.relaxImageView);
        trackingTextView.setOnClickListener(this);
        trackingImageView.setOnClickListener(this);
        tracking = false;
        faster = false;
        better = false;
        easier = false;
        regulate = false;
        relax = false;




    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.continueGoalButton:
//                Intent intent = new Intent(this, AgeActivity.class);
//                startActivity(intent);
            case R.id.trackingSleepButton:
                if(tracking==false){
                    trackingSleepButton.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                    tracking = true;
                }else{
                    trackingSleepButton.setBackgroundResource(R.drawable.multi_choosing_button);
                    tracking = false;
                }
            case R.id.trackingSleepTextView:
                if(tracking==false){
                    trackingSleepButton.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                    tracking = true;
                }else{
                    trackingSleepButton.setBackgroundResource(R.drawable.multi_choosing_button);
                    tracking = false;
                }
            case R.id.trackingSleepImageView:
                if(tracking==false){
                    trackingSleepButton.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                    tracking = true;
                }else{
                    trackingSleepButton.setBackgroundResource(R.drawable.multi_choosing_button);
                    tracking = false;
                }

        }


    }
}
