package com.bjsxt.pojo;

public class Desk {
    private Integer id;
    private double price;

    public Desk() {
    }

    public Desk(Integer id, double price) {
        this.id = id;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Desk{" +
                "id=" + id +
                ", price=" + price +
                '}';
    }
}
