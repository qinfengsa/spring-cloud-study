package com.qinfengsa.springcloud;

import com.qinfengsa.springcloud.config.UserConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author wangheng
 * @date 2021/3/4 16:19
 */
@SpringBootApplication
public class NacosConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigApplication.class, args);
    }

    @Bean
    public UserConfig userConfig() {
        return new UserConfig();
    }
}
