package com.bjsxt.pojo;

public class Flower {
    private Integer id;
    private String name;
    private Double price;
    /**
     * 产地
     */
    private String production;

    public Flower() {
    }

    public Flower(Integer id, String name, Double price, String production) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.production = production;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", production='" + production + '\'' +
                '}';
    }
}
