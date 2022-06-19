package ru.samsung.slumber;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.LongDef;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Calendar;

public class AlarmActivity extends AppCompatActivity implements View.OnClickListener {
    ListView listView;
    ArrayList<AlarmItem> list;
    ArrayList<AlarmItem> list1;
    ListView listView1;
    AlarmAdapter adapter1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);
        listView = findViewById(R.id.recyclerView1);
        Integer hours = Calendar.getInstance().getTime().getHours();
        Integer minutes = Calendar.getInstance().getTime().getMinutes();
        Integer totalMinutes = hours*60+minutes;
        list = new ArrayList<>();
        list1 = new ArrayList<>();
        AlarmAdapter adapter = new AlarmAdapter(this, list);
        listView.setAdapter(adapter);
        AlarmItem bestItem = new AlarmItem(alarm_time_count(totalMinutes,495), "5 циклов","8 часов 15 мин.", false);
        list.add(bestItem);
        listView1=findViewById(R.id.recyclerView2);

        Integer nap = 25;
        Integer one_cycle = 105;
        Integer two_cycle = 195;
        Integer three_cycles = 285;
        Integer four_cycles = 375;
        Integer five_cycles = 495;
        Log.d("TimeTag", alarm_time_count(0,25));
        Log.d("TimeTag", alarm_time_count(0,105));
        Log.d("TimeTag", alarm_time_count(0,195));
        Log.d("TimeTag", alarm_time_count(0,285));
        Log.d("TimeTag", alarm_time_count(0,375));
        Log.d("TimeTag", alarm_time_count(0,495));







        list1.add(new AlarmItem(alarm_time_count(totalMinutes, 25), "Вздремнуть","25 мин.", false));
        list1.add(new AlarmItem(alarm_time_count(totalMinutes, 105), "1 цикл","1 час 45 мин.", false));
        list1.add(new AlarmItem(alarm_time_count(totalMinutes, 195), "2 цикла","3 часа 15 мин.", false));
        list1.add(new AlarmItem(alarm_time_count(totalMinutes, 285), "3 цикла","4 часа 45 мин.", false));
        list1.add(new AlarmItem(alarm_time_count(totalMinutes, 375), "4 цикла","6 часов 15 минут", false));
        adapter1 = new AlarmAdapter(this,list1);

        listView1.setAdapter(adapter1);



    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){

        }
    }


    public String alarm_time_count(Integer totalMinutes, Integer add){
        Integer alarm_time = totalMinutes+add;
        Integer hours = 0;
        Integer minutes = 0;
        hours = (alarm_time/60)%24;
        minutes=alarm_time%60;
        String shours = String.valueOf(hours);
        String sminutes = String.valueOf(minutes);
        if(shours.length()==1){
            shours = "0"+shours;
        }
        if(sminutes.length()==1){
            sminutes = "0"+sminutes;
        }
        String alarm_time_final = shours+":"+sminutes;
        return alarm_time_final;

    }
}
