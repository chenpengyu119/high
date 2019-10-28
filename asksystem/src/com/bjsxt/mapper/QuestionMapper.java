package com.bjsxt.mapper;

import com.bjsxt.pojo.Answer;
import com.bjsxt.pojo.Question;

import java.util.List;

public interface QuestionMapper {

    public List<Question> findAll();

    public Integer add(String title,String detailDesc);

    // 更新一条信息
    public int update(int qid);
}
