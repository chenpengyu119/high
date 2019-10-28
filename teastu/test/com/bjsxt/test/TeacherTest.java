package com.bjsxt.test;

import com.bjsxt.mapper.TeacherMapper;
import com.bjsxt.pojo.Teacher;
import com.bjsxt.util.MyBatisUtil;
import com.bjsxt.util.Page;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.TreeMap;

public class TeacherTest {


    /**
     * 使用N+1方式查询所有教师数据
     *
     */
    @Test
    public void findListTest(){
        SqlSession ss  = MyBatisUtil.getSession();
        TeacherMapper tm = ss.getMapper(TeacherMapper.class);

        List<Teacher> teachers = tm.findTeaList();
        System.out.println(teachers);
    }

    @Test
    public void findByUnion(){
        SqlSession ss  = MyBatisUtil.getSession();
        TeacherMapper tm = ss.getMapper(TeacherMapper.class);

        Page page = new Page();
        page.setPageSize(20);
        page.setPageNum(1);
        List<Teacher> teachers = tm.findByUnion(page,"学生1","老师1");
        System.out.println(teachers);
    }
}
