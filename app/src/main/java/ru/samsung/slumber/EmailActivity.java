package ru.samsung.slumber;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;
    static String email;
    EditText editText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        button = findViewById(R.id.continueEmailButton);
        button.setOnClickListener(this);
        editText = findViewById(R.id.emailEditText);
        if(getSupportActionBar()!=null)
            this.getSupportActionBar().hide();
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.continueEmailButton:
                String sEdit = String.valueOf(editText.getText());
                if(isEmailValid(sEdit)){
                    email = String.valueOf(editText.getText());
                    Intent intent = new Intent(this, PasswordActivity.class);
                    startActivity(intent);
                }else{
                    Toast toast = new Toast(this);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    View view1 = inflater.inflate(R.layout.toast_email, null);
                    toast.setView(view1);
                    toast.show();
                }

        }
    }

    public static boolean isEmailValid(String email) {
        final Pattern EMAIL_REGEX = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE);
        return EMAIL_REGEX.matcher(email).matches();
    }
}
