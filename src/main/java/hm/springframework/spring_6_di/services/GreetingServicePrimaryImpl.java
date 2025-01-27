package hm.springframework.spring_6_di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServicePrimaryImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello Evryone From Base Primary Service!!";
    }

}
