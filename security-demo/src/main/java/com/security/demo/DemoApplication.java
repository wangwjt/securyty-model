package com.security.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

/**
 * @author wangjiantao
 * @date 2020/4/29 11:26
 */
@SpringBootApplication
@ComponentScan(basePackages = {"security.app.config",
        "security.app.service",
        "security.app.handler",
        "com.security.demo.controller"})
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
