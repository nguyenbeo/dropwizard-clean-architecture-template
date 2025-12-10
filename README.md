# Dropwizard Clean Architecture Template

Simple Dropwizard starter project that uses Gradle and exposes a `\n/hello` endpoint within the `com.example.dropwizardcleanarchitecture` package.

## Prerequisites

- Java 25
- Gradle 8+ (or use the Gradle wrapper once generated)

## Run locally

```bash
./gradlew run --args="server config/example.yml"
```

The service will listen on `http://localhost:8080/hello` and returns a JSON payload. Override the greeting via `config/example.yml` or command line arguments.

## Test

```bash
./gradlew test
```
