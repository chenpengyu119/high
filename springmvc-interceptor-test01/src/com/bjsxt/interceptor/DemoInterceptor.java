package com.bjsxt.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoInterceptor implements HandlerInterceptor {
    // 进入控制器之前执行，如果返回false，则不进入控制器
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandler----------拦截的控制器方法"+handler);

        return true;
    }

    // 控制器执行完成后，进入jsp之前执行
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandler");
        System.out.println("往哪跳："+modelAndView.getViewName());
        String word  = (String) modelAndView.getModel().get("model");
        String newWord = word.replace("祖国", "**");
        modelAndView.getModel().put("model", newWord );
        System.out.println("model的值："+modelAndView.getModel().get("model"));

    }
    // jsp执行结束后执行
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion");
    }
}
