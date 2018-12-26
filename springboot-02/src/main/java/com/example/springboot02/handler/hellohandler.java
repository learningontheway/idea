package com.example.springboot02.handler;


import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import javax.servlet.http.HttpSession;

@Controller
public class hellohandler {


    @GetMapping("/hello")
    public String hello(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HttpSession session){
        session.setAttribute("sessionname",username);
        session.setAttribute("sessionpassword",password);
        if(!StringUtils.isEmpty(username) && "123456".equals(password))
        return "success";
        else {

            return "index";
        }
    }
}
