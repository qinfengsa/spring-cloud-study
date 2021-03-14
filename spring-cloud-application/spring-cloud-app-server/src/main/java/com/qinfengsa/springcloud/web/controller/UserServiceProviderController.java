package com.qinfengsa.springcloud.web.controller;

import com.qinfengsa.springcloud.domain.User;
import com.qinfengsa.springcloud.service.UserService;
import java.util.Collection;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qinfengsa
 * @date 2021/03/14 11:25
 */
@RestController
@Slf4j
public class UserServiceProviderController {

    @Autowired private UserService userService;

    /**
     * @param user User
     * @return 如果保存成功的话，返回{@link User},否则返回<code>null</code>
     */
    @PostMapping("/user/save")
    public Optional<User> saveUser(@RequestBody User user) {
        log.info("user:{}", user);
        Optional<User> optionalUser = userService.save(user);
        log.info("保存用户：{}", optionalUser);
        return optionalUser;
    }

    /**
     * 罗列所有的用户数据
     *
     * @return 所有的用户数据
     */
    @GetMapping("/user/list")
    public Collection<User> list() {
        return userService.findAll();
    }
}
