package com.example.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.mail.SimpleMailMessage;

import javax.annotation.Resource;

@SpringBootTest
public class TestRedis {
    @Resource
    private RedisTemplate<String,String> redisTemplate;
    
    @Test
    public void testSet(){
        this.redisTemplate.opsForValue().set("sj","java");
        System.out.println(this.redisTemplate.opsForValue().get("sj"));
    }
    
    
}
