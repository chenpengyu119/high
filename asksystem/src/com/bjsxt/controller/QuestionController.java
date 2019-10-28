package com.bjsxt.controller;

import com.bjsxt.service.QuestionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class QuestionController {
    /**
     * SpringMVC容器调用Spring容器中的内容
     */
    @Resource
    private QuestionService questionServiceImpl;

    // 查询问题列表
    @RequestMapping("toshow")
    public String toShow(HttpServletRequest req){

        req.setAttribute("questionList", questionServiceImpl.show());
        return "show.jsp";
    }

    // 转到提问页面
    @RequestMapping("toask")
    public String toAsk(){
        return "ask.jsp";
    }
    // 添加问题
    @RequestMapping("add")
    public String add(String title,String detailDesc,HttpServletRequest req){
        int n = questionServiceImpl.insertOne(title, detailDesc);
        if (n>0){
            return "forward:toshow";
        }else {
            req.setAttribute("error", "添加失败");
            return "ask";
        }
    }




}

