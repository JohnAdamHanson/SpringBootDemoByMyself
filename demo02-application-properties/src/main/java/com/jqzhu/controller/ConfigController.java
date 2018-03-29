package com.jqzhu.controller;

import com.jqzhu.entity.ConfigBean;
import com.jqzhu.entity.ConfigTestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhujq18 on 2018/3/27.
 */

@RestController
public class ConfigController {
    @Autowired
    ConfigBean configBean;
    @Autowired
    ConfigTestBean configTestBean;

    @RequestMapping("/config")
    public String config() {
        return configBean.getName() + " from "
                + configBean.getWhere() + " on "
                + configBean.getWhen() + " #"
                + configBean.getRandomValue();
    }

    @RequestMapping("/testConfig")
    public String testConfig() {
        return configTestBean.getTestname() + " from "
                + configTestBean.getTestwhere() + " on "
                + configTestBean.getTestwhen();
    }
}
