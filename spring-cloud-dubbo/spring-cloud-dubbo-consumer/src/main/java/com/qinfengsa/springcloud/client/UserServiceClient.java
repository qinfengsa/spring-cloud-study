package com.qinfengsa.springcloud.client;

import com.alibaba.cloud.dubbo.annotation.DubboTransported;
import com.qinfengsa.springcloud.api.UserApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author wangheng
 * @date 2021/3/15 9:17
 */
@FeignClient(
        name = "${provider.application.name}",
        contextId = "${provider.application.name}.UserApi",
        path = "/user")
@DubboTransported(protocol = "dubbo")
public interface UserServiceClient extends UserApi {}
