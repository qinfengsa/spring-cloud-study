package com.qinfengsa.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 客户端 EnableDiscoveryClient
 *
 * @author qinfengsa
 * @date 2021/03/14 11:10
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudAppServerBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAppServerBootstrap.class, args);
    }
}
