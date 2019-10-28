package com.bjsxt.servlet;

import com.bjsxt.pojo.Account;
import com.bjsxt.service.AccountService;
import com.bjsxt.service.impl.AccountServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ts")
public class TransferServlet extends HttpServlet {
    private AccountService accountService = new AccountServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        // 接收数据
        int outid = Integer.parseInt(req.getParameter("outid"));
        String pwd = req.getParameter("pwd");
        double money = Double.parseDouble(req.getParameter("money"));
        int inid = Integer.parseInt(req.getParameter("inid"));
        String aname = req.getParameter("aname");

        // 转账对象
        Account outAccount = new Account(outid, null, pwd, money);
        // 入账对象
        Account inAccount = new Account(inid, aname, null, money);
        int i = accountService.transferService(outAccount,inAccount);
        if (i==4){
            resp.sendRedirect(req.getContextPath()+"/log.jsp");
        }else {
            resp.sendRedirect(req.getContextPath()+"/error.jsp");
        }
    }
}
