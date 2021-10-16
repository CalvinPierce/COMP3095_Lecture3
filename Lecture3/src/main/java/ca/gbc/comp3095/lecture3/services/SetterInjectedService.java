package ca.gbc.comp3095.lecture3.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedService implements GreetingService{
    @Override
    public String sayGreeting(){
        return "Say hello - SETTER";
    }
}
