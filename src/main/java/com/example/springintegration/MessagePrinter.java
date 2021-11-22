package com.example.springintegration;

import org.springframework.messaging.Message;

public class MessagePrinter {

    public void print(Message<?> message){
        System.out.println("Message: "+message);
    }
}
