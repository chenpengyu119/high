package com.bjsxt.dynamicproxy.jdk;

public class Laozong implements ProxyInterface{

    @Override
    public Object makeAim() {
        System.out.println("谈小目标");
        return null;
    }
}
