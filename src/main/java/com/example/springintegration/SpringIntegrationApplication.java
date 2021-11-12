package com.example.springintegration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.core.MessagingTemplate;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessagingException;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.messaging.support.MessageBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

@SpringBootApplication
@Configuration
@ImportResource("classpath*:hello.xml")
public class SpringIntegrationApplication implements ApplicationRunner {

    @Autowired
    private Pass pass;

    @Autowired
    PrintGateWay printGateWay;

    @Qualifier("input")
    @Autowired
    private DirectChannel directChannel;

//    @Qualifier("output")
//    @Autowired
//    private DirectChannel outputChannel;

    public static void main(String[] args) {
        SpringApplication.run(SpringIntegrationApplication.class, args);
    }

    public void run(ApplicationArguments arguments) throws Exception{
//        Message<String> message = MessageBuilder.withPayload("Hello Kalema Arnold my Guy")
//                .setHeader("author","Jean").build();
//
//        MessagingTemplate messagingTemplate = new MessagingTemplate();
//
//        Message message1 = messagingTemplate.sendAndReceive(directChannel,message);
//        System.out.println(message1.getPayload());
//        System.out.println(message1.getHeaders());

        List<Future<Message<String>>> futureList = new ArrayList<Future<Message<String>>>();

        for (int i =0; i<10; i++){
            Message<String> message = MessageBuilder
                    .withPayload("Printing message payload "+i)

                    .setHeader("messageNumber",i)
                    .build();
            System.out.println("sending message "+i);
            futureList.add(this.printGateWay.print(message));
        }

        for(Future<Message<String>> future:futureList){
            System.out.println(future.get().getPayload());
        }

    }


}
