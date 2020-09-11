package com.example.springboot.producer.impl;

import com.example.springboot.config.ProducerConfig;
import com.example.springboot.producer.IMessageProducerService;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MessageProducerServiceImpl implements IMessageProducerService {
    @Resource
    private RabbitTemplate rabbitTemplate;
    
    @Override
    public void sendMessage(String msg) {
        this.rabbitTemplate.convertAndSend(ProducerConfig.EXCHANGE,ProducerConfig.ROUTINGKEY,msg);
    }
}
