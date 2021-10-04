package com.myProject.myProject;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import java.util.Date;

@Controller
public class GreetingController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Messege greeting(Messege message) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new Messege(new Date(), HtmlUtils.htmlEscape(message.getText()),"Hello, " + HtmlUtils.htmlEscape(message.getText()) + "!","test");
    }

}