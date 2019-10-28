package com.bjsxt.advice;

public class MyThrowAcvice {
    public void myThrowAdvice(Exception e){

        System.out.println("出现了异常，我是异常通知k");
        System.out.println(e.getMessage());
    }
}
