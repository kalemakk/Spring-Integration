package com.example.springintegration;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class UpperCaseService {
    public String fullName(Person person) throws InterruptedException {
        TimeUnit.SECONDS.sleep(new Random().nextInt(10));

        return (person.firstName+" "+person.lastName).toUpperCase();
    }
}
