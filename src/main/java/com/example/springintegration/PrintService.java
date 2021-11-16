package com.example.springintegration;

import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

import java.util.Map;

public class PrintService {
    public void print(Message<?> message) {
        System.out.println("Printing: "+message.getPayload());

        for(Map.Entry<String, Object> entry:message.getHeaders().entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}
