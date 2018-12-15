package springboot.services;

import org.springframework.stereotype.Service;

//@Service is a specialization of the @Component, Spring will now manage this
@Service
public class ConstructorGreetingServiceImpl implements GreetingsService {

    @Override
    public String sayGreeting() {
        return "I was injected via Constructor";
    }
}
