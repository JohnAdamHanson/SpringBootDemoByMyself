package com.jqzhu.controller;

import com.jqzhu.entity.LearnResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhujq18 on 2018/3/28.
 */

@Controller
@RequestMapping("/learn")
public class LearnResourceController {

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

    // 访问页面的第二种方式
//    @RequestMapping("/resourceList")
//    public String resourceList(Model model) {
//        List<LearnResource> resourceList = new ArrayList<>();
//        LearnResource bean = new LearnResource("官方参考文档", "Spring Boot Reference Guide", "http://docs.spring.io/spring-boot/docs/1.5.1.RELEASE/reference/htmlsingle/#getting-started-first-application");
//        resourceList.add(bean);
//        bean = new LearnResource("官方SpriongBoot例子", "官方SpriongBoot例子", "https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples");
//        resourceList.add(bean);
//        bean = new LearnResource("龙果学院", "Spring Boot 教程系列学习", "http://www.roncoo.com/article/detail/125488");
//        resourceList.add(bean);
//        bean = new LearnResource("嘟嘟MD独立博客", "Spring Boot干货系列 ", "http://tengj.top/");
//        resourceList.add(bean);
//        bean = new LearnResource("后端编程嘟", "Spring Boot教程和视频 ", "http://www.toutiao.com/m1559096720023553/");
//        resourceList.add(bean);
//        bean = new LearnResource("程序猿DD", "Spring Boot系列", "http://blog.didispace.com/spring-boot-learning-1/");
//        resourceList.add(bean);
//        bean = new LearnResource("纯洁的微笑", "Sping Boot系列文章", "http://www.ityouknow.com/spring-boot");
//        resourceList.add(bean);
//        bean = new LearnResource("CSDN——小当博客专栏", "Sping Boot学习", "http://blog.csdn.net/column/details/spring-boot.html");
//        resourceList.add(bean);
//        bean = new LearnResource("梁桂钊的博客", "Spring Boot 揭秘与实战", "http://blog.csdn.net/column/details/spring-boot.html");
//        resourceList.add(bean);
//        bean = new LearnResource("林祥纤博客系列", "从零开始学Spring Boot ", "http://412887952-qq-com.iteye.com/category/356333");
//        resourceList.add(bean);
//        model.addAttribute("resourceList", resourceList);
//        return "/learnResourceList";
//    }
}
