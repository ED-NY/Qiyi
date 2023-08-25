package com.hld.qiyi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/**
 * @Author: Liuchunxin
 * @Date: 2023-08-21-15:16
 * @Description: 拓展mvc配置文件
 */
//本文件用于扩展配置自己的mvc
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    //变更视图解析器
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("").setViewName("");
    }
}
