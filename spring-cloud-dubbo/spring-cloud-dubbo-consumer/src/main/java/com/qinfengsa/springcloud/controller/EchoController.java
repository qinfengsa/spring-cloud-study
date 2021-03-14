package com.qinfengsa.springcloud.controller;

import com.qinfengsa.springcloud.service.EchoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangheng
 * @date 2021/3/5 10:39
 */
@RestController
public class EchoController {

    @DubboReference private EchoService echoService;

    @GetMapping("/echo")
    public String echo(String msg) {

        return echoService.echo(msg);
    }
}
