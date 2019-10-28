package com.bjsxt.dynamicproxy.cjlib;

import net.sf.cglib.proxy.Enhancer;

public class Test {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        // 基于继承，生成的代理类是父类的子类
        enhancer.setSuperclass(Laozong.class);
        enhancer.setCallback(new Secret());

        Laozong laozong = (Laozong)enhancer.create();
        laozong.makeAim();


    }
}
