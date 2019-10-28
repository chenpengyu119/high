package com.bjsxt.pojo;

import java.util.List;

/**
 * @author pengyu
 */
public class Page<T> {

    private int pageNum;
    private int pageSize;

    private int pageCount;
    private int pageStart;

    // 总数据条数
    private int totalCount;

    private List<T> list;

    public Page() {
    }

    public Page(int pageNum, int pageSize, int pageCount, List<T> list) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.pageCount = pageCount;
        this.list = list;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        // 计算总页数
        pageCount = (int)Math.ceil((totalCount*1.0)/pageSize);
        setPageCount(pageCount);
        this.totalCount = totalCount;
    }

    public int getPageNum() {
        return pageNum;
    }

    public int getPageStart() {
        pageStart = (pageNum-1)*pageSize;
        return pageStart;
    }

    public void setPageStart(int pageStart) {
        this.pageStart = pageStart;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
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
                "pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", pageCount=" + pageCount +
                ", list=" + list +
                '}';
    }
}
