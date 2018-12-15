package springboot.controllers;


import springboot.services.GreetingsService;

/**
 * This is NOT good practice
 */
public class PropertyInjectedController {

    //using a property to inject - NOT good practice
    //variable named the same as the implementation of the interface ("GreetingsService")
    GreetingsService greetingServiceImpl;

    public String sayHello() {
        return greetingServiceImpl.sayGreeting();
    }
}
