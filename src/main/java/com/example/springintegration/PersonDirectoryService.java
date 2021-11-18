package com.example.springintegration;

public class PersonDirectoryService {
    public Person newPerson(){
        System.out.println(".... Creating new Person ....");
        return new Person("Arnold","Kalema");
    }
}
