package com.wuyue.rmsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.wuyue.rmsystem.mapper")
@EnableCaching
public class RmsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(RmsystemApplication.class, args);
    }

}
