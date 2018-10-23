package com.dict.pop.user.popdictuser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dict.pop.user.popdictuser.mapper")
public class PopdictUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(PopdictUserApplication.class, args);
    }
}
