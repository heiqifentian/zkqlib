package com.zkq.zkqbaselib.ibean;

public class IShow_user_redpack {

    private int id;
    private String title;
    private long show_start_time;
    private long show_end_time;
    private long active_start_time;
    private long active_end_time;
    private long end_time;
    private String reward_where;
    private int init_number;
    private int received_number;
    private String red_money;
    private String received_money;
    private String code_amount;
    private int is_active;
    private int fgs_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getShow_start_time() {
        return show_start_time;
    }

    public void setShow_start_time(long show_start_time) {
        this.show_start_time = show_start_time;
    }

    public long getShow_end_time() {
        return show_end_time;
    }

    public void setShow_end_time(long show_end_time) {
        this.show_end_time = show_end_time;
    }

    public long getActive_start_time() {
        return active_start_time;
    }

    public void setActive_start_time(long active_start_time) {
        this.active_start_time = active_start_time;
    }

    public long getActive_end_time() {
        return active_end_time;
    }

    public void setActive_end_time(long active_end_time) {
        this.active_end_time = active_end_time;
    }

    public long getEnd_time() {
        return end_time;
    }

    public void setEnd_time(long end_time) {
        this.end_time = end_time;
    }

    public String getReward_where() {
        return reward_where;
    }

    public void setReward_where(String reward_where) {
        this.reward_where = reward_where;
    }

    public int getInit_number() {
        return init_number;
    }

    public void setInit_number(int init_number) {
        this.init_number = init_number;
    }

    public int getReceived_number() {
        return received_number;
    }

    public void setReceived_number(int received_number) {
        this.received_number = received_number;
    }

    public String getRed_money() {
        return red_money;
    }

    public void setRed_money(String red_money) {
        this.red_money = red_money;
    }

    public String getReceived_money() {
        return received_money;
    }

    public void setReceived_money(String received_money) {
        this.received_money = received_money;
    }

    public String getCode_amount() {
        return code_amount;
    }

    public void setCode_amount(String code_amount) {
        this.code_amount = code_amount;
    }

    public int getIs_active() {
        return is_active;
    }

    public void setIs_active(int is_active) {
        this.is_active = is_active;
    }

    public int getFgs_id() {
        return fgs_id;
    }

    public void setFgs_id(int fgs_id) {
        this.fgs_id = fgs_id;
    }

    @Override
    public String toString() {
        return "IShow_user_redpack{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", show_start_time=" + show_start_time +
                ", show_end_time=" + show_end_time +
                ", active_start_time=" + active_start_time +
                ", active_end_time=" + active_end_time +
                ", end_time=" + end_time +
                ", reward_where='" + reward_where + '\'' +
                ", init_number=" + init_number +
                ", received_number=" + received_number +
                ", red_money='" + red_money + '\'' +
                ", received_money='" + received_money + '\'' +
                ", code_amount='" + code_amount + '\'' +
                ", is_active=" + is_active +
                ", fgs_id=" + fgs_id +
                '}';
    }
}
