package com.zkq.zkqbaselib.module.robhongbao.model;

public class UIRobhong_Jiangjin_Model {

    private String money;
    private String damaliang;
    private String datetime;
    private String stateName;
    private int state;

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getDamaliang() {
        return damaliang;
    }

    public void setDamaliang(String damaliang) {
        this.damaliang = damaliang;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "UIRobhong_Jiangjin_Model{" +
                "money='" + money + '\'' +
                ", damaliang='" + damaliang + '\'' +
                ", datetime='" + datetime + '\'' +
                ", stateName='" + stateName + '\'' +
                ", state=" + state +
                '}';
    }
}
