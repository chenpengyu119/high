package com.bjsxt.pojo;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
public class Demo {
    // 切点
    @Pointcut("execution(* com.bjsxt.pojo.Demo.demo1())")
    public void demo1(){
        System.out.println("Demo1");
    }

    // 这个名字随便起，但是为了方便记忆，所以规范配置
    @Pointcut("execution(* com.bjsxt.pojo.Demo.demo2())")
    public void demo2(){
        int i=5/0;
        System.out.println("Demo2");
    }

    // 环绕通知
    @Pointcut("execution(* com.bjsxt.pojo.Demo.demo3())")
    public void demo3(){
        System.out.println("Demo3");
    }
}
