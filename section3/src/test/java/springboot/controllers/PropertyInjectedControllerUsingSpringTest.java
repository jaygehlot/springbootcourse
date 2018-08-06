package springboot.controllers;

import org.junit.Before;
import org.junit.Test;
import springboot.services.GreetingServiceImpl;

import static org.junit.Assert.*;
import static springboot.services.GreetingServiceImpl.HELLO_ENGINEERS;

public class PropertyInjectedControllerUsingSpringTest {

    private PropertyInjectedControllerUsingSpring propertyInjectedControllerUsingSpring;

    @Before
    public void setup() {
        this.propertyInjectedControllerUsingSpring = new PropertyInjectedControllerUsingSpring();
        this.propertyInjectedControllerUsingSpring.greetingsServiceImpl = new GreetingServiceImpl();
    }

    @Test
    public void testGreetingPropertyInjection() throws Exception {
        assertEquals(HELLO_ENGINEERS, propertyInjectedControllerUsingSpring.sayHello());
    }

}