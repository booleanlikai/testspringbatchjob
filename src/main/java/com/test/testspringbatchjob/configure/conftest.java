package com.test.testspringbatchjob.configure;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;


@Configuration
@ImportResource("classpath:/test1/job/job.xml")
public class conftest {
}
