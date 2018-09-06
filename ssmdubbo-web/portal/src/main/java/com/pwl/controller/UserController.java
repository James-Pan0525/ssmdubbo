package com.pwl.controller;

import com.pwl.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("getUser")
    @ResponseBody
    public String getUser(){
        return userService.sayHello("哈哈");
    }

    @RequestMapping("test")
    @ResponseBody
    public String test(){

        return "哈哈";
    }

}
