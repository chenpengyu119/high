package com.bjsxt.util;

import java.util.List;

public class Page<T> {
    private int pageSize;
    private int pageNum;
    private int total;
    private int pageCount;
    private int pageStart;

    /**
     * 查询条件
     */
    private String sname;
    private String tname;

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    private List<T> list;

    public Page() {
    }

    public Page(int pageSize, int pageNum, int total, int pageCount, List<T> list) {
        this.pageSize = pageSize;
        this.pageNum = pageNum;
        this.total = total;
        this.pageCount = pageCount;
        this.list = list;
    }

    public int getPageStart() {
        return (pageNum-1)*pageSize;
    }

    public void setPageStart(int pageStart) {
        this.pageStart = pageStart;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        // 计算总页数
        pageCount = (total%pageSize==0)?(total/pageSize):(total/pageSize+1);
        this.total = total;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Page{" +
                "pageSize=" + pageSize +
                ", pageNum=" + pageNum +
                ", total=" + total +
                ", pageCount=" + pageCount +
                ", list=" + list +
                '}';
    }
}
