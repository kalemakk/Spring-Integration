package com.example.springintegration;


import lombok.extern.slf4j.Slf4j;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.PollableChannel;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan(basePackages = "main")
@RestController
@RequestMapping("/api/")
@Slf4j
public class TestController {

    @GetMapping("hello")
    public String getGreeting(){

        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:context.xml");

        MessageChannel messageChannel = ctx.getBean("names",MessageChannel.class);

        Message<String> message = MessageBuilder.withPayload("arnold").build();

        log.info(".................Read Message...............");
        log.info(message.toString());

        messageChannel.send(message);

//        SayHello sayHello = new SayHello();
//        return sayHello.sayHello("Hello World");

        return "hello arnold";

    }

    @GetMapping("hey")
    public String sayHey(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:context.xml");
        MessageChannel inputChannel = applicationContext.getBean("inputChannel",MessageChannel.class);
        PollableChannel outputChannel = applicationContext.getBean("outputChannel",PollableChannel.class);

        inputChannel.send(new GenericMessage<String>("Arnold Kalema"));


        log.info("Message is "+outputChannel.receive(1000).getPayload());
//
//
//        return sayHello.sayHello("Arnold");
//        return (String) outputChannel.receive(0).getPayload();
        return "Arnold Kalema";
    }

}
