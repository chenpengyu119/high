package com.bjsxt.service.impl;

import com.bjsxt.mapper.LogMapper;
import com.bjsxt.pojo.Log;
import com.bjsxt.service.LogService;
import com.bjsxt.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

public class LogServiceImpl implements LogService {
    @Override
    public int add(Log log) {

        SqlSession ss  = MyBatisUtil.getSession();
        LogMapper mapper = ss.getMapper(LogMapper.class);
        return mapper.ins(log);
    }

    public static void main(String[] args) {
        SqlSession ss  = MyBatisUtil.getSession();
        LogMapper dao = ss.getMapper(LogMapper.class);
        System.out.println(dao.sel());
    }

}
