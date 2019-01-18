package springboot.services;

import org.springframework.stereotype.Service;

//marking it as Service makes it a @Component
@Service
public class GreetingServiceImpl implements GreetingsService {

    public static final String HELLO_ENGINEERS = "Hello Guru's - Original ";

    @Override
    public String sayGreeting() {
        return HELLO_ENGINEERS;
    }
}
