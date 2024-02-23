package com.assist.java.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication
@SpringBootConfiguration
public class MultiTenancyApplication {

  public static void main(String[] args) {
    SpringApplication.run(MultiTenancyApplication.class, args);
  }

}
