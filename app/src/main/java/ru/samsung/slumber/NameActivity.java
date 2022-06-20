package ru.samsung.slumber;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class NameActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;
    EditText editText;
    static String name;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);
        button = findViewById(R.id.continueNameButton);
        button.setOnClickListener(this);
        editText = findViewById(R.id.nameEditText);
        if(getSupportActionBar()!=null)
            this.getSupportActionBar().hide();

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.continueNameButton:
                if (!String.valueOf(editText.getText()).equals("")) {
                    name = String.valueOf(editText.getText());
                    Intent intent = new Intent(this, EmailActivity.class);
                    startActivity(intent);

                }else{
                    Toast toast = new Toast(this);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    View view1 = inflater.inflate(R.layout.toast, null);
                    toast.setView(view1);
                    toast.show();
                }

        }
    }
}
