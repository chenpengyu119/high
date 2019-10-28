package com.bjsxt.service.impl;

import com.bjsxt.mapper.AnswerMapper;
import com.bjsxt.pojo.Answer;
import com.bjsxt.service.AnswerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class AnswerServiceImpl implements AnswerService {
    @Resource
    private AnswerMapper answerMapper;
    @Override
    public List<Answer> findAnswerList(int qid) {
        return answerMapper.findList(qid);
    }

    // 添加一条答案信息
    @Override
    public int insertOne(String ansCount, int qid) {
        return answerMapper.insertOne(ansCount, qid);
    }


}
