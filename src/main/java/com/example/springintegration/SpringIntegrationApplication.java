package com.example.springintegration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


import java.util.concurrent.ExecutionException;


@SpringBootApplication
@Configuration
@ImportResource("classpath*:context.xml")
public class SpringIntegrationApplication implements ApplicationRunner {

    @Autowired
    CarGateWay carGateWay;

    public static void main(String[] args) {
        SpringApplication.run(SpringIntegrationApplication.class, args);
    }

    public void run(ApplicationArguments arguments) throws InterruptedException, ExecutionException {
//        Car car = new Car(2,"4MATICS","Toyota");
        carGateWay.print("hello");
    }

}
