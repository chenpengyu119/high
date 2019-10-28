package com.bjsxt.advice;

import org.springframework.aop.ThrowsAdvice;

/**
 * 这个接口只是一个标记接口
 */
public class MyThrowAdvice implements ThrowsAdvice {

    public void afterThrowing(Exception e){
        System.out.println("基于Schema的异常通知，自定义方法，方法名按照规则");
        System.out.println("异常消息："+e.getMessage());
    }

}
