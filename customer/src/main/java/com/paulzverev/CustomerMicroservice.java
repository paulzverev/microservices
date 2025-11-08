package com.paulzverev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(
        basePackages = "com.paulzverev.clients"
)
public class CustomerMicroservice {
    public static void main(String[] args) {
        SpringApplication.run(CustomerMicroservice.class, args);
    }
}