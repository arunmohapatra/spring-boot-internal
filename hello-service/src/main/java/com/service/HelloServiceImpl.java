package com.service;

public class HelloServiceImpl implements HelloService {

    private String originator;

    public HelloServiceImpl(String originator){
        this.originator = originator;
    }
    public void sayHello(String message) {
        System.out.println("================================");
        System.out.println(this.originator+"="+message);
        System.out.println("================================");
    }
}
