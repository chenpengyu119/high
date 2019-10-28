package com.bjsxt.service;

import com.bjsxt.pojo.Student;
import com.bjsxt.util.Page;

public interface StudentService {
    public Page<Student> find(Page page1, String sname, String tname);
}
