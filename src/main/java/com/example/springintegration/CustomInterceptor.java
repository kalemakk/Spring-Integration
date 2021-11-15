package com.example.springintegration;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.ChannelInterceptor;
import org.springframework.messaging.support.ChannelInterceptorAdapter;
import org.springframework.messaging.support.ImmutableMessageChannelInterceptor;
import org.springframework.messaging.support.MessageBuilder;

public class CustomInterceptor extends ChannelInterceptorAdapter {
    @Override
    public Message<?> preSend(Message<?> message, MessageChannel channel) {
        Message<?> message1 = MessageBuilder
                .withPayload(message.getPayload()+" Message Intercepted Successfully")
                .build();
        return super.preSend(message1,channel);
//        return ChannelInterceptor.super.preSend(message1, channel);
    }

//    @Override
//    public void postSend(Message<?> message, MessageChannel channel, boolean sent) {
//        Message<?> message1 = MessageBuilder
//                .withPayload(message.getPayload()+" Message Intercepted Successfully")
//                .build();
//        ChannelInterceptor.super.postSend(message, channel, sent);
//    }

}
