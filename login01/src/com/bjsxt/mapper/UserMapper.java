package com.bjsxt.mapper;

import com.bjsxt.pojo.User;

public interface UserMapper {
    /**
     * 根据用户名和密码查询用户信息
     * @param user
     * @return
     */
    public User find(User user);
}
