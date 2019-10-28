package com.bjsxt.advice;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

    public class MyBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("切点方法"+method+"切点方法名："+method.getName());
        System.out.println("切点方法参数："+ Arrays.toString(objects));
        System.out.println("切点对象："+o);
        System.out.println("我是前置通知");
    }
}
