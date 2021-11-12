package com.example.springintegration;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;

public class SayHello implements HelloService{

    Log logger = LogFactory.getLog(SayHello.class);

    @Override
    public String sayHello(String name) {
//        logger.info("hello "+name);
//        System.out.println(name);
        return "hello "+name;
    }

    public void sayHello1(String name) {
        logger.info("hello "+name);
        System.out.println(name);
    }


}
