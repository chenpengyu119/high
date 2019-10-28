package com.bjsxt.servlet;

import com.bjsxt.pojo.Log;
import com.bjsxt.pojo.Page;
import com.bjsxt.service.LogService;
import com.bjsxt.service.impl.LogServiceImpl;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet( "/log")
public class LogServlet extends HttpServlet {

    private LogService logService = new LogServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        int pageNum = Integer.parseInt(req.getParameter("pageNum"));
        int pageSize = Integer.parseInt(req.getParameter("pageSize"));

        Page<Log> page = new Page<>();
        page.setPageNum(pageNum);
        page.setPageSize(pageSize);

        Page page2 = logService.findPageService(page);
        resp.getWriter().write(new Gson().toJson(page2));

    }
}
