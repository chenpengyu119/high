package com.bjsxt.servlet;

import com.bjsxt.pojo.Student;
import com.bjsxt.pojo.Teacher;
import com.bjsxt.service.StudentService;
import com.bjsxt.service.impl.StudentServiceImpl;
import com.bjsxt.util.Page;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/servlet/StudentServlet")
public class StudentServlet extends BaseServlet {

    private StudentService studentService = new StudentServiceImpl();

    public void findStu(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 设置编码格式
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        // 接收数据
        String pageSizeStr = req.getParameter("pageSize");
        int pageSize = 2;
        if (pageSizeStr!=null&&!"".equals(pageSizeStr)){
            pageSize = Integer.parseInt(pageSizeStr);
        }
        String pageNumStr = req.getParameter("pageNum");
        int pageNum = 1;
        if (pageNumStr!=null&&!"".equals(pageNumStr)){
            pageNum = Integer.parseInt(pageNumStr);
        }

        String sname = req.getParameter("sname");
        String tname = req.getParameter("tname");

        Page page1 = new Page();
        page1.setPageNum(pageNum);
        page1.setPageSize(pageSize);

        page1.setSname(sname);
        page1.setTname(tname);

        Page<Student> page = studentService.find(page1,sname,tname);

        req.setAttribute("page", page);
        req.getRequestDispatcher("/index.jsp").forward(req, resp);


    }
}
