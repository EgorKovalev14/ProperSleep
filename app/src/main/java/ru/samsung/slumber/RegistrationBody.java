package ru.samsung.slumber;

public class RegistrationBody{
    public String email;
    public String name;
    public String password;
    public Integer goal;
    public Integer age_group;
    public String wakeup_time;
    public String bedtime;
    public Integer goodsleep_hours;
    public Boolean regime_compliance;

    public RegistrationBody(String email,String name,  String password, Integer goal, Integer age, String wake_time, String go_sleep_time, Integer need_sleep, Boolean regime) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.goal = goal;
        this.age_group = age;
        this.wakeup_time = wake_time;
        this.bedtime = go_sleep_time;
        this.goodsleep_hours = need_sleep;
        this.regime_compliance = regime;
    }
}
