package com.bjsxt.filter;

import com.bjsxt.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 最初由Spring框架提出，整合Hibenate框架时使用的就是OpenSessionInView
 */
// 拦截所有Servlet
@WebFilter("/*")
public class OpenSessionInView implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        SqlSession ss = MyBatisUtil.getSession();

        try {
            chain.doFilter(req, resp);
            ss.commit();
        }catch (Exception e){
            ss.rollback();
            e.printStackTrace();
        }finally {
            MyBatisUtil.closeSession();
        }
    }

    @Override
    public void destroy() {

    }


}
