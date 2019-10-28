package com.bjsxt.test;

import com.bjsxt.service.FlowerService;
import com.bjsxt.service.impl.FlowerServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试Spring整合Mybatis
 */
public class ReduceMyBatis {

    @Test
    public void test1(){
        /*默认去classes文件根目录找配置文件*/
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*获取所有Spring管理的类的名称*/
        String [] names = ac.getBeanDefinitionNames();
        for (String str:names){
            System.out.println(str+"\t");
        }
    }

    /**
     * 测试数据库访问
     */
    @Test
    public void test2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        FlowerService flowerService = ac.getBean("flowerService", FlowerServiceImpl.class);
        System.out.println(flowerService.findAll());
    }
}
