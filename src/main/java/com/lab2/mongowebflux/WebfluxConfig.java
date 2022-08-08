package com.lab2.mongowebflux;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
@EnableWebFlux
public class WebfluxConfig implements WebFluxConfigurer {
    @Bean
    public WebClient getWebClient()
    {
        return WebClient.builder()
                .baseUrl("http://localhost:4545")
                .build();
    }
}
