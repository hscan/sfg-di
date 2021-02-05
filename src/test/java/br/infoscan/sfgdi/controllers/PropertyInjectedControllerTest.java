package br.infoscan.sfgdi.controllers;

import br.infoscan.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by hscan on 05/02/2021
 */
class PropertyInjectedControllerTest {

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        controller.greetingService = new GreetingServiceImpl();
    }

    PropertyInjectedController controller;
    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}