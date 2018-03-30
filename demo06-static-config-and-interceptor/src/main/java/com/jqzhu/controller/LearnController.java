package com.jqzhu.controller;

import com.jqzhu.entity.LearnResource;
import com.jqzhu.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhujq18 on 2018/3/29.
 */

@Controller
public class LearnController {

    @ResponseBody
    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    public Map<String, Object> doLogin(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> map = new HashMap<>();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (!StringUtils.isEmpty(username) && !StringUtils.isEmpty(password)) {
            User user = new User(username, password);
            request.getSession().setAttribute("user", user);
            map.put("result", "1");
        } else {
            map.put("result", "0");
        }
        return map;
    }


    @RequestMapping("/resourceList")
    public ModelAndView resourceList() {
        List<LearnResource> resourceList = new ArrayList<>();
        LearnResource bean = new LearnResource("官方参考文档", "Spring Boot Reference Guide", "http://docs.spring.io/spring-boot/docs/1.5.1.RELEASE/reference/htmlsingle/#getting-started-first-application");
        resourceList.add(bean);
        bean = new LearnResource("官方SpriongBoot例子", "官方SpriongBoot例子", "https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples");
        resourceList.add(bean);
        bean = new LearnResource("龙果学院", "Spring Boot 教程系列学习", "http://www.roncoo.com/article/detail/125488");
        resourceList.add(bean);
        bean = new LearnResource("嘟嘟MD独立博客", "Spring Boot干货系列 ", "http://tengj.top/");
        resourceList.add(bean);
        bean = new LearnResource("后端编程嘟", "Spring Boot教程和视频 ", "http://www.toutiao.com/m1559096720023553/");
        resourceList.add(bean);
        bean = new LearnResource("程序猿DD", "Spring Boot系列", "http://blog.didispace.com/spring-boot-learning-1/");
        resourceList.add(bean);
        bean = new LearnResource("纯洁的微笑", "Sping Boot系列文章", "http://www.ityouknow.com/spring-boot");
        resourceList.add(bean);
        bean = new LearnResource("CSDN——小当博客专栏", "Sping Boot学习", "http://blog.csdn.net/column/details/spring-boot.html");
        resourceList.add(bean);
        bean = new LearnResource("梁桂钊的博客", "Spring Boot 揭秘与实战", "http://blog.csdn.net/column/details/spring-boot.html");
        resourceList.add(bean);
        bean = new LearnResource("林祥纤博客系列", "从零开始学Spring Boot ", "http://412887952-qq-com.iteye.com/category/356333");
        resourceList.add(bean);
        ModelAndView modelAndView = new ModelAndView("/learnResourceList");
        modelAndView.addObject("resourceList", resourceList);
        return modelAndView;
    }
}
