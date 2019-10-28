package com.bjsxt.service.impl;

import com.bjsxt.mapper.UserMapper;
import com.bjsxt.pojo.User;
import com.bjsxt.service.UserService;

public class UserServiceImpl  implements UserService {

    private UserMapper mapper;

    public UserMapper getMapper() {
        return mapper;
    }

    public void setMapper(UserMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int login(User user) {
        return mapper.selByUsers(user)!=null?1:0;
    }
}
