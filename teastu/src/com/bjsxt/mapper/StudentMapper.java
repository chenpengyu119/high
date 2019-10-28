package com.bjsxt.mapper;

import com.bjsxt.pojo.Student;
import com.bjsxt.util.Page;

import java.util.List;

public interface StudentMapper {
    List<Student> findStu( Page page);

    /**
     * 根据tid查询教师表对应记录的学生列表
     * @param tid
     * @return
     */
    List<Student> findByTid(int tid);

    /**
     * 使用联合查询语句查询学生列表
     * @return
     */
     List<Student> selByUnion(Page page,String sname,String tname);


    /**
     * 条件查询总条数
     * @param sname
     * @param tname
     * @return
     */
    int findCount(String sname,String tname);
}
