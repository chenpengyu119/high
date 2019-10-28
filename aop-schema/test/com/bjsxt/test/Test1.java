package com.bjsxt.test;

import com.bjsxt.pojo.Demo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    Demo demo = ac.getBean("demo", Demo.class);

    // 测试前置通知
    @Test
    public void testSchemaBeforeAdvice(){
        // 前置通知
        demo.demo1();
    }

    // 测试后置通知
    @Test
    public void testSchemaAfterAdvice(){
        demo.demo2();
    }

    // 异常通知
    @Test
    public void testSchemaThrowAdvice(){
        try {
            // 注意：service中的方法一般不捕获异常，否则Spring将无法执行异常通知
            demo.demo3();
        }catch (Exception e){
            // Do nothing
        }
    }

    // 环绕通知
    @Test
    public void testSchemaSurround(){
        demo.demo4();
    }


}
