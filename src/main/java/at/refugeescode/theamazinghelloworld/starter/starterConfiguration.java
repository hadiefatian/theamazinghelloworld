package at.refugeescode.theamazinghelloworld.starter;

import at.refugeescode.theamazinghelloworld.helloWorld.Hello;
import at.refugeescode.theamazinghelloworld.helloWorld.HelloWorld;
import javafx.application.Application;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class starterConfiguration {

    // Create a bean to return application run
    @Bean
    public ApplicationRunner startHelloWorld(HelloWorld helloWorld) {
        return args -> {
            String sayHelloWorld = helloWorld.sayHelloWorld();
            System.out.println(sayHelloWorld);

        };
    }
}
