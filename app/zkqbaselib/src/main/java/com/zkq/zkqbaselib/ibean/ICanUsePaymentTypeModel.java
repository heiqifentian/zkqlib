package com.zkq.zkqbaselib.ibean;

import java.util.List;

public class ICanUsePaymentTypeModel {

    private int id;
    private String name;
    private int status;
    private String created_at;
    private String underline_remark;
    private String online_remark;
    private String updated_at;
    private CanalC canal;

    public class CanalC {
        private List<UnderlineL> underline;

        private List<OnlineL> online;

        public class UnderlineL {
            private int id;
            private String payee;
            private String account_num;
            private int type;
            private String subbranch;
            private String pic;
            private int status;
            private String created_at;
            private int bank_id;
            private String bank_name;
            private String lids;
            private int admin_id;
            private String deleted_at;
            private String updated_at;
            private String background_pic;
            private String logo;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getPayee() {
                return payee;
            }

            public void setPayee(String payee) {
                this.payee = payee;
            }

            public String getAccount_num() {
                return account_num;
            }

            public void setAccount_num(String account_num) {
                this.account_num = account_num;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getSubbranch() {
                return subbranch;
            }

            public void setSubbranch(String subbranch) {
                this.subbranch = subbranch;
            }

            public String getPic() {
                return pic;
            }

            public void setPic(String pic) {
                this.pic = pic;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getCreated_at() {
                return created_at;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }

            public int getBank_id() {
                return bank_id;
            }

            public void setBank_id(int bank_id) {
                this.bank_id = bank_id;
            }

            public String getBank_name() {
                return bank_name;
            }

            public void setBank_name(String bank_name) {
                this.bank_name = bank_name;
            }

            public String getLids() {
                return lids;
            }

            public void setLids(String lids) {
                this.lids = lids;
            }

            public int getAdmin_id() {
                return admin_id;
            }

            public void setAdmin_id(int admin_id) {
                this.admin_id = admin_id;
            }

            public String getDeleted_at() {
                return deleted_at;
            }

            public void setDeleted_at(String deleted_at) {
                this.deleted_at = deleted_at;
            }

            public String getUpdated_at() {
                return updated_at;
            }

            public void setUpdated_at(String updated_at) {
                this.updated_at = updated_at;
            }

            public String getBackground_pic() {
                return background_pic;
            }

            public void setBackground_pic(String background_pic) {
                this.background_pic = background_pic;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            @Override
            public String toString() {
                return "UnderlineL{" +
                        "id=" + id +
                        ", payee='" + payee + '\'' +
                        ", account_num='" + account_num + '\'' +
                        ", type=" + type +
                        ", subbranch='" + subbranch + '\'' +
                        ", pic='" + pic + '\'' +
                        ", status=" + status +
                        ", created_at='" + created_at + '\'' +
                        ", bank_id=" + bank_id +
                        ", bank_name='" + bank_name + '\'' +
                        ", lids='" + lids + '\'' +
                        ", admin_id=" + admin_id +
                        ", deleted_at='" + deleted_at + '\'' +
                        ", updated_at='" + updated_at + '\'' +
                        ", background_pic='" + background_pic + '\'' +
                        ", logo='" + logo + '\'' +
                        '}';
            }
        }

        public class OnlineL {
            private int id;
            private String title;
            //            private String class;
            private String params;
            private String pay_type;
            private String min;
            private String max;
            private String describe;
            private int status;
            private String created_at;
            private String poundage;
            private String i_order;
            private int mid;
            private String lids;
            private int admin_id;
            private String channel;
            private int type_id;
            private String currency;
            private List<Need_paramsL> need_params;

            private String edit_money;

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            private int type;


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

            public String getParams() {
                return params;
            }

            public void setParams(String params) {
                this.params = params;
            }

            public String getPay_type() {
                return pay_type;
            }

            public void setPay_type(String pay_type) {
                this.pay_type = pay_type;
            }

            public String getMin() {
                return min;
            }

            public void setMin(String min) {
                this.min = min;
            }

            public String getMax() {
                return max;
            }

            public void setMax(String max) {
                this.max = max;
            }

            public String getDescribe() {
                return describe;
            }

            public void setDescribe(String describe) {
                this.describe = describe;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getCreated_at() {
                return created_at;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }

            public String getPoundage() {
                return poundage;
            }

            public void setPoundage(String poundage) {
                this.poundage = poundage;
            }

            public String getI_order() {
                return i_order;
            }

            public void setI_order(String i_order) {
                this.i_order = i_order;
            }

            public int getMid() {
                return mid;
            }

            public void setMid(int mid) {
                this.mid = mid;
            }

            public String getLids() {
                return lids;
            }

            public void setLids(String lids) {
                this.lids = lids;
            }

            public int getAdmin_id() {
                return admin_id;
            }

            public void setAdmin_id(int admin_id) {
                this.admin_id = admin_id;
            }

            public String getChannel() {
                return channel;
            }

            public void setChannel(String channel) {
                this.channel = channel;
            }

            public int getType_id() {
                return type_id;
            }

            public void setType_id(int type_id) {
                this.type_id = type_id;
            }

            public String getCurrency() {
                return currency;
            }

            public void setCurrency(String currency) {
                this.currency = currency;
            }

            public List<Need_paramsL> getNeed_params() {
                return need_params;
            }

            public void setNeed_params(List<Need_paramsL> need_params) {
                this.need_params = need_params;
            }

            public String getEdit_money() {
                return edit_money;
            }

            public void setEdit_money(String edit_money) {
                this.edit_money = edit_money;
            }

            public class Need_paramsL {
                private int type;
                private String name_text;
                private String key;
                private String input_type;
                private List<Select_valueL> select_value;
                private String edit_money;

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getName_text() {
                    return name_text;
                }

                public void setName_text(String name_text) {
                    this.name_text = name_text;
                }

                public String getKey() {
                    return key;
                }

                public void setKey(String key) {
                    this.key = key;
                }

                public String getInput_type() {
                    return input_type;
                }

                public void setInput_type(String input_type) {
                    this.input_type = input_type;
                }

                public List<Select_valueL> getSelect_value() {
                    return select_value;
                }

                public void setSelect_value(List<Select_valueL> select_value) {
                    this.select_value = select_value;
                }

                public String getEdit_money() {
                    return edit_money;
                }

                public void setEdit_money(String edit_money) {
                    this.edit_money = edit_money;
                }

                public class Select_valueL {
                    private String name;
                    private String key;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getKey() {
                        return key;
                    }

                    public void setKey(String key) {
                        this.key = key;
                    }

                    @Override
                    public String toString() {
                        return "Select_valueL{" +
                                "name='" + name + '\'' +
                                ", key='" + key + '\'' +
                                '}';
                    }
                }

                @Override
                public String toString() {
                    return "Need_paramsL{" +
                            "type=" + type +
                            ", name_text='" + name_text + '\'' +
                            ", key='" + key + '\'' +
                            ", input_type='" + input_type + '\'' +
                            ", select_value=" + select_value +
                            ", edit_money='" + edit_money + '\'' +
                            '}';
                }
            }


            @Override
            public String toString() {
                return "OnlineL{" +
                        "id=" + id +
                        ", title='" + title + '\'' +
                        ", params='" + params + '\'' +
                        ", pay_type='" + pay_type + '\'' +
                        ", min='" + min + '\'' +
                        ", max='" + max + '\'' +
                        ", describe='" + describe + '\'' +
                        ", status=" + status +
                        ", created_at='" + created_at + '\'' +
                        ", poundage='" + poundage + '\'' +
                        ", i_order='" + i_order + '\'' +
                        ", mid=" + mid +
                        ", lids='" + lids + '\'' +
                        ", admin_id=" + admin_id +
                        ", channel='" + channel + '\'' +
                        ", type_id=" + type_id +
                        ", currency='" + currency + '\'' +
                        ", need_params=" + need_params +
                        ", edit_money='" + edit_money + '\'' +
                        ", type=" + type +
                        '}';
            }
        }

        public List<UnderlineL> getUnderline() {
            return underline;
        }

        public void setUnderline(List<UnderlineL> underline) {
            this.underline = underline;
        }

        public List<OnlineL> getOnline() {
            return online;
        }

        public void setOnline(List<OnlineL> online) {
            this.online = online;
        }

        @Override
        public String toString() {
            return "CanalC{" +
                    "underline=" + underline +
                    ", online=" + online +
                    '}';
        }
    }

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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getOnline_remark() {
        return online_remark;
    }

    public void setOnline_remark(String online_remark) {
        this.online_remark = online_remark;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public CanalC getCanal() {
        return canal;
    }

    public void setCanal(CanalC canal) {
        this.canal = canal;
    }

    public String getUnderline_remark() {
        return underline_remark;
    }

    public void setUnderline_remark(String underline_remark) {
        this.underline_remark = underline_remark;
    }

    @Override
    public String toString() {
        return "ICanUsePaymentTypeModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", created_at='" + created_at + '\'' +
                ", underline_remark='" + underline_remark + '\'' +
                ", online_remark='" + online_remark + '\'' +
                ", updated_at='" + updated_at + '\'' +
                ", canal=" + canal +
                '}';
    }
}
