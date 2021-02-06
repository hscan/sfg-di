package br.infoscan.sfgdi.controllers;

import br.infoscan.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by hscan on 05/02/2021
 */
class PropertyInjectedControllerTest {

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        controller.greetingService = new ConstructorGreetingService();
    }

    PropertyInjectedController controller;
    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}