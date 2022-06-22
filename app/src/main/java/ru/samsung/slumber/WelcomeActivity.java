package ru.samsung.slumber;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener {
    Button continueWelcome;
    DBUser dbUser;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        continueWelcome = findViewById(R.id.continueWelcomeButton);
        continueWelcome.setOnClickListener(this);
        dbUser=new DBUser(this);
        dbUser.insert(NameActivity.name,EmailActivity.email,PasswordActivity.password,GoalActivity.goal,HowOldActivivty.age,
                WakeUpTimeActivity.hoursWakeUp+":"+WakeUpTimeActivity.minutesWakeUp,GoToSleepActivity.hoursAsleep+":"+GoToSleepActivity.minutesAsleep,NeedSleepActivity.need_sleep,RegimeActivity.regime);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.continueWelcomeButton:
                fun();
                Intent intent = new Intent(this, AlarmActivity.class);
                startActivity(intent);
        }
    }
    private void fun() {
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .baseUrl("https://548c-176-59-210-44.eu.ngrok.io/")
                .build();
        RequestInterface service = retrofit.create(RequestInterface.class);
        Call<RegistrationResponse> call = service.nameOfFun(new RegistrationBody("0","0",
                "1", 1, 1,"1","1",1, true));
        call.enqueue(new Callback<RegistrationResponse>() {
            @Override
            public void onResponse(Call<RegistrationResponse> call, Response<RegistrationResponse> response) {
                Log.d("SERVERTAG", String.valueOf(response.code()));
                Log.d("SERVERTAG", String.valueOf(response.body()));

            }

            @Override
            public void onFailure(Call<RegistrationResponse> call, Throwable t) {
                Log.d("SERVERTAG", t.getMessage());
            }
        });
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }
}
