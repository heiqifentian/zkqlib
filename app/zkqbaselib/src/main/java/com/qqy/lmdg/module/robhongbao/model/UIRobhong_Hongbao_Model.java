package com.qqy.lmdg.module.robhongbao.model;

public class UIRobhong_Hongbao_Model {
    private int ids;
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

    public int getIds() {
        return ids;
    }

    public void setIds(int ids) {
        this.ids = ids;
    }

    @Override
    public String toString() {
        return "UIRobhong_Hongbao_Model{" +
                "ids=" + ids +
                ", money='" + money + '\'' +
                ", damaliang='" + damaliang + '\'' +
                ", datetime='" + datetime + '\'' +
                ", stateName='" + stateName + '\'' +
                ", state=" + state +
                '}';
    }
}
