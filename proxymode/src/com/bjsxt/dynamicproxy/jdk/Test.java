package com.bjsxt.dynamicproxy.jdk;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        Secret secret = new Secret();
        ProxyInterface p  = (ProxyInterface) Proxy.newProxyInstance(Test.class.getClassLoader(), new Class[]{ProxyInterface.class}, secret);
        ProxyInterface p2 = (ProxyInterface) p.makeAim();
        System.out.println("代理类的类型");
        System.out.println(p.getClass());
        //p2.makeAim();
        p.makeAim();
    }
}
