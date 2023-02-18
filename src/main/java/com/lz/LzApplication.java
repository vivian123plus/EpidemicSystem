package com.lz;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.lz.DAO.LoginDAO")
public class LzApplication {

    public static void main(String[] args) {
        SpringApplication.run(LzApplication.class, args);
    }

}
