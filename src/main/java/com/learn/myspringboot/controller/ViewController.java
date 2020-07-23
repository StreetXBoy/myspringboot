package com.learn.myspringboot.controller;

import com.learn.myspringboot.config.AuthorSettings;
import com.learn.myspringboot.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 重新做人idea基础学习
 * @date 2020-7-19
 */

@RestController
@SpringBootApplication
//用controller要报错注意！！！！！！
public class ViewController {
    @Autowired
    private AuthorSettings author;
    @Autowired
    HelloService helloService;
    @RequestMapping("/")
    public String hello(){
        return " id:"+author.getId()+" age: "+author.getAge()+"    test autoconfig: "+helloService.sayHello();
    }

}
