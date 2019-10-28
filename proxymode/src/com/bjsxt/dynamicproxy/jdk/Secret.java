package com.bjsxt.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Secret  implements InvocationHandler {
    /**
     * 1. 可以使用反射获取代理对象的信息（也就是proxy.getClass().getName()）。
     * 2. 可以将代理对象返回以进行连续调用，这就是proxy存在的目的，因为this并不是代理对象。
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // proxy是生成的真实代理对象
        System.out.println("接待客人");
        new Laozong().makeAim();
        System.out.println("备注客人信息");
        System.out.println(proxy.getClass().getName());

        return null;
    }
}
