package com.bjsxt.pojo;

import java.util.Date;

public class Answer {
    private Integer id;
    private String ansCount;
    private Date ansDate;
    private Integer qid;

    private Question question;

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", ansCount='" + ansCount + '\'' +
                ", ansDate=" + ansDate +
                ", qid=" + qid +
                ", question=" + question +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnsCount() {
        return ansCount;
    }

    public void setAnsCount(String ansCount) {
        this.ansCount = ansCount;
    }

    public Date getAnsDate() {
        return ansDate;
    }

    public void setAnsDate(Date ansDate) {
        this.ansDate = ansDate;
    }

    public Integer getQid() {
        return qid;
    }

    public void setQid(Integer qid) {
        this.qid = qid;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Answer(Integer id, String ansCount, Date ansDate, Integer qid, Question question) {
        this.id = id;
        this.ansCount = ansCount;
        this.ansDate = ansDate;
        this.qid = qid;
        this.question = question;
    }

    public Answer() {
    }
}
