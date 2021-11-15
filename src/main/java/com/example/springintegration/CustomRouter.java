package com.example.springintegration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.integration.router.AbstractMessageRouter;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

import java.util.ArrayList;
import java.util.Collection;

public class CustomRouter extends AbstractMessageRouter {

    @Autowired
    @Qualifier("numericChannel")
    private MessageChannel numericChannel;

    @Autowired
    @Qualifier("stringChannel")
    private MessageChannel stringChannel;

    @Override
    protected Collection<MessageChannel> determineTargetChannels(Message<?> message) {
        Collection<MessageChannel> messageChannels = new ArrayList<MessageChannel>();

        if (message.getPayload().getClass().equals(Integer.class)){
            messageChannels.add(numericChannel);
        }else if (message.getPayload().getClass().equals(String.class)){
            messageChannels.add(stringChannel);
        }
        return messageChannels;
    }
}
