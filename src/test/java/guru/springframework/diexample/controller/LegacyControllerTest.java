package guru.springframework.diexample.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LegacyControllerTest {

    @Test
    void getGreeting() {
        LegacyController legacyController = new LegacyController();
        assertEquals("Hello world!", legacyController.getGreeting());
        System.out.println(legacyController.getGreeting());
    }
}
