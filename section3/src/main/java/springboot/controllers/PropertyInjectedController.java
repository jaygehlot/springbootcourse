package springboot.controllers;


import springboot.services.GreetingsService;

/**
 * This is NOT good practice
 */
class PropertyInjectedController {

    //using a property to inject - NOT good practice
    GreetingsService greetingsService;

    String sayHello() {
        return greetingsService.sayGreeting();
    }
}
