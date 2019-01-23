package com.example.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ReceivMq {
    @RabbitListener(queues = "queue")
    public void receive(String str){
        System.out.println("Receive:"+str);
    }

}
