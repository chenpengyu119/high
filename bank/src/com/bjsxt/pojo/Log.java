package com.bjsxt.pojo;

public class Log {
    private Integer inid;
    private Integer outid;
    private Double money;

    public Log() {
    }

    public Log(Integer inid, Integer outid, Double money) {
        this.inid = inid;
        this.outid = outid;
        this.money = money;
    }

    public Integer getInid() {
        return inid;
    }

    public void setInid(Integer inid) {
        this.inid = inid;
    }

    public Integer getOutid() {
        return outid;
    }

    public void setOutid(Integer outid) {
        this.outid = outid;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Log{" +
                "inid=" + inid +
                ", outid=" + outid +
                ", money=" + money +
                '}';
    }
}

