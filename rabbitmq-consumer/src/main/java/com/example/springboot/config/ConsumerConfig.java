package com.example.springboot.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConsumerConfig {
    /**
     * 交换空间名称
     */
    public static final String EXCHANGE = "example.springboot.exchange";
    
    /**
     * 设置路由key
     */
    public static final String ROUTINGKEY = "example.springboot.routingkey";
    
    /**
     *队列名称
     */
    public static final String QUEUE_NAME = "example.springboot.queue";
    
    @Bean
    public Binding bindingExchangeQueue(DirectExchange exchange, Queue queue){
        return BindingBuilder.bind(queue).to(exchange).with(ROUTINGKEY);
    }
    
    @Bean
    public DirectExchange getDirectExchange(){
        return new DirectExchange(EXCHANGE,true,true);
    }
}
