package com.example.springboot01.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class hellocontroler {

    @ResponseBody
    @RequestMapping("/crud")
    public String hello(){
        return "hello world";
    }
    @RequestMapping("/success")
    public String success(){
        return "success";
    }

}
