package com.service;

public class HelloServiceImpl implements HelloService {

    private String prefix;
    private String suffix;

    public HelloServiceImpl(){
        this.prefix = "*******";
        this.suffix = "*******";
    }

    public HelloServiceImpl(String prefix, String suffix){
        this.prefix = prefix.toLowerCase();
        this.suffix = suffix.toLowerCase();
    }
    public void sayHello(String message) {
        System.out.println("================================");
        System.out.println(this.prefix+": '"+message+"' . "+this.suffix);
        System.out.println("================================");
    }
}
