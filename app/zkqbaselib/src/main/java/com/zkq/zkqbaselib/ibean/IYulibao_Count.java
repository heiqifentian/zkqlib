package com.zkq.zkqbaselib.ibean;

public class IYulibao_Count {
    private int id;
    private int user_id;
    private int admin_id;
    private String username;
    private String total_money;
    private String useful_money;
    private String created_at;
    private String updated_at;
    private String total_insterest;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTotal_money() {
        return total_money;
    }

    public void setTotal_money(String total_money) {
        this.total_money = total_money;
    }

    public String getUseful_money() {
        return useful_money;
    }

    public void setUseful_money(String useful_money) {
        this.useful_money = useful_money;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getTotal_insterest() {
        return total_insterest;
    }

    public void setTotal_insterest(String total_insterest) {
        this.total_insterest = total_insterest;
    }

    @Override
    public String toString() {
        return "IYulibao_Count{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", admin_id=" + admin_id +
                ", username='" + username + '\'' +
                ", total_money='" + total_money + '\'' +
                ", useful_money='" + useful_money + '\'' +
                ", created_at='" + created_at + '\'' +
                ", updated_at='" + updated_at + '\'' +
                ", total_insterest='" + total_insterest + '\'' +
                '}';
    }
}
