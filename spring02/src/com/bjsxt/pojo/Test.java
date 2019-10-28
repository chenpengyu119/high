package com.bjsxt.pojo;

import com.bjsxt.pojo.Demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 必须通过Spring取该对象才生效
        Demo demo = ac.getBean("demo", Demo.class);
        //demo.demo4("一个参数");
        try {
            demo.demo1();
        } catch (ArithmeticException e) {
            /*e.printStackTrace();*/
        }
    }
}
