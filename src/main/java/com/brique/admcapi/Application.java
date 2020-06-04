package com.brique.admcapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.text.SimpleDateFormat;

@EnableAspectJAutoProxy
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        System.setProperty("timestamp", new SimpleDateFormat("yyyyMMddHHmmss").format(System.currentTimeMillis()));
        SpringApplication.run(Application.class, args);
    }
}
