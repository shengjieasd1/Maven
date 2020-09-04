package com.example.springbootweb.controller;


import com.example.springbootweb.util.controller.AbstractBaseController;
import com.example.springbootweb.vo.Member;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.Iterator;


@Controller
public class MemberController extends AbstractBaseController {
    @RequestMapping(value = "/get")
    @ResponseBody
    public String get(){
        System.out.println("除法计算："+(10/0));
        return "hello world";
    }
    
    
    
    @RequestMapping(value = "/addPre", method = RequestMethod.GET)
    public String addPre(){ //增加前的准备操作路径。
       return "member_add";
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Object add(@Valid Member vo, BindingResult result) {
        if(result.hasErrors()){
            Iterator<ObjectError> iterator = result.getAllErrors().iterator();
            while (iterator.hasNext()){
                ObjectError error = iterator.next();
                System.out.println("【错误信息】 code= "+error.getCode()+","+error.getDefaultMessage());
            }
            return result.getAllErrors();
        }else {
            return vo;
        }
    }
    
    
    
}