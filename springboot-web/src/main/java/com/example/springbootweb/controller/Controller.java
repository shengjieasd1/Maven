package com.example.springbootweb.controller;

import com.example.springbootutils.helper.CommonMethod;
import org.junit.Before;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/test")
public class Controller {
    @RequestMapping(value = "/echo/{message}",method = RequestMethod.GET)
    public String echo(@PathVariable("message") String msg){
        return "【ECHO】"+msg;
    }
    @GetMapping("/date")
    public String getDate(){
        Date date = CommonMethod.getCurDate();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "北京时间为:"+df.format(date);
    }
}
