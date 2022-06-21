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
    static Integer hoursAsleep;
    static Integer minutesAsleep;
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
        hoursAsleep = 0;
        minutesAsleep=0;
        goToSleepHourTextView.setText("0"+Integer.toString(hoursAsleep));
        continueGoToSleepButton = findViewById(R.id.continueGoToSleepButton);
        continueGoToSleepButton.setOnClickListener(this);
        goToSleepName = findViewById(R.id.goToSleepTextView);
        goToSleepName.setText(NameActivity.name);




    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.buttonUp1:
                hoursAsleep=(hoursAsleep+1)%24;
                if(hoursAsleep<10){
                    goToSleepHourTextView.setText("0"+Integer.toString(hoursAsleep));
                }else{
                    goToSleepHourTextView.setText(hoursAsleep.toString());
                }
                break;

            case R.id.buttonDown1:
                if(hoursAsleep!=0){
                    hoursAsleep-=1;
                }else{
                   hoursAsleep=23;
                }
//                hours=Math.abs(hours-1)%24;

                if(hoursAsleep<10){
                    goToSleepHourTextView.setText("0"+Integer.toString(hoursAsleep));
                }else{
                    goToSleepHourTextView.setText(hoursAsleep.toString());
                }
                break;
            case R.id.buttonUp2:
                minutesAsleep=(minutesAsleep+1)%60;
                if(minutesAsleep<10){
                    goToSleepMinutesTextView.setText("0"+Integer.toString(minutesAsleep));
                }else{
                    goToSleepMinutesTextView.setText(minutesAsleep.toString());
                }
                break;

            case R.id.buttonDown2:
                if(minutesAsleep!=0){
                    minutesAsleep-=1;
                }else{
                    minutesAsleep=59;
                }

                if(minutesAsleep<10){
                    goToSleepMinutesTextView.setText("0"+Integer.toString(minutesAsleep));
                }else{
                    goToSleepMinutesTextView.setText(minutesAsleep.toString());
                }
                break;
            case R.id.continueGoToSleepButton:
                Log.d("asleepTag", hoursAsleep + " "+minutesAsleep);
                Intent intent = new Intent(this, WakeUpTimeActivity.class);
                startActivity(intent);


        }
    }
}
