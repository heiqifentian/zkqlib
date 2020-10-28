package com.qqy.lmdg.ibean;

public class IGetTalkRoomSetting {
    private int id;
    private int fgs_id;
    private String filtration;
    private long created_at;

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

    public String getFiltration() {
        return filtration;
    }

    public void setFiltration(String filtration) {
        this.filtration = filtration;
    }

    public long getCreated_at() {
        return created_at;
    }

    public void setCreated_at(long created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "IGetTalkRoomSetting{" +
                "id=" + id +
                ", fgs_id=" + fgs_id +
                ", filtration='" + filtration + '\'' +
                ", created_at=" + created_at +
                '}';
    }
}
