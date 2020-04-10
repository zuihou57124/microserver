package com.springclouddemo.providertickt.controller;

import com.springclouddemo.providertickt.service.TicktService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TicktController {

    @Autowired
    TicktService ticktService;

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(String name){
        return ticktService.getTickt(name);
    }

}
