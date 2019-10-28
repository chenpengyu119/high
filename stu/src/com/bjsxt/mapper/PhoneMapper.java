package com.bjsxt.mapper;

import com.bjsxt.pojo.Phone;
import com.bjsxt.util.Page;

import java.util.List;

public interface PhoneMapper {

    /**
     * 查询分页数据
     * @param page
     * @return
     */
    List<Phone> find(Page page,Phone phone);

    /**
     * 查询总记录数
     * @param phone
     * @param page
     * @return
     */
    int findCount(Page page,Phone phone);

    /**
     * 根据id删除记录
     * @param idList
     * @return
     */
    int delById(String[] idList);


}
