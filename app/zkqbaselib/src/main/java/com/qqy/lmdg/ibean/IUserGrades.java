package com.qqy.lmdg.ibean;

public class IUserGrades {

    private int id;
    private String name;
    private String consume_num;
    private int admin_id;
    private String created_date;
    private String update_date;
    private int status;
    private int grade_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConsume_num() {
        return consume_num;
    }

    public void setConsume_num(String consume_num) {
        this.consume_num = consume_num;
    }

    public int getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(String update_date) {
        this.update_date = update_date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getGrade_id() {
        return grade_id;
    }

    public void setGrade_id(int grade_id) {
        this.grade_id = grade_id;
    }

    @Override
    public String toString() {
        return "IUserGrades{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", consume_num='" + consume_num + '\'' +
                ", admin_id=" + admin_id +
                ", created_date='" + created_date + '\'' +
                ", update_date='" + update_date + '\'' +
                ", status=" + status +
                ", grade_id=" + grade_id +
                '}';
    }
}
