package com.bjsxt.servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@WebServlet("/validcode")
public class ValidCodeServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 创建图片对象
        BufferedImage image = new BufferedImage(200, 100, BufferedImage.TYPE_INT_RGB);

        // 创建画板
        Graphics2D graphics = image.createGraphics();
        // 在画之前必须先设置画笔
        graphics.setColor(Color.WHITE);
        // 填充矩形
        graphics.fillRect(0, 0, 200, 100);

        List<Integer> validList = new ArrayList<>();
        // 产生4个0到9之间的随机数
        for (int i = 0; i < 4; i++) {
            validList.add(new Random().nextInt(10));
        }


        Color[] colors = new Color[]{Color.BLUE,Color.PINK,Color.CYAN,Color.green,Color.MAGENTA,Color.red,Color.yellow};


        // 设置字体 ,字体大小单位是像素，格式之间使用|分隔
        graphics.setFont(new Font("宋体", Font.BOLD|Font.ITALIC, 40));
        for (int i=0;i<validList.size();i++){
            // 设置画笔颜色
            graphics.setColor(colors[new Random().nextInt(colors.length)]);
            // 填充字符
            graphics.drawString(""+validList.get(i), i*40, 70+(new Random().nextInt(21)-10));
        }

        // 画斜线
        for (int i = 0; i < 2; i++) {
            graphics.setColor(colors[new Random().nextInt(colors.length)]);
            graphics.drawLine(0, new Random().nextInt(101), 200, new Random().nextInt(101));
        }


        // 创建输出流
        ServletOutputStream outputStream = resp.getOutputStream();

        // 使用ImageIo工具类将图片输出到输出流中
        ImageIO.write(image, "jpg", outputStream);

        // 将验证码放入Session中
        HttpSession session = req.getSession();
        session.setAttribute("code", ""+validList.get(0)+validList.get(1)+validList.get(2)+validList.get(3));

    }
}
