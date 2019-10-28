package com.bjsxt.pojo;

public class Account {
    private Integer aid;
    private String aname;
    private String apwd;
    private Double money;
    public Account() {
    }

    @Override
    public String toString() {
        return "Account{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", apwd='" + apwd + '\'' +
                ", money=" + money +
                '}';
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getApwd() {
        return apwd;
    }

    public void setApwd(String apwd) {
        this.apwd = apwd;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Account(Integer aid, String aname, String apwd, Double money) {
        this.aid = aid;
        this.aname = aname;
        this.apwd = apwd;
        this.money = money;
    }
}
