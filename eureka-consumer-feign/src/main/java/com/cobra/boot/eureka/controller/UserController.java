package com.cobra.boot.eureka.controller;

import com.cobra.boot.eureka.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
public class UserController
{
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/gotoUser")
    public Map<String,Object> getUser(@RequestParam Integer id){
        Map<String,Object> data = new HashMap<>();
        /**
         * 小伙伴发现没有，地址居然是http://service-provider
         * 居然不是http://127.0.0.1:8082/
         * 因为他向注册中心注册了服务，服务名称service-provider,我们访问service-provider即可
         */
        data = userService.getUser(id);
        return data;
    }

}
