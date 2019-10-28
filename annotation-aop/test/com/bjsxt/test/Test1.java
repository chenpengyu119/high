package com.bjsxt.test;

import com.bjsxt.pojo.Demo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试使用注解方式使用AoP
 */
public class Test1 {
    String configLocation = "applicationContext.xml";
    ApplicationContext ac = new ClassPathXmlApplicationContext(configLocation);
    Demo demo = ac.getBean("demo", Demo.class);

    @Test
    public void test1(){
        demo.demo1();
    }

    // 测试异常通知
    @Test
    public void test2(){
        try {
            demo.demo2();
        }catch (Exception e){

        }
    }

    // 测试环绕通知
    @Test
    public void test3(){
        demo.demo3();
    }

}
