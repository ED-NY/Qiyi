package com.hld.qiyi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//本文件用于扩展配置自己的mvc
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    //变更视图解析器
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("").setViewName("");
    }
}
