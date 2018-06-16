package com.homepage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

/**
 * Created by u_kino07 on 2018. 5. 21..
 */
@Configuration
public class TilesConfig {
    @Bean
    public TilesConfigurer tilesConfigurer() {
        TilesConfigurer configurer = new TilesConfigurer();
        configurer.setDefinitions("/tiles/*.xml");
        configurer.setCheckRefresh(true);
        return configurer;
    }

    @Bean
    public TilesViewResolver viewResolver() {
        TilesViewResolver resolver = new TilesViewResolver();
        resolver.setViewClass(TilesView.class);
        resolver.setContentType("text/html; charset=UTF-8");
        return resolver;
    }
}
