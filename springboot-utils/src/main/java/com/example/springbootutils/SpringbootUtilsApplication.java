package com.example.springbootutils;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringbootUtilsApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(SpringbootUtilsApplication.class, args);
    }
    
}
