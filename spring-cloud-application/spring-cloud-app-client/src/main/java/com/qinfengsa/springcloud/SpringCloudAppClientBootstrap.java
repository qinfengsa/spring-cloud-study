package com.qinfengsa.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * SpringCloud 客户端 @EnableDiscoveryClient 注解 启用服务发现
 *
 * @author qinfengsa
 * @date 2021/03/14 11:10
 */
@SpringBootApplication
public class SpringCloudAppClientBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAppClientBootstrap.class, args);
    }

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
