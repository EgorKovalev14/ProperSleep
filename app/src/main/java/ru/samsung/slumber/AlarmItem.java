package ru.samsung.slumber;

import androidx.appcompat.widget.SwitchCompat;

public class AlarmItem {
    String alarmTime;
    String cycles;
    String timeBeforeWakening;
    Boolean switchCompat;

    public AlarmItem(String alarmTime, String cycles, String timeBeforeWakening, Boolean switchCompat) {
        this.alarmTime = alarmTime;
        this.cycles = cycles;
        this.timeBeforeWakening = timeBeforeWakening;
        this.switchCompat = switchCompat;
    }

    public String getAlarmTime() {
        return alarmTime;
    }

    public void setAlarmTime(String alarmTime) {
        this.alarmTime = alarmTime;
    }

    public String getCycles() {
        return cycles;
    }

    public void setCycles(String cycles) {
        this.cycles = cycles;
    }

    public String getTimeBeforeWakening() {
        return timeBeforeWakening;
    }

    public void setTimeBeforeWakening(String timeBeforeWakening) {
        this.timeBeforeWakening = timeBeforeWakening;
    }

    public Boolean getSwitchCompat() {
        return switchCompat;
    }

    public void setSwitchCompat(Boolean switchCompat) {
        this.switchCompat = switchCompat;
    }
}
