package com.example.springbootweb.test;



import com.example.springbootweb.SpringbootWebApplication;
import com.example.springbootweb.controller.MessageController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

@SpringBootTest(classes = SpringbootWebApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestMessageController {
    @Resource
    private MessageController messageController;
    
    @Test
    public void testEcho(){
        System.out.println(this.messageController.echo("mldjava"));
    }

    @Test
    public void testIndex(){
        System.out.println(this.messageController.index());
    }
}
