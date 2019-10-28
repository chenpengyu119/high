package com.bjsxt.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyBefore {
    @Before("com.bjsxt.pojo.Demo.demo1()")
    public void before(){
        System.out.println("前置通知");
    }
}
