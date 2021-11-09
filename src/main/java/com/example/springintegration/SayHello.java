package com.example.springintegration;

public class SayHello implements HelloService{

    @Override
    public void sayHello(String name) {
        System.out.println(name);
    }
}
