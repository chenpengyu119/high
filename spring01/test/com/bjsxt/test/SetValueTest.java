package com.bjsxt.test;

import com.bjsxt.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 给bean的属性注入
 */
public class SetValueTest {

    /**
     * 使用set方法
     */
    @Test
    public void testSetBySetter() {
        String configLocation = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(configLocation);
        People people = ac.getBean("people2", People.class);
        System.out.println(people);
    }


}
