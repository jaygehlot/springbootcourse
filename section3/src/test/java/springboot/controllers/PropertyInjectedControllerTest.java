package springboot.controllers;

import org.junit.Before;
import org.junit.Test;
import springboot.services.GreetingServiceImpl;

import static org.junit.Assert.*;
import static springboot.services.GreetingServiceImpl.HELLO_ENGINEERS;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setup() {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingsService = new GreetingServiceImpl();
    }

    @Test
    public void testGreetingPropertyInjection() throws Exception {
        assertEquals(HELLO_ENGINEERS, propertyInjectedController.sayHello());
    }

}