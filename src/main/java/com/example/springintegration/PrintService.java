package com.example.springintegration;

import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

public class PrintService {

    public Message<String> print(Message<String> message){
        System.out.println("message is "+message.getPayload());
        int messageNumber = (int) message.getHeaders().get("messageNumber");
        return MessageBuilder.withPayload("Sending reply to message "+messageNumber).build();
    }
}
