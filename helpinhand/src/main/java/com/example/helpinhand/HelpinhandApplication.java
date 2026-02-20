// This line defines the package name of the project
// It groups the main application class under one package
package com.example.helpinhand;

// This line imports SpringApplication class
// It is used to launch the Spring Boot application
import org.springframework.boot.SpringApplication;

// This line imports the SpringBootApplication annotation
// It enables Spring Boot features
import org.springframework.boot.autoconfigure.SpringBootApplication;

// This annotation marks this class as the main Spring Boot application
// It integrates configuration, auto-configuration, and component scanning
@SpringBootApplication
public class HelpinhandApplication {

    // This is the main method
    // Program execution starts from this point
    public static void main(String[] args) {

        // This line runs the Spring Boot application
        // It starts the embedded server and loads all project components
        SpringApplication.run(HelpinhandApplication.class, args);
    }
}
