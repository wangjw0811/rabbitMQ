package com.example.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "queue2")
public class SecondCustomer {
    @RabbitHandler
    public void receive(String str){
        System.out.println("queue2:"+str);
    }
}
