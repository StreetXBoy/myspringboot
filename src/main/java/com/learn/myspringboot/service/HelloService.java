package com.learn.myspringboot.service;

/**
 * @author 重新做人idea基础学习
 * @date 2020-7-20
 */

public class HelloService {
    private  String msg;


    public  String sayHello(){
        return  "hello!!!! "+msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
