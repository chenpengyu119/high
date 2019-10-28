package com.bjsxt.test;

import com.bjsxt.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试Spring创建工厂的三种方式
 */
public class FactoryTest {
    @Test
    /**
     * 1.实例工厂
     */
    public void testInstanceFactory(){
        String configLocation = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(configLocation);
        People p = ac.getBean("peo", People.class);
        System.out.println(p);
    }
    @Test
    /**
     * 静态工厂
     */
    public void testStaticFactory(){
        String configLocation = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(configLocation);
        People p = ac.getBean("peo2", People.class);
        System.out.println(p);
    }

}
