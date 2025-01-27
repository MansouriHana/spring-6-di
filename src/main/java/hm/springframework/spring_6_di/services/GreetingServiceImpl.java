package hm.springframework.spring_6_di.services;

public class GreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello Evryone From Base Service!!";
    }
}
