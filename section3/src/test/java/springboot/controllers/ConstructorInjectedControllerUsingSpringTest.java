package springboot.controllers;

import org.junit.Before;
import org.junit.Test;
import springboot.services.GreetingServiceImpl;

import static org.junit.Assert.*;
import static springboot.services.GreetingServiceImpl.HELLO_ENGINEERS;

public class ConstructorInjectedControllerUsingSpringTest {

    private ConstructorInjectedControllerUsingSpring constructorInjectedControllerUsingSpring;

    @Before
    public void setup() {
        this.constructorInjectedControllerUsingSpring = new ConstructorInjectedControllerUsingSpring(new GreetingServiceImpl());
    }

    @Test
    public void testGreetingControllerInjection() {
        assertEquals(HELLO_ENGINEERS, constructorInjectedControllerUsingSpring.sayHello());
    }

}