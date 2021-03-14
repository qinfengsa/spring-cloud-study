package com.qinfengsa.springcloud.service;

import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author wangheng
 * @date 2021/3/4 18:32
 */
@DubboService
public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(String msg) {
        return "[echo] Hello, " + msg;
    }
}
