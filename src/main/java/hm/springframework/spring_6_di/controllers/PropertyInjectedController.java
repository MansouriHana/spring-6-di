package hm.springframework.spring_6_di.controllers;

import hm.springframework.spring_6_di.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
