package com.qinfengsa.springcloud.controller;

import com.qinfengsa.springcloud.entity.User;
import com.qinfengsa.springcloud.service.UserService;
import java.util.Collection;
import org.apache.dubbo.config.annotation.DubboReference;
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
@RequestMapping("/user")
public class UserController {

    @DubboReference private UserService userService;

    @GetMapping("/list")
    public Collection<User> listUser() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") Long id) {
        return userService.findById(id);
    }

    @PostMapping
    public String saveUser(@ModelAttribute User user) {
        userService.save(user);
        return "success";
    }
}
