package ru.samsung.slumber;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.regex.Pattern;

public class PasswordActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonContinue;
    EditText editText;
    static String password;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        buttonContinue = findViewById(R.id.continuePasswordButton);
        editText = findViewById(R.id.passwordEditText);
        buttonContinue.setOnClickListener(this);
        if(getSupportActionBar()!=null)
            this.getSupportActionBar().hide();


    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.continuePasswordButton:
                if(isPasswordValid(String.valueOf(editText.getText()))){
                    password = String.valueOf(editText.getText());
                    Intent intent = new Intent(this, GoalActivity.class);
                    startActivity(intent);
                }else{
                    Toast toast = new Toast(this);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    View view1 = inflater.inflate(R.layout.toast_password, null);
                    toast.setView(view1);
                    toast.show();
                }


        }
    }
    public static boolean isPasswordValid(String password) {
        final Pattern EMAIL_REGEX = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}", Pattern.CASE_INSENSITIVE);
        return EMAIL_REGEX.matcher(password).matches();
    }
}
