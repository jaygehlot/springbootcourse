package springboot.services;

import org.springframework.stereotype.Service;

@Service //@Service is a specialization of the @Component, Spring will now manage this
public class GetterGreetingImpl implements GreetingsService {

    @Override
    public String sayGreeting() {
        return "I was injected via Getter";
    }
}
