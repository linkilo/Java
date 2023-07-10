package com.carlease.carlease;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * 启动类
 */
@ServletComponentScan//因为拦截器Filter不是SpringBoot提供的，而是java的三大组件之一servlet中的，所以要正常使用，必须加上这个注解，扫描Filter（开启了对servlet组件的支持）
@SpringBootApplication
public class CarLeaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarLeaseApplication.class, args);
    }

}
