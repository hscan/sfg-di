package br.infoscan.sfgdi.services;

/**
 * Created by hscan on 08/02/2021
 */

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PT")
@Service("i18nService")
public class I18nPortugeseService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Olá Mundo!";
    }
}
