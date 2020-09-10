package com.example.springbootupload.config;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;

import javax.servlet.MultipartConfigElement;

/**
 * @author shuzheng
 */
@Configuration
public class UploadConfig {
    @Bean
    public MultipartConfigElement getMultipartConfig(){
        MultipartConfigFactory config = new MultipartConfigFactory();
        //设置上传文件的单个大小限制
        config.setMaxFileSize(DataSize.parse("10MB"));
        //设置总的上传的大小限制
        config.setMaxRequestSize(DataSize.parse("100MB"));
        //设置临时保存的目录
        config.setLocation("/");
        //创建一个上传配置项
        return config.createMultipartConfig();
    }
}
