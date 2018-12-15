package springboot.services;

import org.springframework.stereotype.Service;

@Service //@Service is a specialization of the @Component, Spring will now manage this
public class GetterGreetingServiceImpl implements GreetingsService {

    @Override
    public String sayGreeting() {
        return "I was injected via Getter";
    }
}
