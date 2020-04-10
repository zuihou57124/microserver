package com.springclouddemo.cousumeruser.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.springclouddemo.cousumeruser.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    HelloService helloService;

    @Value("${jdbc.username}")
    String username;

    @RequestMapping("/hello")
    @ResponseBody
    @HystrixCommand(fallbackMethod = "hystrix")
    public String hello(String name){
        return helloService.hello(name);
        //return username;
    }

    public String hystrix(String name){
        return ("亲爱的"+name+",出错啦");
    }
}
