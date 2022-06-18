package ru.samsung.slumber;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AlarmActivity extends AppCompatActivity implements View.OnClickListener {
    ListView listView;
    ArrayList<AlarmItem> list;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);
        listView = findViewById(R.id.recyclerView1);
        list = new ArrayList<>();
        AlarmAdapter adapter = new AlarmAdapter(this, list);
        listView.setAdapter(adapter);
        AlarmItem bestItem = new AlarmItem("22:22", "5 циклов","8 часов", true);
        list.add(bestItem);
    }

    @Override
    public void onClick(View view) {

    }
}
