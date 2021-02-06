package br.infoscan.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by hscan on 05/02/2021
 */
@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
