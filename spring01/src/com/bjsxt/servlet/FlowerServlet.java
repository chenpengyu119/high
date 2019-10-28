package com.bjsxt.servlet;

import com.bjsxt.pojo.Flower;
import com.bjsxt.service.FlowerService;
import com.bjsxt.service.impl.FlowerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
/*loadOnStartup = 1 服务器启动时启动Servlet,否则等请求到来时再创建对象晚了*/
@WebServlet(value = "/servlet/FlowerServlet",loadOnStartup = 1)
public class FlowerServlet extends HttpServlet {
    private FlowerService flowerService;

    /**
     * 第一次加载Servlet时执行，方法执行完销毁，也就是取完Spring容器中的对象后销毁Spring容器对象。
     * 这样只执行一次， 而且执行完之后对象就销毁了
     * @throws ServletException
     */
    @Override
    public void init() throws ServletException {
        /*Spring和web整合后所有信息都存到WebApplicationContext*/
        // 实现Tomcat启动时自动加载Spring配置文件
        // 通过getServletContext()拿到web.xml配置，然后工具类解析，定位Spring配置文件。
       ApplicationContext ac = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
       // 正常获取实例化对象
        flowerService = ac.getBean("flowerService", FlowerServiceImpl.class);
    }


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        List<Flower> flowerList = flowerService.findAll();
        req.setAttribute("flowerList",flowerList);
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }


}
