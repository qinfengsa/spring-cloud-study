package com.qinfengsa.springcloud.controller;

import com.alibaba.cloud.nacos.NacosConfigManager;
import com.qinfengsa.springcloud.config.UserConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangheng
 * @date 2021/3/4 16:23
 */
@RestController
public class UserController {

    @Value("${user.name:zz}")
    String userName;

    @Value("${user.age:25}")
    Integer age;

    @Autowired UserConfig userConfig;

    @Autowired private NacosConfigManager nacosConfigManager;

    @Autowired private Environment environment;

    @RequestMapping("/user")
    public String simple() {
        return "Hello Nacos Config!"
                + "Hello "
                + userName
                + " "
                + age
                + " [UserConfig]: "
                + userConfig
                + "!"
                + nacosConfigManager.getConfigService();
    }

    @RequestMapping("/get/{name}")
    public String getValue(@PathVariable String name) {
        return String.valueOf(environment.getProperty(name));
    }

    @RequestMapping("/bool")
    public boolean bool() {
        return (Boolean) (userConfig.getMap().get("2"));
    }
}
