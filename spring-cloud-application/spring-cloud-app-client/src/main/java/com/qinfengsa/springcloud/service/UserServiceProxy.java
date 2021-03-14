package com.qinfengsa.springcloud.service;

import com.qinfengsa.springcloud.domain.User;
import java.util.Collection;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author qinfengsa
 * @date 2021/03/14 11:14
 */
@Service
public class UserServiceProxy implements UserService {

    // 地址
    private static final String PROVIDER_SERVER_URL_PREFIX = "http://user-service-provider";

    /** 通过 REST API 代理到服务器提供者 */
    @Autowired private RestTemplate restTemplate;

    @Override
    public Optional<User> save(User user) {
        return restTemplate.postForObject(
                PROVIDER_SERVER_URL_PREFIX + "/user/save", user, Optional.class);
    }

    @Override
    public Collection<User> findAll() {
        return restTemplate.getForObject(
                PROVIDER_SERVER_URL_PREFIX + "/user/list", Collection.class);
    }
}
