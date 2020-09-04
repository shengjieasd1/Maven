package com.example.springbootweb.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

//@ControllerAdvice //作为一个控制层的切面处理
//public class GlobalExceptionHandler {
//    public static final String DEFAULT_ERROR_VIEW = "error"; // 定义错误显示页
//
//   @ExceptionHandler(value = Exception.class) //所有异常都时Exception子类
//    public ModelAndView defaultErrorHandler(HttpServletRequest request,Exception e){
//        ModelAndView mav = new ModelAndView(DEFAULT_ERROR_VIEW); //设置跳转路径
//        mav.addObject("exceptionObject",e); //将异常对象传递过去
//        mav.addObject("url",request.getRequestURL()); //获取请求的路径
//        return mav;
//    }
//
//}
@RestControllerAdvice //作为一个控制层的切面处理
public class GlobalExceptionHandler {
    public static final String DEFAULT_ERROR_VIEW = "error"; // 定义错误显示页
   
   @ExceptionHandler(value = Exception.class) //所有异常都时Exception子类
   public Object defaultErrorHandler(HttpServletRequest request,Exception e){
       class ErrorInfo{
           
           private Integer code;
           private String message;
           private String url;
    
           public Integer getCode() {
               return code;
           }
    
           public void setCode(Integer code) {
               this.code = code;
           }
    
           public String getMessage() {
               return message;
           }
    
           public void setMessage(String message) {
               this.message = message;
           }
    
           public String getUrl() {
               return url;
           }
    
           public void setUrl(String url) {
               this.url = url;
           }
           
       }
       ErrorInfo info = new ErrorInfo();
       info.setCode(100); //标记一个错误信息的类型
       info.setMessage(e.getMessage());
       info.setUrl(request.getRequestURI());
       return info;
   }

}
