package springboot.controllers;

import org.junit.Before;
import org.junit.Test;
import springboot.services.GreetingServiceImpl;

import static org.junit.Assert.*;
import static springboot.services.GreetingServiceImpl.HELLO_ENGINEERS;

public class SetterInjectedControllerUsingSpringTest {

    private SetterInjectedControllerUsingSpring setterInjectedControllerUsingSpring;

    @Before
    public void setup() throws Exception {
        this.setterInjectedControllerUsingSpring = new SetterInjectedControllerUsingSpring();
        this.setterInjectedControllerUsingSpring.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreetingSetterInjection() throws Exception {
        assertEquals(HELLO_ENGINEERS, setterInjectedControllerUsingSpring.sayHello());
    }

}