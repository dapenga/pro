package com.hz.boot02.controller;

import com.hz.boot02.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class indexController {
    @Autowired
    private User user;
    @RequestMapping("/showUser")
    @ResponseBody

    public String showUser(){
        System.out.println(user.getUserName());
        return user.getUserName();

    }

}
