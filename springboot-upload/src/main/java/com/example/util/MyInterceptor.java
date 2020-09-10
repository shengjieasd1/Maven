package com.example.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author shuzheng
 */
public class MyInterceptor implements HandlerInterceptor {
    
    private Logger logger = LoggerFactory.getLogger(MyInterceptor.class);
    
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        this.logger.info("【** MyInterceptor.preHandle **】" + handlerMethod.getBean().getClass().getSimpleName());
        //如果返回false表示不继续请求，如果返回true表示继续请求
        return true;
    }
    
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        this.logger.info("【** MyInterceptor.postHandle **】" + handlerMethod.getBean().getClass().getSimpleName());
        this.logger.info("【** MyInterceptor.postHandle **】" + modelAndView);
    
    }
    
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        this.logger.info("【** MyInterceptor.afterCompletion **】拦截处理完毕");
    }
}
