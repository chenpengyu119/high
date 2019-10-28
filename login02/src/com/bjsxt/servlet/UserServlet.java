package com.bjsxt.servlet;

import com.bjsxt.pojo.User;
import com.bjsxt.service.UserService;
import com.bjsxt.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/user",loadOnStartup = 1)
public class UserServlet extends HttpServlet {
    private UserService userService;
    @Override
    public void init() throws ServletException {
        ApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
        userService = ac.getBean("userServiceImpl", UserServiceImpl.class);
    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        String uname = req.getParameter("uname");
        String password = req.getParameter("password");
        User user = userService.login(new User(null, uname, password));
        if (user!=null){
            resp.sendRedirect("success.jsp");
        }else {
            req.setAttribute("error", "登录失败");
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }
    }

}
