package com.bjsxt.servlet;

import com.bjsxt.pojo.Phone;
import com.bjsxt.service.PhoneService;
import com.bjsxt.service.impl.PhoneServiceImpl;
import com.bjsxt.util.Page;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/servlet/phone")
public class PhoneServlet extends BaseServlet {

    private PhoneService phoneService = new PhoneServiceImpl();


    public void find(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        int pageSize = Integer.parseInt(req.getParameter("pageSize"));
        int pageNum = Integer.parseInt(req.getParameter("pageNum"));

        String name = req.getParameter("name");
        String phone = req.getParameter("phone");
        Page page = new Page();
        page.setPageSize(pageSize);
        page.setPageNum(pageNum);

        Phone phone1 = new Phone();
        phone1.setName(name);
        phone1.setPhone(phone);

        Page page1 =  phoneService.find(phone1,page);

        resp.getWriter().write(new Gson().toJson(page1));


    }

    public void del(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String[] checks = req.getParameterValues("chec");
        int i = phoneService.del(checks);
        if (i>0){
            resp.sendRedirect(req.getContextPath()+"/phone.jsp");
        }

    }

}
