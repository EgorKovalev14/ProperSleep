package ru.samsung.slumber;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class NeedSleepActivity extends AppCompatActivity implements View.OnClickListener {
    Button button1, button2, button3, button4, button5, continueButton;
    ArrayList<Button> buttons = new ArrayList<Button>();
    TextView textName;




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_need_sleep);
        button1 = findViewById(R.id.trackingSleepButton);
        button2 = findViewById(R.id.trackingSleepButton1);
        button3 = findViewById(R.id.trackingSleepButton3);
        button4 = findViewById(R.id.trackingSleepButton4);
        button5 = findViewById(R.id.trackingSleepButton5);
        continueButton = findViewById(R.id.continueNeedSleepButton);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        continueButton.setOnClickListener(this);
        buttons.add(button1);
        buttons.add(button2);
        buttons.add(button3);
        buttons.add(button4);
        buttons.add(button5);
        textName=findViewById(R.id.needNameTextView);
        textName.setText(NameActivity.name);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.trackingSleepButton:
                for(int i=0; i<5;i++){
                    buttons.get(i).setBackgroundResource(R.drawable.multi_choosing_button);
                }
                button1.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                break;
            case R.id.trackingSleepButton1:
                for(int i=0; i<5;i++){
                    buttons.get(i).setBackgroundResource(R.drawable.multi_choosing_button);
                }
                button2.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                break;
            case R.id.trackingSleepButton3:
                for(int i=0; i<5;i++){
                    buttons.get(i).setBackgroundResource(R.drawable.multi_choosing_button);
                }
                button3.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                break;
            case R.id.trackingSleepButton4:
                for(int i=0; i<5;i++){
                    buttons.get(i).setBackgroundResource(R.drawable.multi_choosing_button);
                }
                button4.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                break;
            case R.id.trackingSleepButton5:
                for(int i=0; i<5;i++){
                    buttons.get(i).setBackgroundResource(R.drawable.multi_choosing_button);
                }
                button5.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                break;
            case R.id.continueNeedSleepButton:
                Intent intent = new Intent(this, RegimeActivity.class);
                startActivity(intent);
        }
    }
}
