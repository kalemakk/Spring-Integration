package com.example.springintegration;

import org.springframework.messaging.Message;

public class NumericPrint {

    public void print(Message<?> message){
        System.out.println("Printing Numeric value: "+message.getPayload());
    }
}
