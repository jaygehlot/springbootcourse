package springboot.controllers;

import springboot.services.GreetingsService;

public class SetterInjectedController {

    private GreetingsService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    //using a setter to inject - NOT preferred
    public void setGreetingService(GreetingsService greetingService) {
        this.greetingService = greetingService;
    }
}
