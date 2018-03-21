package at.refugeescode.theamazinghelloworld.helloWorld;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class HelloWorldTest {

    @Autowired
    private HelloWorld helloWorld;

    @Test
    void sayHelloWorld() {
        String message = helloWorld.sayHelloWorld();
        Assertions.assertEquals("Hello World", message);
    }
}