package com.bjsxt.mapper;

import com.bjsxt.pojo.Teacher;
import com.bjsxt.util.Page;

import java.util.List;

public interface TeacherMapper {
     Teacher findTeacherById(int tid);

     /**
      * 使用N+1方式查询所有教师信息
      * @return
      */
     List<Teacher> findTeaList();

     /**
      * 使用联合查询语句查询所有教师信息
      * @return
      */
     List<Teacher> findByUnion(Page page, String sname, String tname);
}
