package ca.gbc.comp3095.lecture3;

import ca.gbc.comp3095.lecture3.controllers.MyController;
import ca.gbc.comp3095.lecture3.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Lecture3Application {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(Lecture3Application.class, args);
        MyController myController = (MyController) ctx.getBean("myController");
        System.out.println(myController.sayHello());

        System.out.println("--- PROPERTY ---");
        PropertyInjectedController propertyInjectedController =
                (PropertyInjectedController)ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());
    }

}
