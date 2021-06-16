package com.example.aopsync;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class AopSyncApplication {

    public static void main(String[] args) {
        SpringApplication.run(AopSyncApplication.class, args);
    }

}
