package com.wiley.beginningspring.ch11.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = {"com.wiley.beginningspring.ch11"})
@EnableWebMvc
public class AppConfig {
}
