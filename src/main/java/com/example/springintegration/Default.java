package com.example.springintegration;

import org.springframework.messaging.Message;

public class Default {

    public void print(Message<?> message){
        System.out.println("In default we print "+message.getPayload());
    }
}
