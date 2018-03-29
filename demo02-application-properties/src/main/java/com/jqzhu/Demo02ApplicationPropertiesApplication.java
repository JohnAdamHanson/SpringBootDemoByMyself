package com.jqzhu;

import com.jqzhu.entity.ConfigBean;
import com.jqzhu.entity.ConfigTestBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({ConfigBean.class, ConfigTestBean.class})
public class Demo02ApplicationPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(Demo02ApplicationPropertiesApplication.class, args);
	}
}
