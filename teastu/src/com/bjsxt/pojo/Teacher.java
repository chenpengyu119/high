package com.bjsxt.pojo;

import java.util.List;

public class Teacher {
    private Integer tid;
    private String tname;

    private List<Student> studentList;

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", studentList=" + studentList +
                '}';
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Teacher(Integer tid, String tname, List<Student> studentList) {
        this.tid = tid;
        this.tname = tname;
        this.studentList = studentList;
    }

    public Teacher() {
    }
}
