package com.scaler.productservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ProductServiceApplication {
    public static void main(String[] args) {
        // This is the main entry point of the Spring Boot application
        // It will start the application and initialize all components
         SpringApplication.run(ProductServiceApplication.class, args);
    }
}
