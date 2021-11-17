package com.example.springintegration;

import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

import java.util.Map;

public class PrintService {
    public void print(Person person) {
        System.out.println("First Name: "+person.firstName);

    }
}
