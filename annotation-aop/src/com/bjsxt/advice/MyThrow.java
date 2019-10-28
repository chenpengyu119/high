package com.bjsxt.advice;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyThrow {
    @AfterThrowing("com.bjsxt.pojo.Demo.demo2()")
    public void myThrow(){
        System.out.println("异常通知");
    }
}
