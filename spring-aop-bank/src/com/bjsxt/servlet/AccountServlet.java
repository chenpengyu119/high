package com.bjsxt.servlet;

import com.bjsxt.pojo.Account;
import com.bjsxt.service.AccountService;
import com.bjsxt.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/account",loadOnStartup = 1)
public class AccountServlet extends BaseServlet {

    private AccountService accountService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        ServletContext sc = getServletContext();
        ApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(sc);
        System.out.println("代理的类--------------------------------------");
        System.out.println("类型名："+"类型名："+ac.getBean("accountService").getClass());
        // 传递第二个参数可以让SPring帮助强制转换，但是这个类型必须是接口类型，不能传递实现类。
        accountService = ac.getBean("accountService", AccountService.class);
        System.out.println("接口的类型");
        System.out.println(AccountService.class);
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
     /*   System.out.println("Spring管理的对象");
        for (String  name:beanDefinitionNames){
            System.out.println(name);
        }*/
    }

    public void checkNamePwd(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String outidStr = req.getParameter("outid");
        int outid = Integer.parseInt(outidStr);
        String apwd = req.getParameter("apwd");

        Account ac = accountService.checkNamePwd(outid, apwd);
        if (ac!=null){
            resp.getWriter().write(""+true);
        }else {
            resp.getWriter().write(""+false);
        }
    }

    public void transfer(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int outid = Integer.parseInt(req.getParameter("outid"));

        double money = Double.parseDouble(req.getParameter("money"));

        int inid = Integer.parseInt(req.getParameter("inid"));

        int i = accountService.transfer(outid,money,inid);
        if (i==2){
            resp.getWriter().write(""+true);
        }else {
            resp.getWriter().write(""+false);
        }

    }
}
