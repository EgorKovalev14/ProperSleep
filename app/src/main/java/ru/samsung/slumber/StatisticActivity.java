package ru.samsung.slumber;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class StatisticActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView bottomNavigationView;
    BottomNavigationItemView item1, item2, item3, item4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistic);
        bottomNavigationView = findViewById(R.id.bottom_navigation_statistic);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        item1=findViewById(R.id.item_1);
        item2=findViewById(R.id.item_2);
        item3=findViewById(R.id.item_3);
        item4=findViewById(R.id.item_4);
        item1.setChecked(false);
        item2.setChecked(false);
        item3.setChecked(false);
        item4.setChecked(true);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.item_1:
                Intent intent = new Intent(this, TipsActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.item_2:
                Intent intent1 = new Intent(this, ActivityDiary.class);
                startActivity(intent1);
                overridePendingTransition(0, 0);
                break;
            case R.id.item_3:
                Intent intent2 = new Intent(this, AlarmActivity.class);
                startActivity(intent2);
                overridePendingTransition(0, 0);
                break;
        }
        return false;
    }
    }



