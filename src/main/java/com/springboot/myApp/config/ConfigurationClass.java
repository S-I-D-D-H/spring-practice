package com.springboot.myApp.config;

import com.springboot.outerPackage.Burger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass {

    @Bean
    public Burger getBurger() {
        return new Burger();
    }
}
