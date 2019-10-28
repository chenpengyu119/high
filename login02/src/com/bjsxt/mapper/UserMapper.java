package com.bjsxt.mapper;

import com.bjsxt.pojo.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Select("select * from users where uname=#{uname} and pwd= #{pwd}")
    public User find(User user);
}
