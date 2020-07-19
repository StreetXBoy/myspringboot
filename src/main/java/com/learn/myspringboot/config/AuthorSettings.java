package com.learn.myspringboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author 重新做人idea基础学习
 * @date 2020-7-19
 */

@Component
@ConfigurationProperties(prefix = "author")
public class AuthorSettings {
    private  String id;
    private Long age;

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
