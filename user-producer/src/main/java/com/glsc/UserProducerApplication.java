package com.glsc;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class UserProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserProducerApplication.class, args);
    }

}
