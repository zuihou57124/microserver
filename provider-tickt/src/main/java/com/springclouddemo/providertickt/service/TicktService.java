package com.springclouddemo.providertickt.service;

import org.springframework.stereotype.Service;

/**
 * @author qcw
 */
@Service
public class TicktService {
    public String getTickt(String name){
        return "你好, "+name;
    }
}
