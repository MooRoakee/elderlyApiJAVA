package com.roakee.practice04;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.roakee.practice04.mapper")
public class Practice04Application {

    public static void main(String[] args) {
        SpringApplication.run(Practice04Application.class, args);
    }

}
