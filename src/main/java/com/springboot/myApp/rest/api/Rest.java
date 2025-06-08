package com.springboot.myApp.rest.api;

import com.springboot.outerPackage.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController()
public class Rest {

    @Value("${name}")
    private String name;

//    @Autowired -> field injection not recommend for latest project
    private Food food;
    private Food life;
    private Food burger;

    @Autowired // In constructor injection @Autowired is not needed for 1 controller
    public Rest(@Qualifier("burger") Food food, @Qualifier("beanLifeCycle") Food life, @Qualifier("getBurger") Food burger) {
        this.food = food;
        this.life = life;
        this.burger = burger;
    }
    
//     @Autowired // this is example of setter injection (for optional dependencies)
//     public void setFood(@Qualifier("burger") Food food) {
//         this.food = food;
//     }

    @GetMapping("/hello")
    public String hello() {
        return name + "hello world siddh kothari";
    }

    @GetMapping("/workout")
    public String workout() {
        return name + "ready for workout ?";
    }

    @GetMapping("/pizza")
    public String pizza() {
        return this.food.getDailyPizzaMenue();
    }

    @GetMapping("/life-cycle")
    public String lifeCycle() {
        return this.life.getDailyPizzaMenue();
    }

    @GetMapping("/config-beans")
    public String beanCycle() {
        return this.burger.getDailyPizzaMenue();
    }

}
