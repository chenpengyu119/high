package com.bjsxt.mapper;

import com.bjsxt.pojo.Account;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface AccountMapper {

    @Select("select * from account where aid=#{param1} and apwd=#{param2}")
    public Account findByNamePwd(int oudit,String apwd);

    @Update("updata into account set money = money + #{param2} where aid = #{param1}")
    public int update(int aid,double money);

    @Update("updata into account set mony = mony + #{param2} where aid = #{param1}")
    public int update2(int aid,double money);
}
