package ru.samsung.slumber;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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
                name = String.valueOf(editText.getText());
                Log.d("MYTAG", "onClick: " + "продолжить");
                Intent intent = new Intent(this, EmailActivity.class);
                startActivity(intent);
        }
    }
}
