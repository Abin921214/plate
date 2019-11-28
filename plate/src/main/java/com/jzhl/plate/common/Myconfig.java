package com.jzhl.plate.common;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class Myconfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/image/**").addResourceLocations("file:" + "/data/resource/plate/");
//        registry.addResourceHandler("/image/**").addResourceLocations("file:" + "E://temp-rainy/plate/");
    }

}
