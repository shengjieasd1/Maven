package com.example.springbootweb.controller;

import com.example.springbootweb.helper.CommonMethod;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/test")
public class Controller{
    @RequestMapping(value = "/echo",method = RequestMethod.GET)
    public String echo(String mid){
        return "aaa";
    }
    
    
    
    @RequestMapping(value = "/echo1/{message}",method = RequestMethod.GET)
    public String echo1(@PathVariable("message") String msg){
        return "【ECHO】"+msg;
    }
    
    
    @RequestMapping("/object")
    public String object(HttpServletRequest request, HttpServletResponse response){
        System.out.println("****客户IP地址："+request.getRemoteAddr());
        System.out.println("****取得客户端相应编码"+response.getCharacterEncoding());
        System.out.println("**** 取得SessionID:"+request.getSession().getId());
        System.out.println("**** 取得真实路径:"+request.getServletContext().getRealPath("/upload/"));
        return "aaaa";
    }
    
    
    @GetMapping("/date")
    public String getDate(){
        Date date = CommonMethod.getCurDate();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "北京时间为:"+df.format(date);
    }
}
