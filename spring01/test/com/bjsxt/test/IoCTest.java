package com.bjsxt.test;

import com.bjsxt.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试Spring的IoC功能
 */
public class IoCTest {

    @Test
    public void test1(){

        String configLocation = "applicationContext.xml";
        // ClassPathXmlApplicationContext从类路径下加载一个配置文件，然后生成applicationContext
        ApplicationContext ac = new ClassPathXmlApplicationContext(configLocation);
        People people = ac.getBean("people", People.class);
        System.out.println(people);

        // 获取Spring容器中目前管理的所有的类
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();

        /*for (String name:beanDefinitionNames){
            System.out.println(name);
        }*/

    }
}
