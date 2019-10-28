package com.bjsxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

    @RequestMapping("demo4")
    public String demo1(Model model){
        model.addAttribute("model", "祖国");
        System.out.println("demo1");
        return "index";
    }

}
