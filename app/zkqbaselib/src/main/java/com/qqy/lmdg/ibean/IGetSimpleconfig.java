package com.qqy.lmdg.ibean;

import java.util.List;

public class IGetSimpleconfig {

    private int id;
    private String condition;
    private int type;
    private int admin_id;
    private String created_at;
    private String updated_at;
    private int status;
    private String hold_up_day;
    private String start_date;
    private String float_value;
    private String limit_bottom;
    private String limit_top;
    private String limit_total;
    private int solf_delete;
    private int delay_days;
    private int display_status;
    private String value;
    private String count_condition;
    private List<Count_conditionL> count_conditionLList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getHold_up_day() {
        return hold_up_day;
    }

    public void setHold_up_day(String hold_up_day) {
        this.hold_up_day = hold_up_day;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getLimit_bottom() {
        return limit_bottom;
    }

    public void setLimit_bottom(String limit_bottom) {
        this.limit_bottom = limit_bottom;
    }

    public String getLimit_top() {
        return limit_top;
    }

    public void setLimit_top(String limit_top) {
        this.limit_top = limit_top;
    }

    public String getLimit_total() {
        return limit_total;
    }

    public void setLimit_total(String limit_total) {
        this.limit_total = limit_total;
    }

    public int getSolf_delete() {
        return solf_delete;
    }

    public void setSolf_delete(int solf_delete) {
        this.solf_delete = solf_delete;
    }

    public int getDelay_days() {
        return delay_days;
    }

    public void setDelay_days(int delay_days) {
        this.delay_days = delay_days;
    }

    public int getDisplay_status() {
        return display_status;
    }

    public void setDisplay_status(int display_status) {
        this.display_status = display_status;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getCount_condition() {
        return count_condition;
    }

    public void setCount_condition(String count_condition) {
        this.count_condition = count_condition;
    }

    public String getFloat_value() {
        return float_value;
    }

    public void setFloat_value(String float_value) {
        this.float_value = float_value;
    }

    public List<Count_conditionL> getCount_conditionLList() {
        return count_conditionLList;
    }

    public void setCount_conditionLList(List<Count_conditionL> count_conditionLList) {
        this.count_conditionLList = count_conditionLList;
    }

    public class Count_conditionL
    {
        private String consumed;
        private float value;

        public String getConsumed() {
            return consumed;
        }

        public void setConsumed(String consumed) {
            this.consumed = consumed;
        }

        public float getValue() {
            return value;
        }

        public void setValue(float value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Count_conditionL{" +
                    "consumed='" + consumed + '\'' +
                    ", value=" + value +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "IGetSimpleconfig{" +
                "id=" + id +
                ", condition='" + condition + '\'' +
                ", type=" + type +
                ", admin_id=" + admin_id +
                ", created_at='" + created_at + '\'' +
                ", updated_at='" + updated_at + '\'' +
                ", status=" + status +
                ", hold_up_day='" + hold_up_day + '\'' +
                ", start_date='" + start_date + '\'' +
                ", float_value='" + float_value + '\'' +
                ", limit_bottom='" + limit_bottom + '\'' +
                ", limit_top='" + limit_top + '\'' +
                ", limit_total='" + limit_total + '\'' +
                ", solf_delete=" + solf_delete +
                ", delay_days=" + delay_days +
                ", display_status=" + display_status +
                ", value='" + value + '\'' +
                ", count_condition='" + count_condition + '\'' +
                ", count_conditionLList=" + count_conditionLList +
                '}';
    }
}
