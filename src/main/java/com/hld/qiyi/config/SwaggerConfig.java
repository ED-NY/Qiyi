package com.hld.qiyi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //扫描包位置
                .apis(RequestHandlerSelectors.basePackage("com.hld.qiyi.controller"))
                .build();
    }

    private ApiInfo apiInfo(){
        Contact contact = new Contact("Liuchunxin","https://github.com/ED-NY/","piptsmile@gmail.com");
        return new ApiInfo("Liuchunxin Swagger",
                "Api Documentation",
                "1.0",
                "https://gitee.com/ED-NY/qiyi_project",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());
    }
}
