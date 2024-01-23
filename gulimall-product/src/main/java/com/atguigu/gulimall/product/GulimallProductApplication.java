package com.atguigu.gulimall.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Administrator
 * @since 2024/1/20 20:17
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }
}
