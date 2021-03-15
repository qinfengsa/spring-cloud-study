package com.qinfengsa.springcloud.config;

import java.util.Map;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author wangheng
 * @date 2021/3/4 16:20
 */
@Data
@ConfigurationProperties(prefix = "user")
public class UserConfig {

    private int age;

    private String name;

    private String addr;

    private Map<String, Object> map;
}
