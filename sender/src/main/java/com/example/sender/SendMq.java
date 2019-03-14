package com.example.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SendMq {
    @Autowired
    private AmqpTemplate template;

    public void send() {
        template.convertAndSend("directExchange","abc","hello,rabbit~ i am jack");
        template.convertAndSend("fanoutExchange","","hello,rabbit~ i am tom");
        template.convertAndSend("topicExchange","abc.def","hello,rabbit~ i am tony");
        System.out.println("发送成功");
    }
}
