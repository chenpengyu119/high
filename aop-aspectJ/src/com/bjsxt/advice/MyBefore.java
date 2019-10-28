package com.bjsxt.advice;

/**
 * 不需要实现接口
 * 在aop:config标签中使用属性ref配置通知类
 * ApectJ方式只能获得切点方法参数，在配置切点标签时声明
 */
public class MyBefore {

    public void before(String name,int age){
        System.out.println("前置通知："+"参数1:"+name+"参数2:"+age);
    }

}
