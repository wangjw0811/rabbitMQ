package com.example.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "queue1")
public class FirstCustomer{
    @RabbitHandler
    public void receive(String str){
        System.out.println("queue1:"+str);
    }
}
