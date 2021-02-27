package com.duing.yaml.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "food")
@Data
public class FoodConfig {

    private String apple;

    private String juice;

}
