package com.bjsxt.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MySurroundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        System.out.println("环绕通知--切点执行前");
        // 执行切点方法
        Object proceed = methodInvocation.proceed();
        System.out.println("环绕通知--切点执行后");

        return proceed;
    }
}
