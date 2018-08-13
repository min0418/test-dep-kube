package com.example.testdeploykube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TestDeployKubeApplication {

    @RequestMapping("/hello")
    public String getHello() {
        return "Hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(TestDeployKubeApplication.class, args);
    }
}
