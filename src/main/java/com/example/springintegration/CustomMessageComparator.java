package com.example.springintegration;

import org.springframework.messaging.Message;

import java.util.Comparator;

public class CustomMessageComparator implements Comparator<Message<String>> {
    @Override
    public int compare(Message<String> message, Message<String> t1) {
        String payLoad1 = message.getPayload();
        String payLoad2 = t1.getPayload();

        boolean ispayLoad1even = Integer.valueOf(payLoad1.substring(payLoad1.length() -1)) % 2 == 0;
        boolean ispayLoad2even = Integer.valueOf(payLoad1.substring(payLoad2.length() -1)) % 2 == 0;

        if((ispayLoad1even && ispayLoad2even) || (!ispayLoad1even && !ispayLoad2even)){
            return 0;
        }else if (ispayLoad1even){
            return -1;
        }else{
            return 0;
        }

    }
}
