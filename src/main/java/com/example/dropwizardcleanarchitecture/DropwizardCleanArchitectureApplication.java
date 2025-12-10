package com.example.dropwizardcleanarchitecture;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;

public class DropwizardCleanArchitectureApplication extends Application<DropwizardCleanArchitectureConfiguration> {
    public static void main(String[] args) throws Exception {
        new DropwizardCleanArchitectureApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<DropwizardCleanArchitectureConfiguration> bootstrap) {
        // Application bootstrap hooks can be configured here when needed
    }

    @Override
    public void run(DropwizardCleanArchitectureConfiguration configuration, Environment environment) {
        HelloResource helloResource = new HelloResource(configuration.getGreeting());
        environment.jersey().register(helloResource);
    }
}
