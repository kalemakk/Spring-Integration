package com.example.springintegration;

import org.springframework.messaging.Message;

public class PrintServiceUpperCase {

    public void print(Message<String> message){
        System.out.println(message.getPayload().toUpperCase());
    }
}
