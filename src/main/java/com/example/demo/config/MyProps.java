package com.example.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: dingwei
 * @Date: 2020/07/28/10:06
 * @Description:
 **/
@Component
@ConfigurationProperties(prefix = "myprops") //接收application.yml中的myProps下面的属性
public class MyProps {
    /*文件回调url*/
    private String url;


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}