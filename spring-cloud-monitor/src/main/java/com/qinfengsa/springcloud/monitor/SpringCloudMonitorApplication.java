package com.qinfengsa.springcloud.monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wangheng
 * @date 2021/3/16 16:34
 */
@EnableAdminServer
@SpringBootApplication
public class SpringCloudMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudMonitorApplication.class, args);
    }
}
