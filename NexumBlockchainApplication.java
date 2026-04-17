package com.nexum.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class NexumBlockchainApplication {
    public static void main(String[] args) {
        SpringApplication.run(NexumBlockchainApplication.class, args);
    }
}
