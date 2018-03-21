package com.example.springbootmybatis.com.example.springbootmybatis.controller;
/*
* 描述：这是负责登录的Controller
* */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/api")
public class LoginController {
    @RequestMapping(value="/login",method = RequestMethod.POST)
    public String isLogin(){

        return  "index";
    }
}
