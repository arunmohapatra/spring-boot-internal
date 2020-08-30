package com.test;

import com.service.HelloService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceCommandRunner implements CommandLineRunner {

    private final HelloService helloService;

    public HelloServiceCommandRunner(HelloService helloService){
        this.helloService = helloService;
    }

    @Override
    public void run(String... args) throws Exception {
        this.helloService.sayHello("Say hello to Arun");
    }
}
