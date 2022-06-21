package ru.samsung.slumber;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class WakeUpTimeActivity extends AppCompatActivity implements View.OnClickListener {

    Button arrowUp1;
    Button arrowUp2;
    Button arrowDown1;
    Button continueGoToSleepButton;
    Button arrowDown2;
    TextView goToSleepHourTextView;
    TextView goToSleepMinutesTextView;
    static Integer hoursWakeUp;
    static Integer minutesWakeUp;
    TextView wakeUpName;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wake_up_time);
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
        hoursWakeUp = 0;
        minutesWakeUp=0;
        goToSleepHourTextView.setText("0"+Integer.toString(hoursWakeUp));
        continueGoToSleepButton = findViewById(R.id.continueGoToSleepButton);
        wakeUpName = findViewById(R.id.wakeUpTextView);
        wakeUpName.setText(NameActivity.name);
        continueGoToSleepButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.buttonUp1:
                hoursWakeUp=(hoursWakeUp+1)%24;
                if(hoursWakeUp<10){
                    goToSleepHourTextView.setText("0"+Integer.toString(hoursWakeUp));
                }else{
                    goToSleepHourTextView.setText(hoursWakeUp.toString());
                }
                break;

            case R.id.buttonDown1:
                if(hoursWakeUp!=0){
                    hoursWakeUp-=1;
                }else{
                    hoursWakeUp=23;
                }

                if(hoursWakeUp<10){
                    goToSleepHourTextView.setText("0"+Integer.toString(hoursWakeUp));
                }else{
                    goToSleepHourTextView.setText(hoursWakeUp.toString());
                }
                break;
            case R.id.buttonUp2:
                minutesWakeUp=(minutesWakeUp+1)%60;
                if(minutesWakeUp<10){
                    goToSleepMinutesTextView.setText("0"+Integer.toString(minutesWakeUp));
                }else{
                    goToSleepMinutesTextView.setText(minutesWakeUp.toString());
                }
                break;

            case R.id.buttonDown2:
                if(minutesWakeUp!=0){
                    minutesWakeUp-=1;
                }else{
                    minutesWakeUp=59;
                }

                if(minutesWakeUp<10){
                    goToSleepMinutesTextView.setText("0"+Integer.toString(minutesWakeUp));
                }else{
                    goToSleepMinutesTextView.setText(minutesWakeUp.toString());
                }
                break;
            case R.id.continueGoToSleepButton:
                Log.d("asleepTag", hoursWakeUp+" "+minutesWakeUp);
                Intent intent = new Intent(this, NeedSleepActivity.class);
                startActivity(intent);

        }
    }
}
