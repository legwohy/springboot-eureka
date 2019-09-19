package com.cobra.boot.eureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
public class UserController
{

    /**
     * 假如这个客户端要提供一个getUser的方法
     */
    @GetMapping(value = "/getUser")
    public Map<String,Object> getUser(@RequestParam Integer id){
        Map<String,Object> data = new HashMap<>();
        data.put("id",id);
        data.put("userName","admin");
        data.put("from","provider-A");
        return data;
    }
}
