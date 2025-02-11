package hm.springframework.spring_6_di.controllers;

import hm.springframework.spring_6_di.services.EnvironmentService;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {

    private final EnvironmentService environmentService;

    public EnvironmentController(EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    String getEnvironment(){
        return "You are in " + environmentService.getEnv() + " environment.";
    }
}
