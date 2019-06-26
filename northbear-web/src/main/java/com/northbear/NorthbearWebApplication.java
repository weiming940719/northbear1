package com.northbear;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class NorthbearWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(NorthbearWebApplication.class, args);
    }

}
