package com.qinfengsa.springcloud.service;

import com.qinfengsa.springcloud.entity.User;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author wangheng
 * @date 2021/3/4 18:34
 */
@Slf4j
@DubboService
public class StandUserServiceImpl implements UserService {

    private final Map<Long, User> userRepository = new HashMap<>();

    @Override
    public boolean save(User user) {
        log.info("save user:{}", user);
        return userRepository.put(user.getId(), user) == null;
    }

    @Override
    public boolean remove(Long userId) {
        return userRepository.remove(userId) != null;
    }

    @Override
    public Collection<User> findAll() {
        return userRepository.values();
    }

    @Override
    public User findById(Long id) {
        return userRepository.get(id);
    }
}
