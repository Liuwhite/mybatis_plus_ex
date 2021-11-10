package com.white.mp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.white.mp.mapper")
public class MpMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MpMainApplication.class, args);
    }
}
