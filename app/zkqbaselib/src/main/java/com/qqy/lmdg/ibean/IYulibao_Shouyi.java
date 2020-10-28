package com.qqy.lmdg.ibean;

import java.util.List;

public class IYulibao_Shouyi {

    private int  total;
    private int totalPage;
    private int page;
    private int pageSize;
    private List<ListL> list;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<ListL> getList() {
        return list;
    }

    public void setList(List<ListL> list) {
        this.list = list;
    }

    public class ListL {
        private int id;
        private int user_id;
        private String change_money;
        private long created_at;
        private int type;
        private int status;
        private String created_date;
        private int is_insterest;
        private int admin_id;
        private String useful_money;

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

        public String getChange_money() {
            return change_money;
        }

        public void setChange_money(String change_money) {
            this.change_money = change_money;
        }

        public long getCreated_at() {
            return created_at;
        }

        public void setCreated_at(long created_at) {
            this.created_at = created_at;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getCreated_date() {
            return created_date;
        }

        public void setCreated_date(String created_date) {
            this.created_date = created_date;
        }

        public int getIs_insterest() {
            return is_insterest;
        }

        public void setIs_insterest(int is_insterest) {
            this.is_insterest = is_insterest;
        }

        public int getAdmin_id() {
            return admin_id;
        }

        public void setAdmin_id(int admin_id) {
            this.admin_id = admin_id;
        }

        public String getUseful_money() {
            return useful_money;
        }

        public void setUseful_money(String useful_money) {
            this.useful_money = useful_money;
        }

        @Override
        public String toString() {
            return "ListL{" +
                    "id=" + id +
                    ", user_id=" + user_id +
                    ", change_money='" + change_money + '\'' +
                    ", created_at='" + created_at + '\'' +
                    ", type=" + type +
                    ", status=" + status +
                    ", created_date='" + created_date + '\'' +
                    ", is_insterest=" + is_insterest +
                    ", admin_id=" + admin_id +
                    ", useful_money='" + useful_money + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "IYulibao_Shouyi{" +
                "total=" + total +
                ", totalPage=" + totalPage +
                ", page=" + page +
                ", pageSize=" + pageSize +
                ", list=" + list +
                '}';
    }
}
