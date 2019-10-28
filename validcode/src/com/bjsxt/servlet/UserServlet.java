package com.bjsxt.servlet;

import com.bjsxt.pojo.User;
import com.bjsxt.service.UserService;
import com.bjsxt.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user")
public class UserServlet extends HttpServlet {
    private UserService userService ;


    @Override
    public void init() throws ServletException {
        // 实现Tomcat启动时自动加载Spring配置文件
        ApplicationContext ac = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
        // 正常获取实例化对象。
        userService = ac.getBean("userService", UserServiceImpl.class);



    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        String code = (String) req.getSession().getAttribute("code");
        String validCode = req.getParameter("validcode");
        if (code.equals(validCode)){

            String uname = req.getParameter("name");
            String pwd = req.getParameter("password");
            int login = userService.login(new User(null, uname, pwd));
            if (login>0){
                resp.sendRedirect("success.jsp");
            }else {
                req.setAttribute("error", "登录失败");
                req.getRequestDispatcher("index.jsp").forward(req, resp);
            }
        }else {
            req.setAttribute("error", "验证码不正确");
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }



    }
}
