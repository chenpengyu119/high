package com.bjsxt.mapper;

import com.bjsxt.pojo.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    /**
     * 查询用户信息
     */
    @Select("select * from users where uname = #{uname} and pwd = #{pwd}")
    User selByUsers(User user);
}
