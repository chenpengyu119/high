package com.bjsxt.service.impl;

import com.bjsxt.mapper.PhoneMapper;
import com.bjsxt.pojo.Phone;
import com.bjsxt.service.PhoneService;
import com.bjsxt.util.MyBatisUtil;
import com.bjsxt.util.Page;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class PhoneServiceImpl implements PhoneService {

    SqlSession ss = MyBatisUtil.getSession();
    PhoneMapper mapper = ss.getMapper(PhoneMapper.class);
    @Override
    public Page find(Phone phone, Page page) {

        int count = mapper.findCount(page, phone);
        page.setTotal(count);
        List<Phone> phoneList = mapper.find(page, phone);
        page.setList(phoneList);


        return page;
    }

    @Override
    public int del(String[] checks) {
        return mapper.delById(checks);
    }


}
