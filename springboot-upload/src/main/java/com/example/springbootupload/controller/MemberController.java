package com.example.springbootupload.controller;

import com.example.springbootupload.service.IMemberService;
import com.example.springbootupload.util.controller.AbstractBaseController;
import com.example.springbootupload.vo.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class MemberController extends AbstractBaseController {
    @RequestMapping(value = "/member_add_pre",method = RequestMethod.GET)
    public String memberAddPre(){
        return "member_add";
    }
    
    @RequestMapping(value = "/member_add",method = RequestMethod.POST)
    @ResponseBody
    public Object memberAdd(Member member){
        return member;
    }
    
    @Resource
    private IMemberService memberService;
    
    @RequestMapping(value = "/member_get",method = RequestMethod.GET)
    @ResponseBody
    public Object get(long mid){
        return this.memberService.get(mid);
    }

}
