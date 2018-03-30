package com.jqzhu.config;

import com.jqzhu.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by zhujq18 on 2018/3/29.
 */

/**
 * 重写WebMvcConfigurerAdapter类中的方法以增加额外的配置
 */
@Configuration
public class MyWebMvcConfigurerAdapter extends WebMvcConfigurerAdapter {

    /**
     * 配置静态访问资源
     * 通过addResourceHandler添加映射路径，
     * 然后通过addResourceLocations来指定文件放置的路径。
     *
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 自定义项目内目录
        registry.addResourceHandler("/my/**").addResourceLocations("classpath:/my/");
        // 指向外部目录
//        registry.addResourceHandler("/my/**").addResourceLocations("file:D:/my/");
        super.addResourceHandlers(registry);
    }


    /**
     * 页面跳转配置
     * 以前写SpringMVC的时候，如果需要访问一个页面，必须要写Controller类，然后再写一个方法跳转到页面；
     * 在这里配置后就不需要那么麻烦了，直接访问http://localhost:8080/toLogin就跳转到login.html页面了。
     * <p/>
     * 重写addViewControllers方法，并不会覆盖WebMvcAutoConfiguration中的addViewControllers；
     * 意味着我们自己的配置和Spring Boot的自动配置同时有效。
     *
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/toLogin").setViewName("login");
        super.addViewControllers(registry);
    }


    /**
     * 拦截器
     * addPathPatterns("/**")对所有请求都拦截，但是排除了/toLogin和/login请求的拦截。
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // addPathPatterns 添加拦截规则
        // excludePathPatterns 排除拦截
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**").excludePathPatterns("/toLogin", "/doLogin");
        super.addInterceptors(registry);
    }
}
