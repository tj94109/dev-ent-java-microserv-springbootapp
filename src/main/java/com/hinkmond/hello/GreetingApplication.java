package com.hinkmond.hello;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class GreetingApplication {


    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return beansProvidedBySpringBoot -> {
            System.out.println("CommandLineRunner called.  Now, running REST Controller GET endpoint: /helloworld");
        };
    }

    public static void main(String[] args) {
        System.out.println("GreetingApplication is starting up Spring Boot to run as a Web Application!");
        SpringApplication.run(GreetingApplication.class, args);
    }

}