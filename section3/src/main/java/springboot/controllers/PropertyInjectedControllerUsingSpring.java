package springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import springboot.services.GreetingsService;

//@Controller marks it as a spring @Component and tells spring to manage this as a spring bean
@Controller
public class PropertyInjectedControllerUsingSpring {

    //using a property to inject - NOT good practice
    //@Autowired will tell spring to manage this dependency
    //@Qualifer will tell Spring which implementation of Greeting Service to use, as there are 3 implementations
    /**
     * NOTE : Its important to use @Qualifier, because if you don't, the @Primary bean ("PrimaryGreetingServiceImpl") will
     * override it and it will be used instead of greetingServiceImpl. (Even though the instance variable is named as
     * greetingServiceImpl, Spring will still use PrimaryGreetingServiceImpl since that class/bean has @Primary
     * So @Qualifier SHOULD be used, as best practice, to tell the controller which bean to use.
     */
    @Autowired
    @Qualifier("greetingServiceImpl")
    GreetingsService greetingServiceImpl;           //note that the type ("GreetingService") is the interface, but the variable
                                                    //is of the bean name ("greetingServiceImpl"), so Spring can use reflection
                                                    //and we actually DON'T need to use @Qualifier
                                                    //BETTER to use Qualifier

    public String sayHello() {
        return greetingServiceImpl.sayGreeting();
    }
}
