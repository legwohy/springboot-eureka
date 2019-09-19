package com.cobra.boot.eureka.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;


@FeignClient("service-provider")
public interface UserService
{
    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
     Map<String,Object> getUser(@RequestParam("id") Integer id);
}
