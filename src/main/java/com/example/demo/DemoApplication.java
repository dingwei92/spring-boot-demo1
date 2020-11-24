package com.example.demo;

import com.example.demo.filter.CustomFilter;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootApplication
public class DemoApplication {
    protected static Logger logger= LoggerFactory.getLogger(DemoApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        logger.info("DemoApplication初始化{}",1);
    }
    // 注册过滤器
    @Bean
    public FilterRegistrationBean<CustomFilter> registration() {
        CustomFilter filter = new CustomFilter();
        FilterRegistrationBean<CustomFilter> registration = new FilterRegistrationBean<CustomFilter>(filter);
        registration.addUrlPatterns("/hello");
        logger.info("registration 初始化");
        return registration;
    }
}
