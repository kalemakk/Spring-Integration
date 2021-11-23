package com.example.springintegration;

import org.springframework.messaging.Message;

public class MessagePrinter {

    public String print(Message<?> message){
        System.out.println("Message: "+message);
        return "Message received successfully";
    }

    public void printConsole(Message<?> message){
        System.out.println("Message sent is: "+message);
    }
}
