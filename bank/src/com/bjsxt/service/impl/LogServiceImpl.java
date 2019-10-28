package com.bjsxt.service.impl;

import com.bjsxt.pojo.Log;
import com.bjsxt.pojo.Page;
import com.bjsxt.service.LogService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class LogServiceImpl implements LogService {
    @Override
    public Page findPageService(Page<Log> page) {

        InputStream is = null;
        try {
            is =Resources.getResourceAsStream("mybatis.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession ss = factory.openSession();

        // 查询分页数据
        List<Log> logList = ss.selectList("com.bjsxt.mapper.LogMapper.selP", page);
        page.setList(logList);

        // 查询总记录数
        int count = ss.selectOne("com.bjsxt.mapper.LogMapper.selCount");
        page.setTotalCount(count);

        return page;
    }


}
