package com.bjsxt.factory;

import com.bjsxt.pojo.People;

public class PeopleFactory {
    public People newInstance(){
        return new People(1,"测试实例工厂");
    }
}
