package com.example.springintegration;

import org.springframework.messaging.Message;

import java.util.concurrent.Future;

public interface PrintGateWay {
    Future<Message<?>> print(Message<?> message);

}
