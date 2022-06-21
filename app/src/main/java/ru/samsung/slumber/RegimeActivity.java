package ru.samsung.slumber;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class RegimeActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1, button2, button3, continueRegimeButton;
    TextView textName;
    ArrayList<Button> list;
    static Boolean regime = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regime);
        button1=findViewById(R.id.trackingSleepButton1);
        button2=findViewById(R.id.trackingSleepButton2);
        button3=findViewById(R.id.trackingSleepButton3);
        continueRegimeButton=findViewById(R.id.continueRegimeButton);
        textName = findViewById(R.id.regimeNameTextView);
        textName.setText(NameActivity.name);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        continueRegimeButton.setOnClickListener(this);
        list = new ArrayList<Button>();
        list.add(button1);
        list.add(button2);
        list.add(button3);


    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.trackingSleepButton2:
                for(int i=0; i<3;i++){
                    list.get(i).setBackgroundResource(R.drawable.multi_choosing_button);
                }
                button2.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                button2.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                Log.d("regimeTAG", "0");
                regime = true;
                break;
            case R.id.trackingSleepButton1:
                for(int i=0; i<3;i++){
                    list.get(i).setBackgroundResource(R.drawable.multi_choosing_button);
                }
                button1.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                Log.d("regimeTAG", "1");
                regime = false;
                break;
            case R.id.trackingSleepButton3:
                for(int i=0; i<3;i++){
                    list.get(i).setBackgroundResource(R.drawable.multi_choosing_button);
                }
                button3.setBackgroundResource(R.drawable.multi_choosing_button_stroke);
                Log.d("regimeTAG", "2");
                regime=false;
                break;
            case R.id.continueRegimeButton:
                if(regime!=null){
                    Intent intent = new Intent(this, WelcomeActivity.class);
                    startActivity(intent);
                }

        }

    }
}
