package com.example.receiver2;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ReceivMq2 {
    @RabbitListener(queues = "queue")
    public void receive(String str){
        System.out.println("Receive2:"+str);
    }

}
