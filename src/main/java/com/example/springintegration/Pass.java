package com.example.springintegration;


import org.springframework.messaging.Message;

public class Pass implements PassengerInterface{

    @Override
    public void sayHi(Message<String> message) {
        System.out.println("Hello by "+message);
    }

    public Message<String> printMessage(Message<String> message){
        return message;
    }
}
