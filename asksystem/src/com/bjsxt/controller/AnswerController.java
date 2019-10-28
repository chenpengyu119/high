package com.bjsxt.controller;

import com.bjsxt.pojo.Answer;
import com.bjsxt.service.AnswerService;
import com.bjsxt.service.QuestionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class AnswerController {
    @Resource
    private AnswerService answerServiceImpl;
    @Resource
    private QuestionService questionServiceImpl;

    // 查询单个问题信息
    @RequestMapping("todetail/{qid}")
    public String toDetail(@PathVariable int qid, HttpServletRequest req){
        List<Answer> answerList = answerServiceImpl.findAnswerList(qid);
        req.setAttribute("answerList", answerList);
        return "detail.jsp";
    }

    // 添加一个答案
    @RequestMapping("addAnswer")
    public String addAnswer(String ansCount,int qid,HttpServletRequest req){

        // 添加一条答案信息
        int i = answerServiceImpl.insertOne(ansCount, qid);
        // 更新问题表
        i+=questionServiceImpl.update(qid);
        if (i==2){
            return "forward:toshow";
        }else {
            req.setAttribute("error", "添加答案失败");
            return "detail.jsp";
        }
    }

}
