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
    Button continueGoalButton;
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
        fasterImageView.setOnClickListener(this);
        fasterSleepButton.setOnClickListener(this);
        fasterTextView.setOnClickListener(this);
        betterSleep.setOnClickListener(this);
        betterImageView.setOnClickListener(this);
        betterTextView.setOnClickListener(this);
        easierImageView.setOnClickListener(this);
        easierTextView.setOnClickListener(this);
        easierWakeUpButton.setOnClickListener(this);
        regulateImageView.setOnClickListener(this);
        regulateRythmButton.setOnClickListener(this);
        regulateTextView.setOnClickListener(this);
        relaxButton.setOnClickListener(this);
        relaxImageView.setOnClickListener(this);
        relaxTextView.setOnClickListener(this);
        tracking = false;
        faster = false;
        better = false;
        easier = false;
        regulate = false;
        relax = false;
        continueGoalButton = findViewById(R.id.continueGoalButton);
        continueGoalButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.continueGoalButton:
                Intent intent = new Intent(this, HowOldActivivty.class);
                startActivity(intent);
                break;
            case R.id.trackingSleepButton:
                if (tracking == false) {
                    trackingSleepButton.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                    tracking = true;
                } else {
                    trackingSleepButton.setBackgroundResource(R.drawable.multi_choosing_button);
                    tracking = false;
                }
                break;
            case R.id.trackingSleepTextView:
                if (tracking == false) {
                    trackingSleepButton.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                    tracking = true;
                } else {
                    trackingSleepButton.setBackgroundResource(R.drawable.multi_choosing_button);
                    tracking = false;
                }
                break;
            case R.id.trackingSleepImageView:
                if (tracking == false) {
                    trackingSleepButton.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                    tracking = true;
                } else {
                    trackingSleepButton.setBackgroundResource(R.drawable.multi_choosing_button);
                    tracking = false;
                }
                break;


            case R.id.fasterSleepButton:
                if (faster == false) {
                    fasterSleepButton.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                    faster = true;
                } else {
                    fasterSleepButton.setBackgroundResource(R.drawable.multi_choosing_button);
                    faster = false;
                }
                break;
            case R.id.fasterSleepTextView:
                if (faster == false) {
                    fasterSleepButton.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                    faster = true;
                } else {
                    fasterSleepButton.setBackgroundResource(R.drawable.multi_choosing_button);
                    faster = false;
                }
                break;
            case R.id.fasterSleepImageView:
                if (faster == false) {
                    fasterSleepButton.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                    faster = true;
                } else {
                    fasterSleepButton.setBackgroundResource(R.drawable.multi_choosing_button);
                    faster = false;
                }
                break;


            case R.id.betterSleepButton:
                if (better == false) {
                    betterSleep.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                    better = true;
                } else {
                    betterSleep.setBackgroundResource(R.drawable.multi_choosing_button);
                    better = false;
                }
                break;
            case R.id.betterSleepTextView:
                if (better == false) {
                    betterSleep.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                    better = true;
                } else {
                    betterSleep.setBackgroundResource(R.drawable.multi_choosing_button);
                    better = false;
                }
                break;
            case R.id.betterSleepImageView:
                if (better == false) {
                    betterSleep.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                    better = true;
                } else {
                    betterSleep.setBackgroundResource(R.drawable.multi_choosing_button);
                    better = false;
                }
                break;


            case R.id.betterWakeUpButton:
                if (easier == false) {
                    easierWakeUpButton.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                    easier = true;
                } else {
                    easierWakeUpButton.setBackgroundResource(R.drawable.multi_choosing_button);
                    easier = false;
                }
                break;
            case R.id.easierWakeUpTextView:
                if (easier == false) {
                    easierWakeUpButton.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                    easier = true;
                } else {
                    easierWakeUpButton.setBackgroundResource(R.drawable.multi_choosing_button);
                    easier = false;
                }
                break;
            case R.id.easierWakeUpImageView:
                if (easier == false) {
                    easierWakeUpButton.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                    easier = true;
                } else {
                    easierWakeUpButton.setBackgroundResource(R.drawable.multi_choosing_button);
                    easier = false;
                }
                break;


            case R.id.regulateRythmButton:
                if (regulate == false) {
                    regulateRythmButton.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                    regulate = true;
                } else {
                    regulateRythmButton.setBackgroundResource(R.drawable.multi_choosing_button);
                    regulate = false;
                }
                break;
            case R.id.regulateRythmTextView:
                if (regulate == false) {
                    regulateRythmButton.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                    regulate = true;
                } else {
                    regulateRythmButton.setBackgroundResource(R.drawable.multi_choosing_button);
                    regulate = false;
                }
                break;
            case R.id.regulateImageView:
                if (regulate == false) {
                    regulateRythmButton.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                    regulate = true;
                } else {
                    regulateRythmButton.setBackgroundResource(R.drawable.multi_choosing_button);
                    regulate = false;
                }
                break;


            case R.id.relaxButton:
                if (relax == false) {
                    relaxButton.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                    relax = true;
                } else {
                    relaxButton.setBackgroundResource(R.drawable.multi_choosing_button);
                    relax = false;
                }
                break;
            case R.id.relaxTextView:
                if (relax == false) {
                    relaxButton.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                    relax = true;
                } else {
                    relaxButton.setBackgroundResource(R.drawable.multi_choosing_button);
                    relax = false;
                }
                break;
            case R.id.relaxImageView:
                if (relax == false) {
                    relaxButton.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                    relax = true;
                } else {
                    relaxButton.setBackgroundResource(R.drawable.multi_choosing_button);
                    relax = false;
                }
                break;

        }

    }

}

        






