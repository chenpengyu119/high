package com.bjsxt.staticproxy;

public class Secret implements Function {
    private Laozong laozong = new Laozong("yunyun");
    @Override
    public void makeAims() {
        System.out.println("找马总吗");
        laozong.makeAims();
        System.out.println("备注访客信息");

    }

    @Override
    public void eat() {
        System.out.println("找马总吗");
        laozong.eat();
        System.out.println("备注访客信息");
    }
}
