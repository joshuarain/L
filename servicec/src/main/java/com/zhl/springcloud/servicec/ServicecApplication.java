package com.zhl.springcloud.servicec;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServicecApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicecApplication.class, args);
    }

    @Value("${server.port}")
    private String port;

    @GetMapping("serviceC")
    public String service() {
        return port + "-->serviceC";
    }
}
