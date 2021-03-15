package com.qinfengsa.springcloud.controller;

import com.qinfengsa.springcloud.client.EchoServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangheng
 * @date 2021/3/5 10:39
 */
@RestController
public class EchoFeignController {

    @Autowired @Lazy private EchoServiceClient echoServiceClient;

    @GetMapping("/echo2")
    public String echo(String msg) {

        return echoServiceClient.echo(msg);
    }
}
