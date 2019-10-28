package com.bjsxt.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyArroud {
    @Around("com.bjsxt.pojo.Demo.demo3()")
    public void myArround(ProceedingJoinPoint p) throws Throwable {
        System.out.println("前面");
        p.proceed();
        System.out.println("后面");

    }
}
