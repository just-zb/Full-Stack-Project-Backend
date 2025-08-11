package com.michael.fullstackprojectbackend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOriginPatterns("*")  // allow any domain
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")  // allowed HTTP methods
                        .allowedHeaders("*")  // allow any request headers
                        .allowCredentials(true)  // allow cookies
                        .maxAge(3600);  // check preflight request cache for 1 hour
            }
        };
    }
}
