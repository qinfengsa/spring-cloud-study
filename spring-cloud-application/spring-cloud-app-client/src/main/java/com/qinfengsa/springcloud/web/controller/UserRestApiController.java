package com.qinfengsa.springcloud.web.controller;

import com.qinfengsa.springcloud.domain.User;
import com.qinfengsa.springcloud.service.UserService;
import java.util.Collection;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户 Rest
 *
 * @author qinfengsa
 * @date 2021/03/14 11:13
 */
@RestController
public class UserRestApiController {

    @Autowired private UserService userService;

    /**
     * @param name 请求参数名为“name”的数据
     * @return 如果保存成功的话，返回{@link User},否则返回<code>null</code>
     */
    @PostMapping("/user/save")
    public Optional<User> saveUser(@RequestParam String name) {
        User user = new User();
        user.setName(name);
        return userService.save(user);
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
