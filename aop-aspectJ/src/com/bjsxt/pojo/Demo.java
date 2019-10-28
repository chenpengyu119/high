package com.bjsxt.pojo;

public class Demo {

    public void demo1(String arg1,int arg2){
        System.out.println("Demo1"+"------"+"参数1:"+arg1+"   参数2："+arg2);
    }

    public void demo2(){
        System.out.println("Demo2");
    }

    public void demo3(){
        int i = 5/0;
        System.out.println("Demo3");
    }
}
