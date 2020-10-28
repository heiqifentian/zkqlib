package com.qqy.lmdg.ibean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class IGetRoomConfig {

    private int id;
    private int fgs_id;
    private String inlet_display;
    private String status;
    private String count_display;
    //后台数据格式问题，这里需要按字符串取出后再做解析
    private Talk_conditionsL talk_conditions_x;
    private Open_date_rangeL open_date_range_x;
    private List<Opend_time_rangeL> opend_time_range_x;
    private String talk_conditions;
    private String open_date_range;
    private String opend_time_range;
    private int talk_limit;
    private String in_effect;
    private int room_num;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFgs_id() {
        return fgs_id;
    }

    public void setFgs_id(int fgs_id) {
        this.fgs_id = fgs_id;
    }

    public String getInlet_display() {
        return inlet_display;
    }

    public void setInlet_display(String inlet_display) {
        this.inlet_display = inlet_display;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCount_display() {
        return count_display==null?"":count_display;
    }

    public void setCount_display(String count_display) {
        this.count_display = count_display;
    }


    public String getOpen_date_range() {
        return open_date_range;
    }

    public void setOpen_date_range(String open_date_range) {
        this.open_date_range = open_date_range;
    }

    public String getOpend_time_range() {
        return opend_time_range;
    }

    public void setOpend_time_range(String opend_time_range) {
        this.opend_time_range = opend_time_range;
    }

    public Talk_conditionsL getTalk_conditions_x() {
        return talk_conditions_x;
    }

    public void setTalk_conditions_x(Talk_conditionsL talk_conditions_x) {
        this.talk_conditions_x = talk_conditions_x;
    }

    public Open_date_rangeL getOpen_date_range_x() {
        return open_date_range_x;
    }

    public void setOpen_date_range_x(Open_date_rangeL open_date_range_x) {
        this.open_date_range_x = open_date_range_x;
    }

    public List<Opend_time_rangeL> getOpend_time_range_x() {
        return opend_time_range_x;
    }

    public void setOpend_time_range_x(List<Opend_time_rangeL> opend_time_range_x) {
        this.opend_time_range_x = opend_time_range_x;
    }

    public String getTalk_conditions() {
        return talk_conditions;
    }

    public void setTalk_conditions(String talk_conditions) {
        this.talk_conditions = talk_conditions;
    }

    public int getTalk_limit() {
        return talk_limit;
    }

    public void setTalk_limit(int talk_limit) {
        this.talk_limit = talk_limit;
    }

    public String getIn_effect() {
        return in_effect;
    }

    public void setIn_effect(String in_effect) {
        this.in_effect = in_effect;
    }

    public int getRoom_num() {
        return room_num;
    }

    public void setRoom_num(int room_num) {
        this.room_num = room_num;
    }

    @Override
    public String toString() {
        return "IGetRoomConfig{" +
                "id=" + id +
                ", fgs_id=" + fgs_id +
                ", inlet_display='" + inlet_display + '\'' +
                ", status='" + status + '\'' +
                ", count_display='" + count_display + '\'' +
                ", talk_conditions_x=" + talk_conditions_x +
                ", open_date_range_x=" + open_date_range_x +
                ", opend_time_range_x=" + opend_time_range_x +
                ", talk_conditions='" + talk_conditions + '\'' +
                ", open_date_range='" + open_date_range + '\'' +
                ", opend_time_range='" + opend_time_range + '\'' +
                ", talk_limit=" + talk_limit +
                ", in_effect='" + in_effect + '\'' +
                ", room_num=" + room_num +
                '}';
    }

    public class Talk_conditionsL {
        private ResumeL resume;
        private RemainMoneyL remainMoney;
        private TodayPayMoneyL todayPayMoney;
        private LevelL level;
        private HierarchyL hierarchy;

        public ResumeL getResume() {
            return resume;
        }

        public void setResume(ResumeL resume) {
            this.resume = resume;
        }

        public RemainMoneyL getRemainMoney() {
            return remainMoney;
        }

        public void setRemainMoney(RemainMoneyL remainMoney) {
            this.remainMoney = remainMoney;
        }

        public TodayPayMoneyL getTodayPayMoney() {
            return todayPayMoney;
        }

        public void setTodayPayMoney(TodayPayMoneyL todayPayMoney) {
            this.todayPayMoney = todayPayMoney;
        }

        public LevelL getLevel() {
            return level;
        }

        public void setLevel(LevelL level) {
            this.level = level;
        }

        public HierarchyL getHierarchy() {
            return hierarchy;
        }

        public void setHierarchy(HierarchyL hierarchy) {
            this.hierarchy = hierarchy;
        }

        @Override
        public String toString() {
            return "Talk_conditionsL{" +
                    "resume=" + resume +
                    ", remainMoney=" + remainMoney +
                    ", todayPayMoney=" + todayPayMoney +
                    ", level=" + level +
                    ", hierarchy=" + hierarchy +
                    '}';
        }

        public class ResumeL {
            private boolean status;
            private long value;
            private String desc;
            private String label;

            public boolean isStatus() {
                return status;
            }

            public void setStatus(boolean status) {
                this.status = status;
            }

            public long getValue() {
                return value;
            }

            public void setValue(long value) {
                this.value = value;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getLabel() {
                return label;
            }

            public void setLabel(String label) {
                this.label = label;
            }

            @Override
            public String toString() {
                return "ResumeL{" +
                        "status=" + status +
                        ", value=" + value +
                        ", desc='" + desc + '\'' +
                        ", label='" + label + '\'' +
                        '}';
            }
        }

        public class RemainMoneyL {
            private boolean status;
            private long value;
            private String desc;
            private String label;

            public boolean isStatus() {
                return status;
            }

            public void setStatus(boolean status) {
                this.status = status;
            }

            public long getValue() {
                return value;
            }

            public void setValue(long value) {
                this.value = value;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getLabel() {
                return label;
            }

            public void setLabel(String label) {
                this.label = label;
            }

            @Override
            public String toString() {
                return "RemainMoneyL{" +
                        "status=" + status +
                        ", value=" + value +
                        ", desc='" + desc + '\'' +
                        ", label='" + label + '\'' +
                        '}';
            }
        }

        public class TodayPayMoneyL {
            private boolean status;
            private long value;
            private String desc;
            private String label;

            public boolean isStatus() {
                return status;
            }

            public void setStatus(boolean status) {
                this.status = status;
            }

            public long getValue() {
                return value;
            }

            public void setValue(long value) {
                this.value = value;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getLabel() {
                return label;
            }

            public void setLabel(String label) {
                this.label = label;
            }

            @Override
            public String toString() {
                return "TodayPayMoneyL{" +
                        "status=" + status +
                        ", value=" + value +
                        ", desc='" + desc + '\'' +
                        ", label='" + label + '\'' +
                        '}';
            }
        }

        public class LevelL {
            private boolean status;
            private long value;
            private String desc;
            private String grade_name;
            private String label;

            public boolean isStatus() {
                return status;
            }

            public void setStatus(boolean status) {
                this.status = status;
            }

            public long getValue() {
                return value;
            }

            public void setValue(long value) {
                this.value = value;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getLabel() {
                return label;
            }

            public void setLabel(String label) {
                this.label = label;
            }

            public String getGrade_name() {
                return grade_name;
            }

            public void setGrade_name(String grade_name) {
                this.grade_name = grade_name;
            }

            @Override
            public String toString() {
                return "LevelL{" +
                        "status=" + status +
                        ", value=" + value +
                        ", desc='" + desc + '\'' +
                        ", grade_name='" + grade_name + '\'' +
                        ", label='" + label + '\'' +
                        '}';
            }
        }

        public class HierarchyL {
            private boolean status;
            private List<String> value;
            private String desc;
            private String label;

            public boolean isStatus() {
                return status;
            }

            public void setStatus(boolean status) {
                this.status = status;
            }

            public List<String> getValue() {
                return value;
            }

            public void setValue(List<String> value) {
                this.value = value;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getLabel() {
                return label;
            }

            public void setLabel(String label) {
                this.label = label;
            }


            @Override
            public String toString() {
                return "HierarchyL{" +
                        "status=" + status +
                        ", value=" + value +
                        ", desc='" + desc + '\'' +
                        ", label='" + label + '\'' +
                        '}';
            }
        }
    }

    public class Open_date_rangeL {
        @SerializedName("0")
        private long start;
        @SerializedName("1")
        private long end;

        public long getStart() {
            return start;
        }

        public void setStart(long start) {
            this.start = start;
        }

        public long getEnd() {
            return end;
        }

        public void setEnd(long end) {
            this.end = end;
        }

        @Override
        public String toString() {
            return "Open_date_rangeL{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }
    }

    public class Opend_time_rangeL {
        @SerializedName("0")
        private long start;
        @SerializedName("1")
        private long end;

        public long getStart() {
            return start;
        }

        public void setStart(long start) {
            this.start = start;
        }

        public long getEnd() {
            return end;
        }

        public void setEnd(long end) {
            this.end = end;
        }

        @Override
        public String toString() {
            return "Opend_time_rangeL{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }
    }

}
