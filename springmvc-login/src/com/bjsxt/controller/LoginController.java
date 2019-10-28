package com.bjsxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @RequestMapping("login")
    public String login(String uname, String password, HttpServletRequest req){

        if (uname.equals("zhangsan") && password.equals("123")){
            return "redirect:/success.jsp";
        }else {
            req.setAttribute("error", "用户名或密码不正确");
            return "forward:/index.jsp";
        }

    }

    /**
     * Restful格式
     * @param uname
     * @param password
     * @param req
     * @return
     */
    @RequestMapping("login2/{uname}/{password}")
    public String login2(@PathVariable String uname, @PathVariable String password, HttpServletRequest req){
        if (uname.equals("zhangsan") && password.equals("123")){
            return "redirect:/success.jsp";
        }else {
            req.setAttribute("error", "用户名或密码不正确");
            return "forward:/index.jsp";
        }

    }

}
