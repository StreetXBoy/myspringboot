package com.learn.myspringboot.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author 重新做人idea基础学习
 * @date 2020-7-20
 */

@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {
    private  static  final String MSG="world";
    private  String msg=MSG;
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
