package com.qinfengsa.springcloud.config;

import com.alibaba.cloud.nacos.NacosConfigManager;
import com.alibaba.nacos.api.config.listener.Listener;
import java.util.concurrent.Executor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author wangheng
 * @date 2021/3/4 16:27
 */
@Slf4j
@Component
public class ConfigListener implements ApplicationRunner {

    private final NacosConfigManager nacosConfigManager;

    public ConfigListener(NacosConfigManager nacosConfigManager) {
        this.nacosConfigManager = nacosConfigManager;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        nacosConfigManager
                .getConfigService()
                .addListener(
                        "nacos-config-example.properties",
                        "DEFAULT_GROUP",
                        new Listener() {
                            @Override
                            public Executor getExecutor() {
                                return null;
                            }

                            @Override
                            public void receiveConfigInfo(String configInfo) {
                                /* Properties properties = new Properties();
                                try {
                                    properties.load(new StringReader(configInfo));
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                log.info("config changed: {}", properties);*/
                            }
                        });
    }
}
