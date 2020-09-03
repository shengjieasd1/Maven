package com.example.springbootweb.controller;

import com.example.springbootutils.helper.CommonMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/test")
public class Controller {

    @GetMapping("/date")
    public String getDate(){
        Date date = CommonMethod.getCurDate();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "北京时间为:"+df.format(date);
    }
}
