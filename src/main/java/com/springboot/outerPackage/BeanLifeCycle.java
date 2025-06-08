package com.springboot.outerPackage;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class BeanLifeCycle implements Food{
    @Override
    public String getDailyPizzaMenue() {
        return "Checkout the logs in terminal";
    }

    // define init and destroy method
    @PostConstruct
    public void init() {
        System.out.println("BeanLifeCycle init " + getClass().getName());
    }

    @PreDestroy
    public void destroy() {
        System.out.println("BeanLifeCycle destroy" + getClass().getName());
    }
}
