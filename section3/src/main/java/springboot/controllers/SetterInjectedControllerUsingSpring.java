package springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import springboot.services.GreetingsService;

//marks the class as @Component so it can be added to application context and be managed by spring
@Controller
public class SetterInjectedControllerUsingSpring {

    private GreetingsService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    //using a setter to inject - NOT preferred
    //The GreetingService will be pulled in at runtime from app context, as this is now managed by spring
    @Autowired
    public void setGreetingService(@Qualifier("getterGreetingServiceImpl") GreetingsService greetingService) {
        this.greetingService = greetingService;
    }
}
