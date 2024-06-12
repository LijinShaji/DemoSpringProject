package com.scaler.demo.project.demoProd.config;

import com.scaler.demo.project.demoProd.services.CustomerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfig {
    @Bean
    public CustomerService initializeCustomerService(){
        return new CustomerService();
    }
}
