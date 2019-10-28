package com.bjsxt.test;

import com.bjsxt.pojo.Demo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试基于AspectJ方式的AoP
 */
public class Test1 {
    String configLocation = "applicationContext.xml";
    ApplicationContext ac = new ClassPathXmlApplicationContext(configLocation);
    Demo demo = ac.getBean("demo", Demo.class);
    @Test
    public void testAspectJBefore(){
        demo.demo1("张三", 30);
    }

    @Test
    public void testAspectJAfter(){
        demo.demo2();
    }

    // 测试after标签和after-returning标签的区别
    @Test
    public void testAfterAndAfterReturning(){
        try {
            demo.demo3();
        }catch (Exception e){

        }
    }

}
