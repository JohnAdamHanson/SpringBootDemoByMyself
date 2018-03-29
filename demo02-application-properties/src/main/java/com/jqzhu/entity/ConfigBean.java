package com.jqzhu.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by zhujq18 on 2018/3/27.
 */

@Data
@Component
@ConfigurationProperties(prefix = "com.jqzhu")
public class ConfigBean {
    private String name;
    private String where;
    private String when;
    private String randomValue;
}
