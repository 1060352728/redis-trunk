package com.likui.trunking;

import com.likui.trunking.executor.TaskThreadPoolConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@EnableConfigurationProperties({TaskThreadPoolConfig.class} ) // 开启配置属性支持
public class RedisTrunkApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisTrunkApplication.class, args);
    }

}
