package com.lab2.mongowebflux;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpHeaders;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class MongoWebfluxApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MongoWebfluxApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {


    }
}
