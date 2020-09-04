package com.example.springbootweb.controller;

import com.example.springbootweb.serivce.IMessageService;
import com.example.springbootweb.util.controller.AbstractBaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@Controller
public class MessageController extends AbstractBaseController {
    
    //@Resource
    //private IMessageService messageService;
    //@RequestMapping(value = "/", method = RequestMethod.GET)
    //
    //public String index(){
    //    return this.messageService.info();
    //}
    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String show(String mid, Model model) {
        model.addAttribute("url","wwwwaaa");
        model.addAttribute("mid",mid);
        return "message/message_show";//此处只返回一个路径，该路径没有设置后缀，默认为*.html
        
    }
    
    
    @RequestMapping(value = "/echo", method = RequestMethod.GET)
    public String echo(String mid) {
        System.out.println("【*** 访问地址 ***】" + super.getMessage("member.add.action"));
        return super.getMessage("welcome.msg", mid);
    }
}