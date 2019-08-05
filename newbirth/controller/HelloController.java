package cn.beyond.newbirth.controller;

import cn.beyond.newbirth.domain.User;
import cn.beyond.newbirth.service.IUserService;
import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private IUserService userService;
    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/hello")
    public User  hello(Long id){
        User user = userService.selectById(id);
        ValueOperations ops = redisTemplate.opsForValue();
        String s = JSON.toJSONString(user);
        ops.set("redis-user", s);
        ops.set("redis-string1","sir");
        ops.set("today","20190705");
        System.out.println("tpl");
        int i=1；
            int j=2;
        return user;
    }






}
