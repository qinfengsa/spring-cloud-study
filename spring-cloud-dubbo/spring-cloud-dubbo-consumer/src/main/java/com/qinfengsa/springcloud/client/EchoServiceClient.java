package com.qinfengsa.springcloud.client;

import com.qinfengsa.springcloud.api.EchoApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author wangheng
 * @date 2021/3/15 9:17
 */
@FeignClient(
        name = "${provider.application.name}",
        contextId = "${provider.application.name}.EchoApi")
public interface EchoServiceClient extends EchoApi {}
