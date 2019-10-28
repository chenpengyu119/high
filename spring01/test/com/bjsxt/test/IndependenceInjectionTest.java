package com.bjsxt.test;

import com.bjsxt.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试Spring依赖注入功能
 */
public class IndependenceInjectionTest {

    @Test
    public void test1(){
        String configLocation = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(configLocation);
        People people = ac.getBean("people3", People.class);
        System.out.println(people);


    }
}
