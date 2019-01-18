package springboot.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"es", "default"})   //marked as "es" and defined in application.properties to tell Spring which Profile to use
@Primary
/**
 * Used to show that when there is no active profile, then we should mark a profile as default
 * otherwise Spring doesn't booted up if there is no ACTIVE profile defined
 * "default" is only active, when there are no other profiles active
 */
public class PrimarySpanishGreetingService implements GreetingsService {

    @Override
    public String sayGreeting() {
        return "Servicio de Saludo Primario";
    }
}
