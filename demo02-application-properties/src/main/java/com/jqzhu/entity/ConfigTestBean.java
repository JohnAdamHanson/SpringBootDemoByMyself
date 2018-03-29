package com.jqzhu.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by zhujq18 on 2018/3/27.
 */

@Data
@Configuration
@ConfigurationProperties(prefix = "com.jqzhu")
@PropertySource("classpath:test.properties")
public class ConfigTestBean {
    private String testname;
    private String testwhere;
    private String testwhen;
}
