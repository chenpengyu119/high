package com.bjsxt.service.impl;

import com.bjsxt.mapper.StudentMapper;
import com.bjsxt.pojo.Student;
import com.bjsxt.service.StudentService;
import com.bjsxt.util.MyBatisUtil;
import com.bjsxt.util.Page;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentServiceImpl implements StudentService {



    @Override
    public Page<Student> find(Page page, String sname, String tname) {

        SqlSession ss = MyBatisUtil.getSession();
        StudentMapper sm = ss.getMapper(StudentMapper.class);
        // 总记录数
        int total = sm.findCount(sname, tname);
        page.setTotal(total);

        // 查询学生列表，其实这里查询教师列表也是一样的结果
        List<Student> students = sm.selByUnion(page, sname, tname);

        page.setList(students);

        return page;
    }
}
