package com.company;

public class registration {

    private int sid;
    private int cid;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "registration{" +
                "sid=" + sid +
                ", cid=" + cid +
                '}';
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public registration(int sid, int cid) {
        this.sid = sid;
        this.cid = cid;
    }
}
