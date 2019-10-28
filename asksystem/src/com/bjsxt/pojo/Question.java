package com.bjsxt.pojo;

import java.util.Date;

public class Question {

    private Integer id;
    private String title;
    private String detailDesc;
    private Integer answerCount;
    private Date lastModified;

    public Question() {
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", detailDesc='" + detailDesc + '\'' +
                ", answerCount=" + answerCount +
                ", lastModified=" + lastModified +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetailDesc() {
        return detailDesc;
    }

    public void setDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc;
    }

    public Integer getAnswerCount() {
        return answerCount;
    }

    public void setAnswerCount(Integer answerCount) {
        this.answerCount = answerCount;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public Question(Integer id, String title, String detailDesc, Integer answerCount, Date lastModified) {
        this.id = id;
        this.title = title;
        this.detailDesc = detailDesc;
        this.answerCount = answerCount;
        this.lastModified = lastModified;
    }
}
