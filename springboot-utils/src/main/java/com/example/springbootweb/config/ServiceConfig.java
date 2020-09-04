package com.example.springbootweb.config;

import com.example.springbootweb.serivce.Impl.MessageServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //此处为配置项
public class ServiceConfig {
    
    @Bean(name = "configService") //此处返回的时Spring的配置Bean
    public MessageServiceImpl getMessageService(){
        return new MessageServiceImpl();
    }

    
    
}
