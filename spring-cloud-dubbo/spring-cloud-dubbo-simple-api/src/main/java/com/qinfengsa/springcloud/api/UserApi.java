package com.qinfengsa.springcloud.api;

import com.qinfengsa.springcloud.entity.User;
import java.util.Collection;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author wangheng
 * @date 2021/3/15 9:13
 */
public interface UserApi {

    @GetMapping("/list")
    Collection<User> listUser();

    @GetMapping("/{id}")
    User getUser(@PathVariable("id") Long id);

    @PostMapping
    String saveUser(@ModelAttribute User user);
}
