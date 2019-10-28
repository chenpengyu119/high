package com.bjsxt.mapper;

import com.bjsxt.pojo.Log;

import java.util.List;

public interface LogMapper {
    int ins(Log log);
    List<Log> sel();
}
