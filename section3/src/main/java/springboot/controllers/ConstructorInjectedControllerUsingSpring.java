package springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import springboot.services.GreetingsService;

@Controller
public class ConstructorInjectedControllerUsingSpring {

    private GreetingsService greetingsService;

    /**
     * Constructor is taking in the interface and not the implementation
     */
    @Autowired //Injecting the implementation that is used by GreetingService. @Autowired not necessarily needed.
    public ConstructorInjectedControllerUsingSpring(@Qualifier("constructorGreetingImpl") GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String sayHello() {
        return greetingsService.sayGreeting();
    }
}
