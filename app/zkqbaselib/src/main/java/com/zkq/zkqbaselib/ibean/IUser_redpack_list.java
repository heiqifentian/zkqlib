package com.zkq.zkqbaselib.ibean;

public class IUser_redpack_list {

    private int id;
    private int red_pack_id;
    private int user_id;
    private String user_name;
    private String bonus_money;
    private int fgs_id;
    private int status;
    private long created_at;
    private Red_packL red_pack;


    public class Red_packL {
        private int id;
        private String title;
        private String reward_where;
        private int is_active;
        private int init_number;
        private String code_amount;
        private long end_time;
        private int received_number;
        private String red_money;
        private String received_money;

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

        public String getReward_where() {
            return reward_where;
        }

        public void setReward_where(String reward_where) {
            this.reward_where = reward_where;
        }

        public int getIs_active() {
            return is_active;
        }

        public void setIs_active(int is_active) {
            this.is_active = is_active;
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

        public long getEnd_time() {
            return end_time;
        }

        public void setEnd_time(long end_time) {
            this.end_time = end_time;
        }

        @Override
        public String toString() {
            return "Red_packL{" +
                    "id=" + id +
                    ", title='" + title + '\'' +
                    ", reward_where='" + reward_where + '\'' +
                    ", is_active=" + is_active +
                    ", init_number=" + init_number +
                    ", code_amount='" + code_amount + '\'' +
                    ", end_time=" + end_time +
                    ", received_number=" + received_number +
                    ", red_money='" + red_money + '\'' +
                    ", received_money='" + received_money + '\'' +
                    '}';
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRed_pack_id() {
        return red_pack_id;
    }

    public void setRed_pack_id(int red_pack_id) {
        this.red_pack_id = red_pack_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getBonus_money() {
        return bonus_money;
    }

    public void setBonus_money(String bonus_money) {
        this.bonus_money = bonus_money;
    }

    public int getFgs_id() {
        return fgs_id;
    }

    public void setFgs_id(int fgs_id) {
        this.fgs_id = fgs_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getCreated_at() {
        return created_at;
    }

    public void setCreated_at(long created_at) {
        this.created_at = created_at;
    }

    public Red_packL getRed_pack() {
        return red_pack;
    }

    public void setRed_pack(Red_packL red_pack) {
        this.red_pack = red_pack;
    }

    @Override
    public String toString() {
        return "IUser_redpack_list{" +
                "id=" + id +
                ", red_pack_id=" + red_pack_id +
                ", user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", bonus_money='" + bonus_money + '\'' +
                ", fgs_id=" + fgs_id +
                ", status=" + status +
                ", created_at=" + created_at +
                ", red_pack=" + red_pack +
                '}';
    }
}

