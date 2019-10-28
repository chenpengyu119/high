package com.bjsxt.pojo;

public class Student {
    private Integer sid;
    private String sname;
    private Integer sage;
    private Integer tid;

    private Teacher teacher;

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sage=" + sage +
                ", tid=" + tid +
                ", teacher=" + teacher +
                '}';
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student(Integer sid, String sname, Integer sage, Integer tid, Teacher teacher) {
        this.sid = sid;
        this.sname = sname;
        this.sage = sage;
        this.tid = tid;
        this.teacher = teacher;
    }

    public Student() {
    }
}
