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
@ImportResource("classpath*:hello.xml")
public class SpringIntegrationApplication implements ApplicationRunner {

    @Autowired
    PersonGateWay personGateWay;

    public static void main(String[] args) {
        SpringApplication.run(SpringIntegrationApplication.class, args);
    }

    public void run(ApplicationArguments arguments) throws InterruptedException, ExecutionException {
        Person person = new Person(2,"Kalema","Arnold");
        this.personGateWay.save(person);
    }

}
