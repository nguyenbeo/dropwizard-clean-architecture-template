package com.example.dropwizardcleanarchitecture;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.core.Configuration;
import jakarta.validation.constraints.NotEmpty;

public class DropwizardCleanArchitectureConfiguration extends Configuration {
    @NotEmpty
    private String greeting = "Hello Dropwizard";

    @JsonProperty
    public String getGreeting() {
        return greeting;
    }

    @JsonProperty
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
