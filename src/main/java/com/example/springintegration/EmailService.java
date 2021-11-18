package com.example.springintegration;

public class EmailService {
    public void sendEmail(Person person){
        System.out.println("Sending Email to :"+person.firstName);
    }
}
