package com.bjsxt.service;

import com.bjsxt.pojo.Question;
import com.sun.xml.internal.messaging.saaj.packaging.mime.util.QEncoderStream;

import java.util.List;

public interface QuestionService {
    public List<Question> show();
    public int insertOne(String title,String detailDesc);

    public int update(int qid);
}
