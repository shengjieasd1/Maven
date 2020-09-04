package com.example.springbootweb.controller;

import com.example.springbootweb.serivce.IMessageService;
import com.example.springbootweb.util.controller.AbstractBaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class MessageController extends AbstractBaseController {
    
    @Resource
    private IMessageService messageService;
    @RequestMapping(value = "/", method = RequestMethod.GET)
    
    public String index(){
        return this.messageService.info();
    }
    
    
    
    @RequestMapping(value = "/echo", method = RequestMethod.GET)
    public String echo(String mid) {
        System.out.println("【*** 访问地址 ***】" + super.getMessage("member.add.action"));
        return super.getMessage("welcome.msg", mid);
    }
}