package br.infoscan.sfgdi.controllers;

import br.infoscan.sfgdi.services.GreetingService;

/**
 * Created by hscan on 05/02/2021
 */
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
