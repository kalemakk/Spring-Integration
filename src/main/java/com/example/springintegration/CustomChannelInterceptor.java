package com.example.springintegration;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.ChannelInterceptorAdapter;
import org.springframework.messaging.support.MessageBuilder;

public class CustomChannelInterceptor extends ChannelInterceptorAdapter {

    @Override
    public Message<?> preSend(Message<?> message, MessageChannel channel) {
        Message<?> message1 = MessageBuilder
                .withPayload(message.getPayload().toString() + "Message Intercepted")
                .build();
//        System.out.println(message.getPayload().toString() + "Message Intercepted");
        return super.preSend(message, channel);
    }
}
