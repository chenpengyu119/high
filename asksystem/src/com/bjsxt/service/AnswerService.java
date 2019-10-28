package com.bjsxt.service;

import com.bjsxt.pojo.Answer;

import java.util.List;

public interface AnswerService {
    // 查询某个问题的所有答案信息
    public List<Answer> findAnswerList(int qid);

    // 添加一个答案信息
    public int insertOne(String ansCount,int qid);
}
