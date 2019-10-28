package com.bjsxt.mapper;

import com.bjsxt.pojo.Flower;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FlowerMapper {
    @Select("select * from flower")
    public List<Flower> findAll();
}
