package com.example.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
    // 여기에서 Spring Bean을 선언할 수 있다. - @Bean
    @Bean
    public String name() {
        return "Spring";
    }
}
