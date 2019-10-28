package com.bjsxt.advice;

public class MyAfter {
    public void after(){
        System.out.println("001--after--后置通知---通过after配置");
    }

    public void afterByAfterReturning(){
        System.out.println("002--after-returning--后置通知--通过after-returning配置");
    }

    public void after2(){
        System.out.println("003---after2--后置通知---通过after配置");
    }

}
