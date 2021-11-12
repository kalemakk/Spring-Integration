package com.example.springintegration;

import org.springframework.messaging.Message;

public interface PassengerInterface {
    void sayHi(Message<String> message);
}
