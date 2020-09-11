package com.example.springbootupload.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Aspect
@Component
public class ServiceAspect { //定义有一个业务层的拦截处理
    private Logger logger = LoggerFactory.getLogger(ServiceAspect.class);
    @Around("execution(* com.example..service..*.*(..))")
    public Object arroundInvoke(ProceedingJoinPoint point) throws Throwable {
        this.logger.info("【***Service-Before**】执行参数:"+ Arrays.toString(point.getArgs()));
        //进行核心业务调用
        Object object = point.proceed(point.getArgs());
        this.logger.info("【**Service-After**】返回结果"+object);
        return object;
    }
}
