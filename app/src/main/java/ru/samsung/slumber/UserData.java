package ru.samsung.slumber;

public class UserData {
    String name;
    String email;
    String password;
    String user_id;
    Integer goal;
    Integer age;
    String wake_up_time;
    String go_to_sleep_time;
    Integer sleep_hours;
    Boolean regime;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUser_id() {
        return user_id;
    }

    public Integer getGoal() {
        return goal;
    }

    public Integer getAge() {
        return age;
    }

    public String getWake_up_time() {
        return wake_up_time;
    }

    public String getGo_to_sleep_time() {
        return go_to_sleep_time;
    }

    public Integer getSleep_hours() {
        return sleep_hours;
    }

    public Boolean getRegime() {
        return regime;
    }

    public UserData(String name, String email, String password, String user_id, Integer goal, Integer age, String wake_up_time, String go_to_sleep_time, Integer sleep_hours, Boolean regime) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.user_id = user_id;
        this.goal = goal;
        this.age = age;
        this.wake_up_time = wake_up_time;
        this.go_to_sleep_time = go_to_sleep_time;
        this.sleep_hours = sleep_hours;
        this.regime = regime;
    }
}
