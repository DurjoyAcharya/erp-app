package com.rupkotha.erpapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ErpAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(ErpAppApplication.class, args);
    }

    @GetMapping("/")
    public String hello()
    {
        return "Hello World -Build With Gradle";
    }

    @GetMapping("/*")
    public String hello_2()
    {
        return "Hello Durjoy -Build With Gradle";
    }

}
