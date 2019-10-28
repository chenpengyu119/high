package com.bjsxt.test;

import com.bjsxt.mapper.PhoneMapper;
import com.bjsxt.pojo.Phone;
import com.bjsxt.util.MyBatisUtil;
import com.bjsxt.util.Page;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class PhoneTest {

    SqlSession ss = MyBatisUtil.getSession();
    PhoneMapper mapper = ss.getMapper(PhoneMapper.class);

    /**
     * 测试查询分页数据
     */
    @Test
    public void testFind(){

        Page page = new Page();
        page.setPageSize(4);
        page.setPageNum(1);

        Phone phone = new Phone();
        phone.setName("李");

        List<Phone> phoneList = mapper.find(page, phone);
    }

    /**
     * 测试查询总记录数
     */
    @Test
    public void testFindCount(){
        Phone phone = new Phone();
        int count = mapper.findCount(new Page(),phone);
        System.out.println(count);
    }

    /**
     * 测试删除
     */
    @Test
    public void testDelById(){
        String[] arr = new String[10];
        arr[0] = "1";
        int i = mapper.delById(arr);
        System.out.println(i);
    }


}
