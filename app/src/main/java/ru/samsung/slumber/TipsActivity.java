package ru.samsung.slumber;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class TipsActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    BottomNavigationItemView item11, item12, item13, item14;
    BottomNavigationView navigation_view1;
    ImageView clockView, sleepingOnCarpet;
    ImageView tree, melatonin,sreda;
    TextView four, clocktext, textView15, textView17;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
        navigation_view1 = findViewById(R.id.bottom_navigation_tips);
        navigation_view1.setOnNavigationItemSelectedListener(this);
        item11 = findViewById(R.id.item_1);
        item13=findViewById(R.id.item_3);
        clockView = findViewById(R.id.imageView6);
        clockView.setOnClickListener(this);
        tree = findViewById(R.id.imageView7);
        tree.setOnClickListener(this);
        sleepingOnCarpet = findViewById(R.id.imageView10);
        sleepingOnCarpet.setOnClickListener(this);
        four = findViewById(R.id.textView14);
        four.setOnClickListener(this);
        clocktext=findViewById(R.id.textView16);
        clocktext.setOnClickListener(this);
        melatonin = findViewById(R.id.imageView7);
        melatonin.setOnClickListener(this);
        textView15=findViewById(R.id.textView15);
        textView15.setOnClickListener(this);
        sreda = findViewById(R.id.imageView8);
        sreda.setOnClickListener(this);
        textView17=findViewById(R.id.textView17);
        textView17.setOnClickListener(this);
        item12=findViewById(R.id.item_2);
        item14=findViewById(R.id.item_4);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.item_3:
                Intent intent = new Intent(this, AlarmActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.item_2:
                Intent intent1 = new Intent(this,ActivityDiary.class);
                startActivity(intent1);
                overridePendingTransition(0, 0);
                break;
            case R.id.item_4:
                Intent intent2 = new Intent(this,StatisticActivity.class);
                startActivity(intent2);
                overridePendingTransition(0, 0);
        }
        return false;
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.imageView6: //часы
                Intent intent2 = new Intent(this, ActivityClock.class);
                startActivity(intent2);
                break;
            case R.id.textView16: //часы
                Intent intent4 = new Intent(this, ActivityClock.class);
                startActivity(intent4);
                break;
            case R.id.imageView7: //дерево
                Intent intent69 = new Intent(this, ActivityMelatonin.class);
                startActivity(intent69);
                break;
            case R.id.textView15: //дерево
                Intent intent68 = new Intent(this, ActivityMelatonin.class);
                startActivity(intent68);
                break;
            case R.id.imageView10:    // 4 часа сна
                Intent intent = new Intent(this, FourHourActivity.class);
                startActivity(intent);
                break;
            case R.id.textView14:    // 4 часа сна
                Intent intent1 = new Intent(this, FourHourActivity.class);
                startActivity(intent1);
                break;
            case R.id.imageView8:
                Intent intent111 = new Intent(this,GoodSleepActivityTip.class);
                startActivity(intent111);
                break;
            case R.id.textView17:
                Intent intent112 = new Intent(this,GoodSleepActivityTip.class);
                startActivity(intent112);
                break;

        }

    }
}
