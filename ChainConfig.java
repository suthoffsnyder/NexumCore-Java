package com.nexum.core.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "nexum.chain")
public class ChainConfig {
    private int port;
    private String nodeName;
    private int blockInterval;
    private int consensusDifficulty;
}
