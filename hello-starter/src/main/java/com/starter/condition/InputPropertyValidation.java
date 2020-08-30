package com.starter.condition;

import org.springframework.boot.autoconfigure.condition.ConditionOutcome;
import org.springframework.boot.autoconfigure.condition.SpringBootCondition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class InputPropertyValidation extends SpringBootCondition {

    public InputPropertyValidation() {
        super();
    }

    @Override
    public ConditionOutcome getMatchOutcome(ConditionContext context
            , AnnotatedTypeMetadata metadata) {
        Environment env = context.getEnvironment();
        String prefix = env.getProperty("hello.prefix");
        if(prefix == null || prefix.length() == 0)
            return ConditionOutcome.noMatch("hello.prefix should not be null or empty");
        return  ConditionOutcome.match();
    }
}
