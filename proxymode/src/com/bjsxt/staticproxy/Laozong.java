package com.bjsxt.staticproxy;

public class Laozong implements Function{
    private String name;

    public Laozong(String name) {
        this.name = name;
    }

    public Laozong() {
    }

    @Override
    public void makeAims() {
        System.out.println("谈一个小目标");
    }

    @Override
    public void eat() {
        System.out.println("云云吃饭");
    }
}
