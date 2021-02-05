package br.infoscan.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by hscan on 04/02/2021
 */
@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Hello World!!!!");

        return "Hi Folks";
    }
}
