package com.zhl.springcloud.servicea;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServiceaApplication {



    public static void main(String[] args) {
        SpringApplication.run(ServiceaApplication.class, args);
    }

    @Value("${server.port}")
    private String port;

    @GetMapping("serviceA")
    public String service() {
        return port + "-->serviceA";
    }

}
