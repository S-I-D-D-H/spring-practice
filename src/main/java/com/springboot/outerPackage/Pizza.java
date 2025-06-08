package com.springboot.outerPackage;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // if there are multiple implementation of interface then one with primary will be executed
public class Pizza implements Food {

    Pizza(){}

    @Override
    public String getDailyPizzaMenue() {
        return "Give me my pizza";
    }
}
