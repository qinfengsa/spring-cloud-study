package com.qinfengsa.springcloud.service;

import com.qinfengsa.springcloud.entity.User;
import java.util.Collection;

/**
 * @author wangheng
 * @date 2021/3/4 17:30
 */
public interface UserService {

    boolean save(User user);

    boolean remove(Long userId);

    Collection<User> findAll();

    User findById(Long id);
}
