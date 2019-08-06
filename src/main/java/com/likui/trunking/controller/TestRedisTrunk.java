package com.likui.trunking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Set;

/**
 * @Auther: likui
 * @Date: 2019/3/31 15:13
 * @Description:测试redis集群
 */
@RestController
public class TestRedisTrunk {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @RequestMapping("/set")
    public void set(){
        redisTemplate.opsForValue().set("name","likui");
    }

    @RequestMapping("/get")
    public String get(){
        return redisTemplate.opsForValue().get("name");
    }

    @RequestMapping("/setage")
    public void setage(){
        redisTemplate.opsForValue().set("age","25");
    }
    @RequestMapping("/setage2")
    public void setage2(){
        redisTemplate.opsForValue().set("age","26");
    }

    @RequestMapping("/getage")
    public String getage(){
        return redisTemplate.opsForValue().get("age");
    }

    @RequestMapping("/setsex")
    public void setsex(){
        redisTemplate.opsForValue().set("sex","男");
    }

    @RequestMapping("/getsex")
    public String getsex(){
        return redisTemplate.opsForValue().get("sex");
    }

    @RequestMapping("/setphone")
    public void setphone(){
        redisTemplate.opsForValue().set("phone","13259102793");
    }

    @RequestMapping("/getphone")
    public String getphone(){
        return redisTemplate.opsForValue().get("phone");
    }

    @RequestMapping("/setaddess")
    public void setaddess(){
        redisTemplate.opsForValue().set("addess","西安");
    }

    @RequestMapping("/getaddess")
    public String getaddess(){
        return redisTemplate.opsForValue().get("addess");
    }

    @RequestMapping("/getkeys")
    public String getkeys(){
        StringBuilder sb = new StringBuilder();
        Set<String> sets = redisTemplate.keys("*");
        for(String key: sets){
            sb.append(","+key);
        }
        return sb.toString().substring(1);
    }
}
