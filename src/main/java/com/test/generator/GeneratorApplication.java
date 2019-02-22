package com.test.generator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = "com.test.generator.dao")
@SpringBootApplication(scanBasePackages = {"com.test.generator.dao","com.test.generator.controller","com.test.generator.service","com.test.generator.entity"})
public class GeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(GeneratorApplication.class, args);
    }

}
