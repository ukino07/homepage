package com.homepage;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by u_kino07 on 2018. 5. 14..
 */
@EnableWebMvc
@Configuration
@ComponentScan("com.homepage")
public class ApplicationConfig {
}
