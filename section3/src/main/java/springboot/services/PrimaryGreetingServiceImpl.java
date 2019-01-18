package springboot.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service  //tells Spring Application context to bring this in and manage it as a Spring bean
@Primary    //tells Spring that if there are multiple services available, then to use this one as its marked as Primary
@Profile("en")
public class PrimaryGreetingServiceImpl implements GreetingsService {

    @Override
    public String sayGreeting() {
        return "Greetings from Primary greeting Service";
    }
}
