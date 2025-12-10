package com.example.dropwizardcleanarchitecture;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import java.util.Map;
import java.util.Optional;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class HelloResource {
    private final String greeting;

    public HelloResource(String greeting) {
        this.greeting = greeting;
    }

    @GET
    public Map<String, String> sayHello(@QueryParam("name") Optional<String> name) {
        String target = name.filter(n -> !n.isBlank()).orElse("world");
        return Map.of("message", String.format("%s, %s!", greeting, target));
    }
}
