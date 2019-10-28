package com.bjsxt.test;

import com.bjsxt.mapper.StudentMapper;
import com.bjsxt.pojo.Student;
import com.bjsxt.util.MyBatisUtil;
import com.bjsxt.util.Page;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class StudentTest {

    /**
     * 使用N+1方式查询学生信息
     */
    @Test
    public void findStuTest(){
        SqlSession ss = MyBatisUtil.getSession();
        StudentMapper sm = ss.getMapper(StudentMapper.class);
        List<Student> students = sm.findStu(new Page());
        System.out.println(students);
    }

    /**
     * 测试联合查询语句
     */
    @Test
    public void testSelByUnion(){
        SqlSession ss = MyBatisUtil.getSession();
        StudentMapper sm = ss.getMapper(StudentMapper.class);
        Page page = new Page();
        page.setPageSize(20);
        page.setPageNum(1);
        List<Student> students = sm.selByUnion(page,"","");

        System.out.println(students);
    }

    @Test
    public void testFindCount(){
        SqlSession ss = MyBatisUtil.getSession();
        StudentMapper sm = ss.getMapper(StudentMapper.class);
        Page page = new Page();
        page.setPageSize(20);
        page.setPageNum(1);
        int count = sm.findCount("学生1","老师1");
        System.out.println(count);
    }


}
