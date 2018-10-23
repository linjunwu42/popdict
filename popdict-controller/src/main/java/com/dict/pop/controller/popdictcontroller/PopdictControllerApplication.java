package com.dict.pop.controller.popdictcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class PopdictControllerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PopdictControllerApplication.class, args);
    }
}
