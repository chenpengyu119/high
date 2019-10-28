package com.bjsxt.factory;

import com.bjsxt.pojo.People;

public class PeopleStaticFactory {
    public static People newInstance(){
        return new People(2,"静态工厂");
    }
}
