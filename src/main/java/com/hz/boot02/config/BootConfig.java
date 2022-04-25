package com.hz.boot02.config;

import com.hz.boot02.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//是标注该类为配置类， 读取启动类

@Configuration
public class BootConfig {
    @Bean

    public User newUser(){
        User user = new User();
        user.setUserName("
        return user;
    }

}
