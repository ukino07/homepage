package com.homepage;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by u_kino07 on 2018. 5. 28..
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/css/*.css")
                .addResourceLocations("/static/css/");
        registry.addResourceHandler("/js/*.js")
                .addResourceLocations("/static/js/");
    }
}
