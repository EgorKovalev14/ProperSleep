package ru.samsung.slumber;

import android.content.Context;
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

        TextView alarmTime = convertView.findViewById(R.id.textViewAlarmTime);
        alarmTime.setText(alarmItem.getAlarmTime());

        TextView alarmCycles = convertView.findViewById(R.id.textViewAlarmCycles);
        alarmCycles.setText(alarmItem.getCycles());

        TextView timeBeforeWakening = convertView.findViewById(R.id.textViewTimeBeforeWakening);
        timeBeforeWakening.setText(alarmItem.getTimeBeforeWakening());

        SwitchCompat switchCompat = convertView.findViewById(R.id.switchCompat);
        switchCompat.setChecked(alarmItem.getSwitchCompat());

        return convertView;

    }
}
