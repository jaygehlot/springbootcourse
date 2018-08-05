package springboot.controllers;

import springboot.services.GreetingsService;

//BEST PRACTICE
//https://www.vojtechruzicka.com/field-dependency-injection-considered-harmful/
public class ConstructorInjectedController {

    private GreetingsService greetingsService;

    /**
     * Constructor is taking in the interface and not the implementation
     */
    public ConstructorInjectedController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    String sayHello() {
        return greetingsService.sayGreeting();
    }
}
