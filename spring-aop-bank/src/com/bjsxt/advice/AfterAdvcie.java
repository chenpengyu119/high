package com.bjsxt.advice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterAdvcie implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {

       Logger logger = LogManager.getLogger(AfterAdvcie.class);
       logger.debug(args[0]+"给"+args[2]+"转了"+args[1]+"元钱");
    }
}
