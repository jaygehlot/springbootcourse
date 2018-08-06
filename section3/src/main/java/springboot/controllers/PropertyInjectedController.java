package springboot.controllers;


import springboot.services.GreetingsService;

/**
 * This is NOT good practice
 */
public class PropertyInjectedController {

    //using a property to inject - NOT good practice
    GreetingsService greetingsService;

    public String sayHello() {
        return greetingsService.sayGreeting();
    }
}
