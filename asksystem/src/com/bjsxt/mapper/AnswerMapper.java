package com.bjsxt.mapper;

import com.bjsxt.pojo.Answer;

import java.util.List;

public interface AnswerMapper {
    // 查询单条问题详细信息
    public List<Answer> findList(int qid);

    // 添加一条答案信息
    public int insertOne(String ansCount, int qid);
}
