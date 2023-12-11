package com.example.restaurantsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.restaurantsystem.*.mapper")
public class RestaurantSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestaurantSystemApplication.class, args);
    }

}
