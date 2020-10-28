package com.zkq.zkqbaselib.ibean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class IYZCOdds {


    private List<String> TEMA;

    private List<String> tema;

    private DingweiL dingwei;

    private WANL WAN;

    private DAL DA;

    private ONEL ONE;

    private BAOL BAO;

    private List<Bet_keyword> bet_keyword;

    public void setTEMA(List<String> TEMA) {
        this.TEMA = TEMA;
    }

    public List<String> getTEMA() {
        return this.TEMA;
    }

    public void setTema(List<String> tema) {
        this.tema = tema;
    }

    public List<String> getTema() {
        return this.tema;
    }

    public DingweiL getDingwei() {
        return dingwei;
    }

    public void setDingwei(DingweiL dingwei) {
        this.dingwei = dingwei;
    }

    public WANL getWAN() {
        return WAN;
    }

    public void setWAN(WANL WAN) {
        this.WAN = WAN;
    }

    public DAL getDA() {
        return DA;
    }

    public void setDA(DAL DA) {
        this.DA = DA;
    }

    public ONEL getONE() {
        return ONE;
    }

    public void setONE(ONEL ONE) {
        this.ONE = ONE;
    }

    public BAOL getBAO() {
        return BAO;
    }

    public void setBAO(BAOL BAO) {
        this.BAO = BAO;
    }

    public void setBet_keyword(List<Bet_keyword> bet_keyword) {
        this.bet_keyword = bet_keyword;
    }

    public List<Bet_keyword> getBet_keyword() {
        return this.bet_keyword;
    }

    public class Bet_keyword {
        @SerializedName("class")
        private String classX;

        private String parent_key;

        private String keyword;

        public String getClassX() {
            return classX;
        }

        public void setClassX(String classX) {
            this.classX = classX;
        }

        public void setParent_key(String parent_key) {
            this.parent_key = parent_key;
        }

        public String getParent_key() {
            return this.parent_key;
        }

        public void setKeyword(String keyword) {
            this.keyword = keyword;
        }

        public String getKeyword() {
            return this.keyword;
        }

        @Override
        public String toString() {
            return "Bet_keyword{" +
                    "classX='" + classX + '\'' +
                    ", parent_key='" + parent_key + '\'' +
                    ", keyword='" + keyword + '\'' +
                    '}';
        }
    }

    public class WANL {
        private WAN_BIG_M12_1L WAN_BIG_M12_1;

        private WAN_BIG_M24_1L WAN_BIG_M24_1;

        private WAN_BIG_M4_1L WAN_BIG_M4_1;

        private WAN_BIG_M6_1L WAN_BIG_M6_1;

        private WAN_SMALL_M12_1L WAN_SMALL_M12_1;

        private WAN_SMALL_M24_1L WAN_SMALL_M24_1;

        private WAN_SMALL_M4_1L WAN_SMALL_M4_1;

        private WAN_SMALL_M6_1L WAN_SMALL_M6_1;

        private WAN_BIG_M4_2L WAN_BIG_M4_2;

        private WAN_BIG_M24_2L WAN_BIG_M24_2;

        private WAN_BIG_M6_2L WAN_BIG_M6_2;

        private WAN_BIG_M12_2L WAN_BIG_M12_2;

        private WAN_SMALL_M12_2L WAN_SMALL_M12_2;

        private WAN_SMALL_M24_2L WAN_SMALL_M24_2;

        private WAN_SMALL_M4_2L WAN_SMALL_M4_2;

        private WAN_SMALL_M6_2L WAN_SMALL_M6_2;

        private WAN_SMALL_M24_3L WAN_SMALL_M24_3;

        private WAN_SMALL_M6_3L WAN_SMALL_M6_3;

        private WAN_BIG_M4_3L WAN_BIG_M4_3;

        private WAN_BIG_M6_3L WAN_BIG_M6_3;

        private WAN_SMALL_M4_3L WAN_SMALL_M4_3;

        private WAN_SMALL_M12_3L WAN_SMALL_M12_3;

        private WAN_BIG_M24_3L WAN_BIG_M24_3;

        private WAN_BIG_M12_3L WAN_BIG_M12_3;

        private WAN_BIG_M24_4L WAN_BIG_M24_4;

        private WAN_BIG_M6_4L WAN_BIG_M6_4;

        private WAN_BIG_M12_4L WAN_BIG_M12_4;

        private WAN_BIG_M4_4L WAN_BIG_M4_4;

        private WAN_BIG_M6_5L WAN_BIG_M6_5;

        private WAN_BIG_M12_5L WAN_BIG_M12_5;

        private WAN_BIG_M4_5L WAN_BIG_M4_5;

        private WAN_BIG_M24_5L WAN_BIG_M24_5;

        public WAN_BIG_M12_1L getWAN_BIG_M12_1() {
            return WAN_BIG_M12_1;
        }

        public void setWAN_BIG_M12_1(WAN_BIG_M12_1L WAN_BIG_M12_1) {
            this.WAN_BIG_M12_1 = WAN_BIG_M12_1;
        }

        public WAN_BIG_M24_1L getWAN_BIG_M24_1() {
            return WAN_BIG_M24_1;
        }

        public void setWAN_BIG_M24_1(WAN_BIG_M24_1L WAN_BIG_M24_1) {
            this.WAN_BIG_M24_1 = WAN_BIG_M24_1;
        }

        public WAN_BIG_M4_1L getWAN_BIG_M4_1() {
            return WAN_BIG_M4_1;
        }

        public void setWAN_BIG_M4_1(WAN_BIG_M4_1L WAN_BIG_M4_1) {
            this.WAN_BIG_M4_1 = WAN_BIG_M4_1;
        }

        public WAN_BIG_M6_1L getWAN_BIG_M6_1() {
            return WAN_BIG_M6_1;
        }

        public void setWAN_BIG_M6_1(WAN_BIG_M6_1L WAN_BIG_M6_1) {
            this.WAN_BIG_M6_1 = WAN_BIG_M6_1;
        }

        public WAN_SMALL_M12_1L getWAN_SMALL_M12_1() {
            return WAN_SMALL_M12_1;
        }

        public void setWAN_SMALL_M12_1(WAN_SMALL_M12_1L WAN_SMALL_M12_1) {
            this.WAN_SMALL_M12_1 = WAN_SMALL_M12_1;
        }

        public WAN_SMALL_M24_1L getWAN_SMALL_M24_1() {
            return WAN_SMALL_M24_1;
        }

        public void setWAN_SMALL_M24_1(WAN_SMALL_M24_1L WAN_SMALL_M24_1) {
            this.WAN_SMALL_M24_1 = WAN_SMALL_M24_1;
        }

        public WAN_SMALL_M4_1L getWAN_SMALL_M4_1() {
            return WAN_SMALL_M4_1;
        }

        public void setWAN_SMALL_M4_1(WAN_SMALL_M4_1L WAN_SMALL_M4_1) {
            this.WAN_SMALL_M4_1 = WAN_SMALL_M4_1;
        }

        public WAN_SMALL_M6_1L getWAN_SMALL_M6_1() {
            return WAN_SMALL_M6_1;
        }

        public void setWAN_SMALL_M6_1(WAN_SMALL_M6_1L WAN_SMALL_M6_1) {
            this.WAN_SMALL_M6_1 = WAN_SMALL_M6_1;
        }

        public WAN_BIG_M4_2L getWAN_BIG_M4_2() {
            return WAN_BIG_M4_2;
        }

        public void setWAN_BIG_M4_2(WAN_BIG_M4_2L WAN_BIG_M4_2) {
            this.WAN_BIG_M4_2 = WAN_BIG_M4_2;
        }

        public WAN_BIG_M24_2L getWAN_BIG_M24_2() {
            return WAN_BIG_M24_2;
        }

        public void setWAN_BIG_M24_2(WAN_BIG_M24_2L WAN_BIG_M24_2) {
            this.WAN_BIG_M24_2 = WAN_BIG_M24_2;
        }

        public WAN_BIG_M6_2L getWAN_BIG_M6_2() {
            return WAN_BIG_M6_2;
        }

        public void setWAN_BIG_M6_2(WAN_BIG_M6_2L WAN_BIG_M6_2) {
            this.WAN_BIG_M6_2 = WAN_BIG_M6_2;
        }

        public WAN_BIG_M12_2L getWAN_BIG_M12_2() {
            return WAN_BIG_M12_2;
        }

        public void setWAN_BIG_M12_2(WAN_BIG_M12_2L WAN_BIG_M12_2) {
            this.WAN_BIG_M12_2 = WAN_BIG_M12_2;
        }

        public WAN_SMALL_M12_2L getWAN_SMALL_M12_2() {
            return WAN_SMALL_M12_2;
        }

        public void setWAN_SMALL_M12_2(WAN_SMALL_M12_2L WAN_SMALL_M12_2) {
            this.WAN_SMALL_M12_2 = WAN_SMALL_M12_2;
        }

        public WAN_SMALL_M24_2L getWAN_SMALL_M24_2() {
            return WAN_SMALL_M24_2;
        }

        public void setWAN_SMALL_M24_2(WAN_SMALL_M24_2L WAN_SMALL_M24_2) {
            this.WAN_SMALL_M24_2 = WAN_SMALL_M24_2;
        }

        public WAN_SMALL_M4_2L getWAN_SMALL_M4_2() {
            return WAN_SMALL_M4_2;
        }

        public void setWAN_SMALL_M4_2(WAN_SMALL_M4_2L WAN_SMALL_M4_2) {
            this.WAN_SMALL_M4_2 = WAN_SMALL_M4_2;
        }

        public WAN_SMALL_M6_2L getWAN_SMALL_M6_2() {
            return WAN_SMALL_M6_2;
        }

        public void setWAN_SMALL_M6_2(WAN_SMALL_M6_2L WAN_SMALL_M6_2) {
            this.WAN_SMALL_M6_2 = WAN_SMALL_M6_2;
        }

        public WAN_SMALL_M24_3L getWAN_SMALL_M24_3() {
            return WAN_SMALL_M24_3;
        }

        public void setWAN_SMALL_M24_3(WAN_SMALL_M24_3L WAN_SMALL_M24_3) {
            this.WAN_SMALL_M24_3 = WAN_SMALL_M24_3;
        }

        public WAN_SMALL_M6_3L getWAN_SMALL_M6_3() {
            return WAN_SMALL_M6_3;
        }

        public void setWAN_SMALL_M6_3(WAN_SMALL_M6_3L WAN_SMALL_M6_3) {
            this.WAN_SMALL_M6_3 = WAN_SMALL_M6_3;
        }

        public WAN_BIG_M4_3L getWAN_BIG_M4_3() {
            return WAN_BIG_M4_3;
        }

        public void setWAN_BIG_M4_3(WAN_BIG_M4_3L WAN_BIG_M4_3) {
            this.WAN_BIG_M4_3 = WAN_BIG_M4_3;
        }

        public WAN_BIG_M6_3L getWAN_BIG_M6_3() {
            return WAN_BIG_M6_3;
        }

        public void setWAN_BIG_M6_3(WAN_BIG_M6_3L WAN_BIG_M6_3) {
            this.WAN_BIG_M6_3 = WAN_BIG_M6_3;
        }

        public WAN_SMALL_M4_3L getWAN_SMALL_M4_3() {
            return WAN_SMALL_M4_3;
        }

        public void setWAN_SMALL_M4_3(WAN_SMALL_M4_3L WAN_SMALL_M4_3) {
            this.WAN_SMALL_M4_3 = WAN_SMALL_M4_3;
        }

        public WAN_SMALL_M12_3L getWAN_SMALL_M12_3() {
            return WAN_SMALL_M12_3;
        }

        public void setWAN_SMALL_M12_3(WAN_SMALL_M12_3L WAN_SMALL_M12_3) {
            this.WAN_SMALL_M12_3 = WAN_SMALL_M12_3;
        }

        public WAN_BIG_M24_3L getWAN_BIG_M24_3() {
            return WAN_BIG_M24_3;
        }

        public void setWAN_BIG_M24_3(WAN_BIG_M24_3L WAN_BIG_M24_3) {
            this.WAN_BIG_M24_3 = WAN_BIG_M24_3;
        }

        public WAN_BIG_M12_3L getWAN_BIG_M12_3() {
            return WAN_BIG_M12_3;
        }

        public void setWAN_BIG_M12_3(WAN_BIG_M12_3L WAN_BIG_M12_3) {
            this.WAN_BIG_M12_3 = WAN_BIG_M12_3;
        }

        public WAN_BIG_M24_4L getWAN_BIG_M24_4() {
            return WAN_BIG_M24_4;
        }

        public void setWAN_BIG_M24_4(WAN_BIG_M24_4L WAN_BIG_M24_4) {
            this.WAN_BIG_M24_4 = WAN_BIG_M24_4;
        }

        public WAN_BIG_M6_4L getWAN_BIG_M6_4() {
            return WAN_BIG_M6_4;
        }

        public void setWAN_BIG_M6_4(WAN_BIG_M6_4L WAN_BIG_M6_4) {
            this.WAN_BIG_M6_4 = WAN_BIG_M6_4;
        }

        public WAN_BIG_M12_4L getWAN_BIG_M12_4() {
            return WAN_BIG_M12_4;
        }

        public void setWAN_BIG_M12_4(WAN_BIG_M12_4L WAN_BIG_M12_4) {
            this.WAN_BIG_M12_4 = WAN_BIG_M12_4;
        }

        public WAN_BIG_M4_4L getWAN_BIG_M4_4() {
            return WAN_BIG_M4_4;
        }

        public void setWAN_BIG_M4_4(WAN_BIG_M4_4L WAN_BIG_M4_4) {
            this.WAN_BIG_M4_4 = WAN_BIG_M4_4;
        }

        public WAN_BIG_M6_5L getWAN_BIG_M6_5() {
            return WAN_BIG_M6_5;
        }

        public void setWAN_BIG_M6_5(WAN_BIG_M6_5L WAN_BIG_M6_5) {
            this.WAN_BIG_M6_5 = WAN_BIG_M6_5;
        }

        public WAN_BIG_M12_5L getWAN_BIG_M12_5() {
            return WAN_BIG_M12_5;
        }

        public void setWAN_BIG_M12_5(WAN_BIG_M12_5L WAN_BIG_M12_5) {
            this.WAN_BIG_M12_5 = WAN_BIG_M12_5;
        }

        public WAN_BIG_M4_5L getWAN_BIG_M4_5() {
            return WAN_BIG_M4_5;
        }

        public void setWAN_BIG_M4_5(WAN_BIG_M4_5L WAN_BIG_M4_5) {
            this.WAN_BIG_M4_5 = WAN_BIG_M4_5;
        }

        public WAN_BIG_M24_5L getWAN_BIG_M24_5() {
            return WAN_BIG_M24_5;
        }

        public void setWAN_BIG_M24_5(WAN_BIG_M24_5L WAN_BIG_M24_5) {
            this.WAN_BIG_M24_5 = WAN_BIG_M24_5;
        }

        public class WAN_BIG_M12_1L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public String getClassX() {
                return classX;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            @Override
            public String toString() {
                return "WAN_BIG_M12_1L{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class WAN_BIG_M24_1L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public String getClassX() {
                return classX;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            @Override
            public String toString() {
                return "WAN_BIG_M24_1{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class WAN_BIG_M4_1L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "WAN_BIG_M4_1L{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class WAN_BIG_M6_1L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "WAN_BIG_M6_1{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class WAN_SMALL_M12_1L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "WAN_SMALL_M12_1L{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class WAN_SMALL_M24_1L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "WAN_SMALL_M24_1{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class WAN_SMALL_M4_1L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "WAN_SMALL_M4_1{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class WAN_SMALL_M6_1L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "WAN_SMALL_M6_1{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class WAN_BIG_M4_2L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "WAN_BIG_M4_2{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class WAN_BIG_M24_2L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "WAN_BIG_M24_2{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class WAN_BIG_M6_2L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "WAN_BIG_M6_2{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class WAN_BIG_M12_2L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "WAN_BIG_M12_2{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class WAN_SMALL_M12_2L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "WAN_SMALL_M12_2{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class WAN_SMALL_M24_2L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "WAN_SMALL_M24_2{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class WAN_SMALL_M4_2L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "WAN_SMALL_M4_2{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class WAN_SMALL_M6_2L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "WAN_SMALL_M6_2{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class WAN_SMALL_M24_3L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "WAN_SMALL_M24_3{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class WAN_SMALL_M6_3L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "WAN_SMALL_M6_3{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class WAN_BIG_M4_3L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "WAN_BIG_M4_3{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class WAN_BIG_M6_3L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "WAN_BIG_M6_3{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class WAN_SMALL_M4_3L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "WAN_SMALL_M4_3{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class WAN_SMALL_M12_3L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "WAN_SMALL_M12_3{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class WAN_BIG_M24_3L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "WAN_BIG_M24_3{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class WAN_BIG_M12_3L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "WAN_BIG_M12_3{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class WAN_BIG_M24_4L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "WAN_BIG_M24_4{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class WAN_BIG_M6_4L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "WAN_BIG_M6_4{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class WAN_BIG_M12_4L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "WAN_BIG_M12_4L{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class WAN_BIG_M4_4L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "WAN_BIG_M4_4{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class WAN_BIG_M6_5L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "WAN_BIG_M6_5{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class WAN_BIG_M12_5L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "WAN_BIG_M12_5{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class WAN_BIG_M4_5L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "WAN_BIG_M4_5{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class WAN_BIG_M24_5L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "WAN_BIG_M24_5{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "WANL{" +
                    "WAN_BIG_M12_1=" + WAN_BIG_M12_1 +
                    ", WAN_BIG_M24_1=" + WAN_BIG_M24_1 +
                    ", WAN_BIG_M4_1=" + WAN_BIG_M4_1 +
                    ", WAN_BIG_M6_1=" + WAN_BIG_M6_1 +
                    ", WAN_SMALL_M12_1=" + WAN_SMALL_M12_1 +
                    ", WAN_SMALL_M24_1=" + WAN_SMALL_M24_1 +
                    ", WAN_SMALL_M4_1=" + WAN_SMALL_M4_1 +
                    ", WAN_SMALL_M6_1=" + WAN_SMALL_M6_1 +
                    ", WAN_BIG_M4_2=" + WAN_BIG_M4_2 +
                    ", WAN_BIG_M24_2=" + WAN_BIG_M24_2 +
                    ", WAN_BIG_M6_2=" + WAN_BIG_M6_2 +
                    ", WAN_BIG_M12_2=" + WAN_BIG_M12_2 +
                    ", WAN_SMALL_M12_2=" + WAN_SMALL_M12_2 +
                    ", WAN_SMALL_M24_2=" + WAN_SMALL_M24_2 +
                    ", WAN_SMALL_M4_2=" + WAN_SMALL_M4_2 +
                    ", WAN_SMALL_M6_2=" + WAN_SMALL_M6_2 +
                    ", WAN_SMALL_M24_3=" + WAN_SMALL_M24_3 +
                    ", WAN_SMALL_M6_3=" + WAN_SMALL_M6_3 +
                    ", WAN_BIG_M4_3=" + WAN_BIG_M4_3 +
                    ", WAN_BIG_M6_3=" + WAN_BIG_M6_3 +
                    ", WAN_SMALL_M4_3=" + WAN_SMALL_M4_3 +
                    ", WAN_SMALL_M12_3=" + WAN_SMALL_M12_3 +
                    ", WAN_BIG_M24_3=" + WAN_BIG_M24_3 +
                    ", WAN_BIG_M12_3=" + WAN_BIG_M12_3 +
                    ", WAN_BIG_M24_4=" + WAN_BIG_M24_4 +
                    ", WAN_BIG_M6_4=" + WAN_BIG_M6_4 +
                    ", WAN_BIG_M12_4=" + WAN_BIG_M12_4 +
                    ", WAN_BIG_M4_4=" + WAN_BIG_M4_4 +
                    ", WAN_BIG_M6_5=" + WAN_BIG_M6_5 +
                    ", WAN_BIG_M12_5=" + WAN_BIG_M12_5 +
                    ", WAN_BIG_M4_5=" + WAN_BIG_M4_5 +
                    ", WAN_BIG_M24_5=" + WAN_BIG_M24_5 +
                    '}';
        }
    }

    public class DAL {
        private DA_BIG_1L DA_BIG_1;

        private DA_SA_1L DA_SA_1;

        private DA_SMALL_1L DA_SMALL_1;

        private DA_3C_1L DA_3C_1;

        private DA_3A_1L DA_3A_1;

        private DA_BIG_2L DA_BIG_2;

        private DA_SMALL_2L DA_SMALL_2;

        private DA_3C_2L DA_3C_2;

        private DA_3C_3L DA_3C_3;

        private DA_BIG_3L DA_BIG_3;

        private DA_SMALL_3L DA_SMALL_3;

        private DA_BIG_4L DA_BIG_4;

        private DA_BIG_5L DA_BIG_5;

        public DA_BIG_1L getDA_BIG_1() {
            return DA_BIG_1;
        }

        public void setDA_BIG_1(DA_BIG_1L DA_BIG_1) {
            this.DA_BIG_1 = DA_BIG_1;
        }

        public DA_SA_1L getDA_SA_1() {
            return DA_SA_1;
        }

        public void setDA_SA_1(DA_SA_1L DA_SA_1) {
            this.DA_SA_1 = DA_SA_1;
        }

        public DA_SMALL_1L getDA_SMALL_1() {
            return DA_SMALL_1;
        }

        public void setDA_SMALL_1(DA_SMALL_1L DA_SMALL_1) {
            this.DA_SMALL_1 = DA_SMALL_1;
        }

        public DA_3C_1L getDA_3C_1() {
            return DA_3C_1;
        }

        public void setDA_3C_1(DA_3C_1L DA_3C_1) {
            this.DA_3C_1 = DA_3C_1;
        }

        public DA_3A_1L getDA_3A_1() {
            return DA_3A_1;
        }

        public void setDA_3A_1(DA_3A_1L DA_3A_1) {
            this.DA_3A_1 = DA_3A_1;
        }

        public DA_BIG_2L getDA_BIG_2() {
            return DA_BIG_2;
        }

        public void setDA_BIG_2(DA_BIG_2L DA_BIG_2) {
            this.DA_BIG_2 = DA_BIG_2;
        }

        public DA_SMALL_2L getDA_SMALL_2() {
            return DA_SMALL_2;
        }

        public void setDA_SMALL_2(DA_SMALL_2L DA_SMALL_2) {
            this.DA_SMALL_2 = DA_SMALL_2;
        }

        public DA_3C_2L getDA_3C_2() {
            return DA_3C_2;
        }

        public void setDA_3C_2(DA_3C_2L DA_3C_2) {
            this.DA_3C_2 = DA_3C_2;
        }

        public DA_3C_3L getDA_3C_3() {
            return DA_3C_3;
        }

        public void setDA_3C_3(DA_3C_3L DA_3C_3) {
            this.DA_3C_3 = DA_3C_3;
        }

        public DA_BIG_3L getDA_BIG_3() {
            return DA_BIG_3;
        }

        public void setDA_BIG_3(DA_BIG_3L DA_BIG_3) {
            this.DA_BIG_3 = DA_BIG_3;
        }

        public DA_SMALL_3L getDA_SMALL_3() {
            return DA_SMALL_3;
        }

        public void setDA_SMALL_3(DA_SMALL_3L DA_SMALL_3) {
            this.DA_SMALL_3 = DA_SMALL_3;
        }

        public DA_BIG_4L getDA_BIG_4() {
            return DA_BIG_4;
        }

        public void setDA_BIG_4(DA_BIG_4L DA_BIG_4) {
            this.DA_BIG_4 = DA_BIG_4;
        }

        public DA_BIG_5L getDA_BIG_5() {
            return DA_BIG_5;
        }

        public void setDA_BIG_5(DA_BIG_5L DA_BIG_5) {
            this.DA_BIG_5 = DA_BIG_5;
        }

        public class DA_BIG_1L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "DA_BIG_1{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class DA_SA_1L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "DA_SA_1{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class DA_SMALL_1L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "DA_SMALL_1{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class DA_3C_1L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "DA_3C_1{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class DA_3A_1L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "DA_3A_1{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class DA_BIG_2L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "DA_BIG_2{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class DA_SMALL_2L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "DA_SMALL_2{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class DA_3C_2L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "DA_3C_2{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class DA_3C_3L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "DA_3C_3{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class DA_BIG_3L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "DA_BIG_3{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class DA_SMALL_3L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "DA_SMALL_3{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class DA_BIG_4L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "DA_BIG_4{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class DA_BIG_5L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "DA_BIG_5{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "DAL{" +
                    "DA_BIG_1=" + DA_BIG_1 +
                    ", DA_SA_1=" + DA_SA_1 +
                    ", DA_SMALL_1=" + DA_SMALL_1 +
                    ", DA_3C_1=" + DA_3C_1 +
                    ", DA_3A_1=" + DA_3A_1 +
                    ", DA_BIG_2=" + DA_BIG_2 +
                    ", DA_SMALL_2=" + DA_SMALL_2 +
                    ", DA_3C_2=" + DA_3C_2 +
                    ", DA_3C_3=" + DA_3C_3 +
                    ", DA_BIG_3=" + DA_BIG_3 +
                    ", DA_SMALL_3=" + DA_SMALL_3 +
                    ", DA_BIG_4=" + DA_BIG_4 +
                    ", DA_BIG_5=" + DA_BIG_5 +
                    '}';
        }
    }

    public class ONEL {
        private ONE_3A_1L ONE_3A_1;

        private ONE_3C_1L ONE_3C_1;

        private ONE_BIG_1L ONE_BIG_1;

        private ONE_SA_1L ONE_SA_1;

        private ONE_SMALL_1L ONE_SMALL_1;

        private ONE_SMALL_2L ONE_SMALL_2;

        private ONE_BIG_2L ONE_BIG_2;

        private ONE_3C_2L ONE_3C_2;

        private ONE_3C_3L ONE_3C_3;

        private ONE_BIG_3L ONE_BIG_3;

        private ONE_SMALL_3L ONE_SMALL_3;

        private ONE_BIG_4L ONE_BIG_4;

        private ONE_BIG_5L ONE_BIG_5;

        public ONE_3A_1L getONE_3A_1() {
            return ONE_3A_1;
        }

        public void setONE_3A_1(ONE_3A_1L ONE_3A_1) {
            this.ONE_3A_1 = ONE_3A_1;
        }

        public ONE_3C_1L getONE_3C_1() {
            return ONE_3C_1;
        }

        public void setONE_3C_1(ONE_3C_1L ONE_3C_1) {
            this.ONE_3C_1 = ONE_3C_1;
        }

        public ONE_BIG_1L getONE_BIG_1() {
            return ONE_BIG_1;
        }

        public void setONE_BIG_1(ONE_BIG_1L ONE_BIG_1) {
            this.ONE_BIG_1 = ONE_BIG_1;
        }

        public ONE_SA_1L getONE_SA_1() {
            return ONE_SA_1;
        }

        public void setONE_SA_1(ONE_SA_1L ONE_SA_1) {
            this.ONE_SA_1 = ONE_SA_1;
        }

        public ONE_SMALL_1L getONE_SMALL_1() {
            return ONE_SMALL_1;
        }

        public void setONE_SMALL_1(ONE_SMALL_1L ONE_SMALL_1) {
            this.ONE_SMALL_1 = ONE_SMALL_1;
        }

        public ONE_SMALL_2L getONE_SMALL_2() {
            return ONE_SMALL_2;
        }

        public void setONE_SMALL_2(ONE_SMALL_2L ONE_SMALL_2) {
            this.ONE_SMALL_2 = ONE_SMALL_2;
        }

        public ONE_BIG_2L getONE_BIG_2() {
            return ONE_BIG_2;
        }

        public void setONE_BIG_2(ONE_BIG_2L ONE_BIG_2) {
            this.ONE_BIG_2 = ONE_BIG_2;
        }

        public ONE_3C_2L getONE_3C_2() {
            return ONE_3C_2;
        }

        public void setONE_3C_2(ONE_3C_2L ONE_3C_2) {
            this.ONE_3C_2 = ONE_3C_2;
        }

        public ONE_3C_3L getONE_3C_3() {
            return ONE_3C_3;
        }

        public void setONE_3C_3(ONE_3C_3L ONE_3C_3) {
            this.ONE_3C_3 = ONE_3C_3;
        }

        public ONE_BIG_3L getONE_BIG_3() {
            return ONE_BIG_3;
        }

        public void setONE_BIG_3(ONE_BIG_3L ONE_BIG_3) {
            this.ONE_BIG_3 = ONE_BIG_3;
        }

        public ONE_SMALL_3L getONE_SMALL_3() {
            return ONE_SMALL_3;
        }

        public void setONE_SMALL_3(ONE_SMALL_3L ONE_SMALL_3) {
            this.ONE_SMALL_3 = ONE_SMALL_3;
        }

        public ONE_BIG_4L getONE_BIG_4() {
            return ONE_BIG_4;
        }

        public void setONE_BIG_4(ONE_BIG_4L ONE_BIG_4) {
            this.ONE_BIG_4 = ONE_BIG_4;
        }

        public ONE_BIG_5L getONE_BIG_5() {
            return ONE_BIG_5;
        }

        public void setONE_BIG_5(ONE_BIG_5L ONE_BIG_5) {
            this.ONE_BIG_5 = ONE_BIG_5;
        }

        public class ONE_3A_1L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "ONE_3A_1{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class ONE_3C_1L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "ONE_3C_1{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class ONE_BIG_1L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "ONE_BIG_1{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class ONE_SA_1L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "ONE_SA_1{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class ONE_SMALL_1L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "ONE_SMALL_1{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class ONE_SMALL_2L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "ONE_SMALL_2{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class ONE_BIG_2L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "ONE_BIG_2{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class ONE_3C_2L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "ONE_3C_2{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class ONE_3C_3L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "ONE_3C_3{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class ONE_BIG_3L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "ONE_BIG_3{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class ONE_SMALL_3L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "ONE_SMALL_3{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class ONE_BIG_4L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "ONE_BIG_4{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }


        public class ONE_BIG_5L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "ONE_BIG_5{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "ONEL{" +
                    "ONE_3A_1=" + ONE_3A_1 +
                    ", ONE_3C_1=" + ONE_3C_1 +
                    ", ONE_BIG_1=" + ONE_BIG_1 +
                    ", ONE_SA_1=" + ONE_SA_1 +
                    ", ONE_SMALL_1=" + ONE_SMALL_1 +
                    ", ONE_SMALL_2=" + ONE_SMALL_2 +
                    ", ONE_BIG_2=" + ONE_BIG_2 +
                    ", ONE_3C_2=" + ONE_3C_2 +
                    ", ONE_3C_3=" + ONE_3C_3 +
                    ", ONE_BIG_3=" + ONE_BIG_3 +
                    ", ONE_SMALL_3=" + ONE_SMALL_3 +
                    ", ONE_BIG_4=" + ONE_BIG_4 +
                    ", ONE_BIG_5=" + ONE_BIG_5 +
                    '}';
        }
    }

    public class BAOL {
        private BAO_3C_1L BAO_3C_1;

        private BAO_3A_1L BAO_3A_1;

        private BAO_BIG_1L BAO_BIG_1;

        private BAO_SA_1L BAO_SA_1;

        private BAO_SMALL_1L BAO_SMALL_1;

        private BAO_BIG_2L BAO_BIG_2;

        private BAO_SMALL_2L BAO_SMALL_2;

        private BAO_3C_2L BAO_3C_2;

        private BAO_BIG_3L BAO_BIG_3;

        private BAO_3C_3L BAO_3C_3;

        private BAO_SMALL_3L BAO_SMALL_3;

        private BAO_BIG_4L BAO_BIG_4;

        private BAO_BIG_5L BAO_BIG_5;

        public BAO_3C_1L getBAO_3C_1() {
            return BAO_3C_1;
        }

        public void setBAO_3C_1(BAO_3C_1L BAO_3C_1) {
            this.BAO_3C_1 = BAO_3C_1;
        }

        public BAO_3A_1L getBAO_3A_1() {
            return BAO_3A_1;
        }

        public void setBAO_3A_1(BAO_3A_1L BAO_3A_1) {
            this.BAO_3A_1 = BAO_3A_1;
        }

        public BAO_BIG_1L getBAO_BIG_1() {
            return BAO_BIG_1;
        }

        public void setBAO_BIG_1(BAO_BIG_1L BAO_BIG_1) {
            this.BAO_BIG_1 = BAO_BIG_1;
        }

        public BAO_SA_1L getBAO_SA_1() {
            return BAO_SA_1;
        }

        public void setBAO_SA_1(BAO_SA_1L BAO_SA_1) {
            this.BAO_SA_1 = BAO_SA_1;
        }

        public BAO_SMALL_1L getBAO_SMALL_1() {
            return BAO_SMALL_1;
        }

        public void setBAO_SMALL_1(BAO_SMALL_1L BAO_SMALL_1) {
            this.BAO_SMALL_1 = BAO_SMALL_1;
        }

        public BAO_BIG_2L getBAO_BIG_2() {
            return BAO_BIG_2;
        }

        public void setBAO_BIG_2(BAO_BIG_2L BAO_BIG_2) {
            this.BAO_BIG_2 = BAO_BIG_2;
        }

        public BAO_SMALL_2L getBAO_SMALL_2() {
            return BAO_SMALL_2;
        }

        public void setBAO_SMALL_2(BAO_SMALL_2L BAO_SMALL_2) {
            this.BAO_SMALL_2 = BAO_SMALL_2;
        }

        public BAO_3C_2L getBAO_3C_2() {
            return BAO_3C_2;
        }

        public void setBAO_3C_2(BAO_3C_2L BAO_3C_2) {
            this.BAO_3C_2 = BAO_3C_2;
        }

        public BAO_BIG_3L getBAO_BIG_3() {
            return BAO_BIG_3;
        }

        public void setBAO_BIG_3(BAO_BIG_3L BAO_BIG_3) {
            this.BAO_BIG_3 = BAO_BIG_3;
        }

        public BAO_3C_3L getBAO_3C_3() {
            return BAO_3C_3;
        }

        public void setBAO_3C_3(BAO_3C_3L BAO_3C_3) {
            this.BAO_3C_3 = BAO_3C_3;
        }

        public BAO_SMALL_3L getBAO_SMALL_3() {
            return BAO_SMALL_3;
        }

        public void setBAO_SMALL_3(BAO_SMALL_3L BAO_SMALL_3) {
            this.BAO_SMALL_3 = BAO_SMALL_3;
        }

        public BAO_BIG_4L getBAO_BIG_4() {
            return BAO_BIG_4;
        }

        public void setBAO_BIG_4(BAO_BIG_4L BAO_BIG_4) {
            this.BAO_BIG_4 = BAO_BIG_4;
        }

        public BAO_BIG_5L getBAO_BIG_5() {
            return BAO_BIG_5;
        }

        public void setBAO_BIG_5(BAO_BIG_5L BAO_BIG_5) {
            this.BAO_BIG_5 = BAO_BIG_5;
        }

        public class BAO_3C_1L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "BAO_3C_1{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class BAO_3A_1L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "BAO_3A_1{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class BAO_BIG_1L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "BAO_BIG_1{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class BAO_SA_1L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "BAO_SA_1{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class BAO_SMALL_1L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "BAO_SMALL_1{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class BAO_BIG_2L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "BAO_BIG_2{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class BAO_SMALL_2L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "BAO_SMALL_2{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class BAO_3C_2L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "BAO_3C_2{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class BAO_BIG_3L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "BAO_BIG_3{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class BAO_3C_3L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "BAO_3C_3{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class BAO_SMALL_3L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "BAO_SMALL_3{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class BAO_BIG_4L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "BAO_BIG_4{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        public class BAO_BIG_5L {
            private String name;

            private String odds;

            private String parent_key;

            private String keyword;

            @SerializedName("class")
            private String classX;

            public void setName(String name) {
                this.name = name;
            }

            public String getName() {
                return this.name;
            }

            public void setOdds(String odds) {
                this.odds = odds;
            }

            public String getOdds() {
                return this.odds;
            }

            public void setParent_key(String parent_key) {
                this.parent_key = parent_key;
            }

            public String getParent_key() {
                return this.parent_key;
            }

            public void setKeyword(String keyword) {
                this.keyword = keyword;
            }

            public String getKeyword() {
                return this.keyword;
            }

            public void setClassX(String classX) {
                this.classX = classX;
            }

            public String getClassX() {
                return classX;
            }

            @Override
            public String toString() {
                return "BAO_BIG_5{" +
                        "name='" + name + '\'' +
                        ", odds='" + odds + '\'' +
                        ", parent_key='" + parent_key + '\'' +
                        ", keyword='" + keyword + '\'' +
                        ", classX='" + classX + '\'' +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "BAOL{" +
                    "BAO_3C_1=" + BAO_3C_1 +
                    ", BAO_3A_1=" + BAO_3A_1 +
                    ", BAO_BIG_1=" + BAO_BIG_1 +
                    ", BAO_SA_1=" + BAO_SA_1 +
                    ", BAO_SMALL_1=" + BAO_SMALL_1 +
                    ", BAO_BIG_2=" + BAO_BIG_2 +
                    ", BAO_SMALL_2=" + BAO_SMALL_2 +
                    ", BAO_3C_2=" + BAO_3C_2 +
                    ", BAO_BIG_3=" + BAO_BIG_3 +
                    ", BAO_3C_3=" + BAO_3C_3 +
                    ", BAO_SMALL_3=" + BAO_SMALL_3 +
                    ", BAO_BIG_4=" + BAO_BIG_4 +
                    ", BAO_BIG_5=" + BAO_BIG_5 +
                    '}';
        }
    }

    public class DingweiL {
        private List<String> one;

        private List<String> two;

        private List<String> three;

        public void setOne(List<String> one) {
            this.one = one;
        }

        public List<String> getOne() {
            return this.one;
        }

        public void setTwo(List<String> two) {
            this.two = two;
        }

        public List<String> getTwo() {
            return this.two;
        }

        public void setThree(List<String> three) {
            this.three = three;
        }

        public List<String> getThree() {
            return this.three;
        }

        @Override
        public String toString() {
            return "DingweiL{" +
                    "one=" + one +
                    ", two=" + two +
                    ", three=" + three +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "IYZCOdds{" +
                "TEMA=" + TEMA +
                ", tema=" + tema +
                ", dingwei=" + dingwei +
                ", WAN=" + WAN +
                ", DA=" + DA +
                ", ONE=" + ONE +
                ", BAO=" + BAO +
                ", bet_keyword=" + bet_keyword +
                '}';
    }
}
