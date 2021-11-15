package com.example.springintegration;

import org.springframework.messaging.Message;

public class CustomTransformer {

    String transformMessage(Message<?> message){
        String[] payload = message.getPayload().toString().split(" ");
        return payload[0]+", "+payload[1];
     }
}
