package com.qinfengsa.springcloud.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wangheng
 * @date 2021/3/15 9:13
 */
public interface EchoApi {

    @GetMapping("/echo")
    String echo(@RequestParam("msg") String msg);
}
