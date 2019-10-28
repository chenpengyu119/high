package com.bjsxt.service.impl;

import com.bjsxt.mapper.QuestionMapper;
import com.bjsxt.pojo.Question;
import com.bjsxt.service.QuestionService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {
    // 设置依赖注入
    @Resource
    private QuestionMapper questionMapper;
    @Override
    public List<Question> show() {
        return questionMapper.findAll();
    }

    // 添加一个问题
    @Override
    public int insertOne(String title,String detailDesc) {
        return questionMapper.add(title, detailDesc);
    }

    // 更新问题回答数和最后修改时间
    @Override
    public int update(int qid) {
        return questionMapper.update(qid);
    }
}
