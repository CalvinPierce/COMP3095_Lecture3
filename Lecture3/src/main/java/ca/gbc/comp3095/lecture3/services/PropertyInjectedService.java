package ca.gbc.comp3095.lecture3.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "say HELLO - PROPERTY";
    }
}
