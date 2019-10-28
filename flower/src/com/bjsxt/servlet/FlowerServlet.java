package com.bjsxt.servlet;

import com.bjsxt.pojo.Flower;
import com.bjsxt.service.FlowerService;
import com.bjsxt.service.impl.FlowerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "FlowerServlet",urlPatterns = "/servlet/FlowerServlet")
public class FlowerServlet extends HttpServlet {

    private FlowerService flowerService = new FlowerServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        List<Flower> flowerList = flowerService.findAll();
        req.setAttribute("flowerList", flowerList);
        req.getRequestDispatcher("/show.jsp").forward(req, resp);

    }
}
