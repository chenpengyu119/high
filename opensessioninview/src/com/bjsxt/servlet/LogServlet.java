package com.bjsxt.servlet;

import com.bjsxt.pojo.Log;
import com.bjsxt.service.LogService;
import com.bjsxt.service.impl.LogServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/log")
public class LogServlet extends HttpServlet {
    private LogService logService = new LogServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        int outid = Integer.parseInt(req.getParameter("outid"));

        int inid = Integer.parseInt(req.getParameter("inid"));

        double money  = Double.parseDouble(req.getParameter("money"));
        int i = logService.add(new Log(inid, outid, money));

        if (i>0){
            resp.sendRedirect(req.getContextPath()+"/success.jsp");
        }else {
            resp.sendRedirect(req.getContextPath()+"/error.jsp");
        }
    }
}
