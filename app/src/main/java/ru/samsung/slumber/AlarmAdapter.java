package ru.samsung.slumber;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;

import java.util.ArrayList;
import java.util.Calendar;

public class AlarmAdapter extends ArrayAdapter<AlarmItem> {

    ArrayList<AlarmItem> list;

    public AlarmAdapter(Context context, ArrayList<AlarmItem> list) {
        super(context, R.layout.alarm_item, list);
        this.list=list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.alarm_item, parent, false);
        }

        AlarmItem alarmItem = list.get(position);

        SwitchCompat switchCompat = convertView.findViewById(R.id.switchCompat);
        switchCompat.setChecked(alarmItem.getSwitchCompat());

        TextView alarmTime = convertView.findViewById(R.id.textViewAlarmTime);
        alarmTime.setText(alarmItem.getAlarmTime());

        TextView alarmCycles = convertView.findViewById(R.id.textViewAlarmCycles);
        alarmCycles.setText(alarmItem.getCycles());

        TextView timeBeforeWakening = convertView.findViewById(R.id.textViewTimeBeforeWakening);
        timeBeforeWakening.setText(alarmItem.getTimeBeforeWakening());

        if(switchCompat.isChecked()){
            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.SECOND, 0);
            calendar.set(Calendar.MILLISECOND, 0);
            calendar.set(Calendar.MINUTE, 0);
        }



        return convertView;

    }
}
