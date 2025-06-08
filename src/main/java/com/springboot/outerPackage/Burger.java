package com.springboot.outerPackage;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy // this bean will only be initialized if needed else not
public class Burger implements Food {

    public Burger() {
        System.out.println("Burger");
    }
    @Override
    public String getDailyPizzaMenue() {
        return "I am the burger";
    }
}
