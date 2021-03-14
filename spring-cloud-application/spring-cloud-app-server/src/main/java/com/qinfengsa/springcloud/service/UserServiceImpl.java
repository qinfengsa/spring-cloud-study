package com.qinfengsa.springcloud.service;

import com.qinfengsa.springcloud.domain.User;
import com.qinfengsa.springcloud.repository.UserRepository;
import java.util.Collection;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author qinfengsa
 * @date 2021/03/14 11:24
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired private UserRepository userRepository;

    @Override
    public Optional<User> save(User user) {
        return userRepository.save(user);
    }

    @Override
    public Collection<User> findAll() {
        return userRepository.findAll();
    }
}
