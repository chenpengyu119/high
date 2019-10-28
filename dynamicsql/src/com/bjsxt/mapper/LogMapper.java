package com.bjsxt.mapper;

import com.bjsxt.pojo.Log;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LogMapper {

    /**
     * 根据入账和出帐账户查询转账记录
     * @param accin
     * @param accout
     * @return
     */
    // 使用@Param可以在xml中使用键名直接使用参数，实际的内部实现是转成了map
    public List<Log> selByAccinAccout(@Param("inid") String accin, @Param("outid") String accout);

    int updt(@Param("inid") String accin, @Param("outid") String accout);
}
