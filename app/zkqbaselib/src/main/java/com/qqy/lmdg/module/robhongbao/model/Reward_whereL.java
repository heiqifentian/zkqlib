package com.qqy.lmdg.module.robhongbao.model;

public class Reward_whereL {

    private String week_code;
    private String money;
    private String grade_id;

    public String getWeek_code() {
        return week_code;
    }

    public void setWeek_code(String week_code) {
        this.week_code = week_code;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getGrade_id() {
        return grade_id;
    }

    public void setGrade_id(String grade_id) {
        this.grade_id = grade_id;
    }

    @Override
    public String toString() {
        return "Reward_whereL{" +
                "week_code='" + week_code + '\'' +
                ", money='" + money + '\'' +
                ", grade_id=" + grade_id +
                '}';
    }
}
