package com.learn.myspringboot.controller;

import com.learn.myspringboot.person.Person;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 重新做人idea基础学习
 * @date 2020-7-21
 */
//为什么是controller？？因为controller返回网页而Restcontroller返回函数返回值！！！！
//如果只是使用@RestController注解Controller，则Controller中的方法无法返回jsp页面，配置的视图解析器InternalResourceViewResolver不起作用，返回的内容就是Return 里的内容。
//@RestController是@Controller和@ResponseBody的结合体，两个标注合并起来的作用。
@Controller
@SpringBootApplication
public class PersonController {
//@GetMapping用于将HTTP get请求映射到特定处理程序的方法注解
//具体来说，@GetMapping是一个组合注解，是@RequestMapping(method = RequestMethod.GET)的缩写。
//
//@PostMapping用于将HTTP post请求映射到特定处理程序的方法注解
//具体来说，@PostMapping是一个组合注解，是@RequestMapping(method = RequestMethod.POST)的缩写
    @RequestMapping("/index")
    public String index(Model model) throws Exception{
        Person single=new Person("aa",11);
        List<Person> personList=new ArrayList<Person>();
        Person p1=new Person("xx",1);
        Person p2=new Person("yy",2);
        Person p3=new Person("zz",3);
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        model.addAttribute("singlePerson",single);
        model.addAttribute("personList",personList);
        return  "index";
    }


}
