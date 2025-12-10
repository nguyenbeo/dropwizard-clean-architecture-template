package com.example.dropwizardcleanarchitecture;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;
import org.junit.jupiter.api.Test;

class HelloResourceTest {
    private final HelloResource resource = new HelloResource("Hello");

    @Test
    void greetsWithDefaultName() {
        assertEquals("Hello, world!", resource.sayHello(Optional.empty()).get("message"));
    }

    @Test
    void greetsProvidedName() {
        assertEquals("Hello, Binh!", resource.sayHello(Optional.of("Binh")).get("message"));
    }
}
