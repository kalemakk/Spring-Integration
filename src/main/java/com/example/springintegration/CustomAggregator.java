package com.example.springintegration;

import org.springframework.integration.aggregator.AbstractAggregatingMessageGroupProcessor;
import org.springframework.integration.store.MessageGroup;
import org.springframework.messaging.Message;

import java.util.Map;

public class CustomAggregator extends AbstractAggregatingMessageGroupProcessor {

    @Override
    protected Object aggregatePayloads(MessageGroup group, Map<String, Object> defaultHeaders) {

        StringBuilder stringBuilder = new StringBuilder();

        for (Message<?> message:group.getMessages()){

            logger.info(message.getHeaders());

            System.out.println(message.getHeaders());

            stringBuilder.append(message.getPayload()).append(" ");

        }
        return stringBuilder.toString();
    }
}
