package com.example.springbootweb.config;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

@Configuration
public class ErrorPageConfig{
    @Bean
    public ErrorPageRegistrar containerCustomizer(){
        return new ErrorPageRegistrar(){
    
            @Override
            public void registerErrorPages(ErrorPageRegistry registry) {
                ErrorPage errorPage400 = new ErrorPage(HttpStatus.BAD_REQUEST,"/error-400.html");
                ErrorPage errorPage404 = new ErrorPage(HttpStatus.NOT_FOUND,"/error-404.html");
                ErrorPage errorPage500 = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR,"/error-500.html");
                registry.addErrorPages(errorPage400,errorPage404,errorPage500);
            }
        };
    }
   
}
