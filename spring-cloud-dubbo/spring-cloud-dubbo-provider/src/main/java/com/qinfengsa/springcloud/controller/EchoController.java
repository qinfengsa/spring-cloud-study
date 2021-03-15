package com.qinfengsa.springcloud.controller;

import com.qinfengsa.springcloud.api.EchoApi;
import com.qinfengsa.springcloud.service.EchoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangheng
 * @date 2021/3/5 10:39
 */
@RestController
public class EchoController implements EchoApi {

    private final EchoService echoService;

    public EchoController(EchoService echoService) {
        this.echoService = echoService;
    }

    @GetMapping("/echo")
    public String echo(String msg) {

        return echoService.echo(msg);
    }
}
