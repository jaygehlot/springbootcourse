package springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import springboot.services.GreetingsService;

@Controller
public class MyController {

    private GreetingsService greetingsService;

    @Autowired
    public MyController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String hello() {
       return greetingsService.sayGreeting();
    }
}
