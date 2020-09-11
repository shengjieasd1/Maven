package com.example.springboot.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MessageConsumerService {
    @RabbitListener(queues = "sj.springboot.queue")
    public void receiveMessage(String text){
        System.err.println("【***接收消息***】"+text);
    }
}
