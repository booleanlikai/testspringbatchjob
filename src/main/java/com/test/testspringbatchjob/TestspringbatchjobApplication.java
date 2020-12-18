package com.test.testspringbatchjob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
class TestspringbatchjobApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestspringbatchjobApplication.class, args);
    }

}
