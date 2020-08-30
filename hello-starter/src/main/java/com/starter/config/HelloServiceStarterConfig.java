package com.starter.config;


import com.service.HelloService;
import com.service.HelloServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass
public class HelloServiceStarterConfig {

    @Bean
    @ConditionalOnMissingBean
    public HelloService getHelloService(){
        return new HelloServiceImpl("starter");
    }
}
