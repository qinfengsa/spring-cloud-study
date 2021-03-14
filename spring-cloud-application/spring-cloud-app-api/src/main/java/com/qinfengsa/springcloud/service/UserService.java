package com.qinfengsa.springcloud.service;

import com.qinfengsa.springcloud.domain.User;
import java.util.Collection;
import java.util.Optional;

/**
 * 用户服务
 *
 * @author qinfengsa
 * @date 2021/03/14 10:58
 */
public interface UserService {

    /**
     * 保存
     *
     * @param user
     * @return
     */
    Optional<User> save(User user);

    /**
     * 查询所有用户
     *
     * @return
     */
    Collection<User> findAll();
}
