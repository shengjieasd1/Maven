package com.example.springbootweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:spring-common.xml"})
public class SpringbootWebApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebApplication.class, args);
    }
    
}
