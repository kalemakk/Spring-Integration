package com.example.springintegration;

public class UpperCaseService {
    public String fullName(Person person){
        return (person.firstName+" "+person.lastName).toUpperCase();
    }
}
