package com.bjsxt.dynamicproxy.cjlib;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.io.OutputStream;
import java.lang.reflect.Method;

public class Secret implements MethodInterceptor {


    /**
     *
     * @param o 代理对象
     * @param method 真实方法
     * @param objects  参数
     * @param methodProxy 代理方法
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        // o是真实代理对象
        System.out.println("接待客人");
        // 子类调用父类方法
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("备注客人信息");
        return null;
    }
}
