package com.example.springintegration;

import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

public class PrintService {
    public void print(Message<?> message) {
        System.out.println("String Printed is : "+message.getPayload());
    }
}
