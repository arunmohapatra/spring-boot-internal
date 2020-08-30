package com.starter.config;


import com.service.HelloService;
import com.service.HelloServiceImpl;
import com.starter.condition.InputPropertyValidation;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass
@EnableConfigurationProperties(HelloStarterProperty.class)
@Conditional(InputPropertyValidation.class)
public class HelloStarterService {

    private HelloStarterProperty helloStarterProperty;

    public HelloStarterService(HelloStarterProperty helloStarterProperty){
        this.helloStarterProperty = helloStarterProperty;
    }

    @Bean
    @ConditionalOnMissingBean
    public HelloService getHelloService(){
        return new HelloServiceImpl(this.helloStarterProperty.getPrefix()
                ,this.helloStarterProperty.getSuffix());
    }
}
