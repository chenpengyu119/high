package com.bjsxt.test;

import org.junit.Test;

public class Test1 {
    @Test
    public void test1(){
        byte b = 1;
        short s = 2;
        Object o = s+b;
        Object o2 = b+b;
        System.out.println(o.getClass());
        System.out.println(o2.getClass());
    }
}
