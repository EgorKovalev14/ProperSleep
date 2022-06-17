package ru.samsung.slumber;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GoToSleepActivity extends AppCompatActivity implements View.OnClickListener {
    Button arrowUp1;
    Button arrowUp2;
    Button arrowDown1;
    Button continueGoToSleepButton;
    Button arrowDown2;
    TextView goToSleepHourTextView;
    TextView goToSleepMinutesTextView;
    Integer hours;
    Integer minutes;
    TextView goToSleepName;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_to_sleep_time);
        goToSleepMinutesTextView=findViewById(R.id.textViewGoToSleepMinute);
        arrowUp1 = findViewById(R.id.buttonUp1);
        arrowDown1 = findViewById(R.id.buttonDown1);
        arrowDown1.setOnClickListener(this);
        arrowUp1.setOnClickListener(this);
        arrowUp2 = findViewById(R.id.buttonUp2);
        arrowDown2 = findViewById(R.id.buttonDown2);
        arrowDown2.setOnClickListener(this);
        arrowUp2.setOnClickListener(this);
        goToSleepHourTextView = findViewById(R.id.textViewGoToSleepHour);
        hours = 0;
        minutes=0;
        goToSleepHourTextView.setText("0"+Integer.toString(hours));
        continueGoToSleepButton = findViewById(R.id.continueGoToSleepButton);
        continueGoToSleepButton.setOnClickListener(this);
        goToSleepName = findViewById(R.id.goToSleepTextView);
        goToSleepName.setText(NameActivity.name);



    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.buttonUp1:
                hours=(hours+1)%24;
                if(hours<10){
                    goToSleepHourTextView.setText("0"+Integer.toString(hours));
                }else{
                    goToSleepHourTextView.setText(hours.toString());
                }
                break;

            case R.id.buttonDown1:
                if(hours!=0){
                    hours-=1;
                }else{
                   hours=23;
                }
//                hours=Math.abs(hours-1)%24;

                if(hours<10){
                    goToSleepHourTextView.setText("0"+Integer.toString(hours));
                }else{
                    goToSleepHourTextView.setText(hours.toString());
                }
                break;
            case R.id.buttonUp2:
                minutes=(minutes+1)%60;
                if(minutes<10){
                    goToSleepMinutesTextView.setText("0"+Integer.toString(minutes));
                }else{
                    goToSleepMinutesTextView.setText(minutes.toString());
                }
                break;

            case R.id.buttonDown2:
                if(minutes!=0){
                    minutes-=1;
                }else{
                    minutes=59;
                }

                if(minutes<10){
                    goToSleepMinutesTextView.setText("0"+Integer.toString(minutes));
                }else{
                    goToSleepMinutesTextView.setText(minutes.toString());
                }
                break;
            case R.id.continueGoToSleepButton:
                Intent intent = new Intent(this, WakeUpTimeActivity.class);
                startActivity(intent);

        }
    }
}
