package ru.samsung.slumber;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

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
    ArrayList<Button> list = new ArrayList<>();
    Integer goal = -1;



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
        list.add(easierWakeUpButton);
        list.add(fasterSleepButton);
        list.add(regulateRythmButton);
        list.add(relaxButton);
        list.add(trackingSleepButton);
        list.add(betterSleep);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.continueGoalButton:
                if(goal!=-1) {
                    Intent intent = new Intent(this, HowOldActivivty.class);
                    startActivity(intent);
                }else{
                    Toast toast = new Toast(this);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    View view1 = inflater.inflate(R.layout.toast_goal, null);
                    toast.setView(view1);
                    toast.show();
                }
                break;
            case R.id.trackingSleepButton:
                for(int i=0; i<6;i++){
                    list.get(i).setBackgroundResource(R.drawable.multi_choosing_button);
                }
                trackingSleepButton.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                goal = 0;
                break;
            case R.id.trackingSleepTextView:
                for(int i=0; i<6;i++){
                    list.get(i).setBackgroundResource(R.drawable.multi_choosing_button);
                }
                trackingSleepButton.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                goal = 0;
                break;
            case R.id.trackingSleepImageView:
                for(int i=0; i<6;i++){
                    list.get(i).setBackgroundResource(R.drawable.multi_choosing_button);
                }
                trackingSleepButton.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                goal = 0;
                break;


            case R.id.fasterSleepButton:
                for(int i=0; i<6;i++){
                    list.get(i).setBackgroundResource(R.drawable.multi_choosing_button);
                }
                fasterSleepButton.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                goal = 1;
                break;
            case R.id.fasterSleepTextView:
                for(int i=0; i<6;i++){
                    list.get(i).setBackgroundResource(R.drawable.multi_choosing_button);
                }
                fasterSleepButton.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                goal = 1;

                break;
            case R.id.fasterSleepImageView:
                for(int i=0; i<6;i++){
                    list.get(i).setBackgroundResource(R.drawable.multi_choosing_button);
                }
                fasterSleepButton.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                goal = 1;

                break;


            case R.id.betterSleepButton:
                for(int i=0; i<6;i++){
                    list.get(i).setBackgroundResource(R.drawable.multi_choosing_button);
                }
                betterSleep.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                goal = 2;

                break;
            case R.id.betterSleepTextView:
                for(int i=0; i<6;i++){
                    list.get(i).setBackgroundResource(R.drawable.multi_choosing_button);
                }
                betterSleep.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                goal = 2;

                break;
            case R.id.betterSleepImageView:
                for(int i=0; i<6;i++){
                    list.get(i).setBackgroundResource(R.drawable.multi_choosing_button);
                }
                betterSleep.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                goal = 2;

                break;


            case R.id.betterWakeUpButton:
                for(int i=0; i<6;i++){
                    list.get(i).setBackgroundResource(R.drawable.multi_choosing_button);
                }
                betterSleep.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                goal = 3;
                break;
            case R.id.easierWakeUpTextView:
                for(int i=0; i<6;i++){
                    list.get(i).setBackgroundResource(R.drawable.multi_choosing_button);
                }
                easierWakeUpButton.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                goal = 3;
                break;
            case R.id.easierWakeUpImageView:
                for(int i=0; i<6;i++){
                    list.get(i).setBackgroundResource(R.drawable.multi_choosing_button);
                }
                easierWakeUpButton.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                goal = 3;

                break;


            case R.id.regulateRythmButton:
                for(int i=0; i<6;i++){
                    list.get(i).setBackgroundResource(R.drawable.multi_choosing_button);
                }
                regulateRythmButton.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                goal = 4;
                break;
            case R.id.regulateRythmTextView:
                for(int i=0; i<6;i++){
                    list.get(i).setBackgroundResource(R.drawable.multi_choosing_button);
                }
                regulateRythmButton.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                goal = 4;
                break;
            case R.id.regulateImageView:
                for(int i=0; i<6;i++){
                    list.get(i).setBackgroundResource(R.drawable.multi_choosing_button);
                }
                regulateRythmButton.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                goal = 4;
                break;


            case R.id.relaxButton:
                for(int i=0; i<6;i++){
                    list.get(i).setBackgroundResource(R.drawable.multi_choosing_button);
                }
                relaxButton.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                goal = 5;
                break;
            case R.id.relaxTextView:
                for(int i=0; i<6;i++){
                    list.get(i).setBackgroundResource(R.drawable.multi_choosing_button);
                }
                relaxButton.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                goal = 5;
                break;
            case R.id.relaxImageView:
                for(int i=0; i<6;i++){
                    list.get(i).setBackgroundResource(R.drawable.multi_choosing_button);
                }
                relaxButton.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                goal = 5;
                break;
        }

    }

}

        






