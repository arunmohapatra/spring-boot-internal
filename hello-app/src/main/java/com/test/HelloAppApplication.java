package com.test;

import com.service.HelloService;
import com.service.HelloServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class HelloAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloAppApplication.class, args);
	}

//
//    @Bean
//    public HelloService createHelloServiceBean(){
//        return new HelloServiceImpl("User override prefix","User override suffix");
//    }
}
