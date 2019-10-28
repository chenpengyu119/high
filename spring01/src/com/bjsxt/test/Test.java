package com.bjsxt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试由Spring管理的对象ClassB，其所依赖的对象ClassA是否只能交由Spring管理,也可以自己创建
 */
public class Test {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassB classB = ac.getBean("classB", ClassB.class);
        classB.bMethod();

    }
}
