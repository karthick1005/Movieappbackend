package com.karthick.Movieapp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") // Adjust the URL pattern based on your API
                .allowedOrigins("http://localhost:3000","https://movieapp-sooty-ten.vercel.app/") // Allow requests from React (localhost:3000)
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Define allowed HTTP methods
                .allowedHeaders("*") // Allow all headers
                .allowCredentials(true); // Allow credentials (optional)
    }
}
