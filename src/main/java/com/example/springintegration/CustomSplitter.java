package com.example.springintegration;

import org.springframework.integration.splitter.AbstractMessageSplitter;
import org.springframework.messaging.Message;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CustomSplitter extends AbstractMessageSplitter {
    @Override
    protected Object splitMessage(Message<?> message) {

        return new ArrayList<String>(Arrays.asList(message.getPayload().toString().split(" ")));
    }
}
