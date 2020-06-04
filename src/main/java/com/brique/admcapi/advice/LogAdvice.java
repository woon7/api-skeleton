package com.brique.admcapi.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAdvice {
    Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());

    @Around("execution(* com.brique.admcapi.service.*.*(..))")
    public Object logInfo(ProceedingJoinPoint pjp) throws Throwable {
        String point = pjp.getSignature().getDeclaringTypeName() + "." + pjp.getSignature().getName();
        logger.info("[Start] " + point);
        long startTime = System.currentTimeMillis();
        Object result = pjp.proceed();
        long endTime = System.currentTimeMillis();
        logger.info("[End] " + point + " (in " + (endTime - startTime) + " ms)");
        return result;
    }

    @After("execution(com.brique.admcapi.dto.ResponseDto com.brique.admcapi.advice.ExceptionHandleAdvice.*(*))")
    public void logError(JoinPoint jp) {
        Exception e = (Exception) jp.getArgs()[0];
        logger.error(e.getMessage());
    }
}
