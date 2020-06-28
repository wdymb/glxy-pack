package com.glsc;

import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfig
public class UserProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserProducerApplication.class, args);
    }

}
