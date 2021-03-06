package com.springclouddemo.cousumeruser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hello(String name){
        return restTemplate.getForObject("http://PROVIDER-TICKT/hello?name="+name,String.class);
    }

}
