package com.bjsxt.service;

import com.bjsxt.pojo.Log;
import com.bjsxt.pojo.Page;

public interface LogService {

    /**
     * 查询分页
     * @param page
     * @return
     */
    public Page findPageService(Page<Log> page);
}
