package com.bjsxt.test;

public class ClassB {

    private ClassA classA = new ClassA();

    public void bMethod(){
        classA.aMethod();
    }
}
