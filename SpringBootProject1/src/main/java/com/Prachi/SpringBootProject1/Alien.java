package com.Prachi.SpringBootProject1;

import java.sql.Struct;

public class Alien {
    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname=" + aname +
                '}';
    }

    private int aid;
    private String aname;
}
