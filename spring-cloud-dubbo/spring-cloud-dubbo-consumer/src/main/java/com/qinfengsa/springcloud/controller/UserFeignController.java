package com.qinfengsa.springcloud.controller;

import com.qinfengsa.springcloud.client.UserServiceClient;
import com.qinfengsa.springcloud.entity.User;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangheng
 * @date 2021/3/4 18:37
 */
@RestController
@RequestMapping("/user2")
public class UserFeignController {
    @Autowired @Lazy private UserServiceClient userServiceClient;

    @GetMapping("/list")
    public Collection<User> listUser() {
        return userServiceClient.listUser();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") Long id) {
        return userServiceClient.getUser(id);
    }

    @PostMapping
    public String saveUser(@ModelAttribute User user) {
        userServiceClient.saveUser(user);
        return "success";
    }
}
