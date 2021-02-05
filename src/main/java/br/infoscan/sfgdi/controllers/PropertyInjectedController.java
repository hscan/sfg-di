package br.infoscan.sfgdi.controllers;

import br.infoscan.sfgdi.services.GreetingService;

/**
 * Created by hscan on 05/02/2021
 */
public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
