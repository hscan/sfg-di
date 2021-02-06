package br.infoscan.sfgdi.controllers;

import br.infoscan.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by hscan on 04/02/2021
 */
@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {

        return greetingService.sayGreeting();
    }
}
