package com.example.springbootweb.serivce.Impl;

import com.example.springbootweb.serivce.IMessageService;
import org.springframework.stereotype.Service;


public class MessageServiceImpl implements IMessageService {
    @Override
    public String info() {
        return "aaaaaa";
    }
}
