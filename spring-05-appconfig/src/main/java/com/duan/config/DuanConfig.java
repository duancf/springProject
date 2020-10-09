package com.duan.config;

import com.duan.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DuanConfig {
    @Bean
    public User getUser()
    {
        return new User();
    }
}
