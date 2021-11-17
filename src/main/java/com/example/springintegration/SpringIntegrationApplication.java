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
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessagingException;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.messaging.support.MessageBuilder;


@SpringBootApplication
@Configuration
@ImportResource("classpath*:hello.xml")
public class SpringIntegrationApplication implements ApplicationRunner {


    @Autowired
    PrintGateWay printGateWay;

    @Autowired
    @Qualifier("outputChannel")
    MessageChannel outputChannel;

    public static void main(String[] args) {
        SpringApplication.run(SpringIntegrationApplication.class, args);
    }

    public void run(ApplicationArguments arguments) throws Exception{

        Person[] person = {
                new Person("Kalema","Arnold"),
                new Person("Sharp","Denis"),
                new Person("Alex","Nuwa"),
                new Person("Brain","Okoth")
        };

        for (int i =0; i<person.length; i++){
            Message<?> message = MessageBuilder
                    .withPayload(person[i])
//                    .setHeader("private key",outputChannel)
                    .setHeader("replyChannel","outputChannel")
                    .build();
            this.printGateWay.print(message);
        }

    }

}
