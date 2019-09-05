package com.daiyh.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created with IntelliJ IDEA.
 * User: daiyunhao
 * Date: 2019/9/2
 * Description:使用JSR250   形式的Bean
 */
public class JSR250WayService {
    @PostConstruct
    public void init(){
        System.out.println("jsr250-init-method");
    }

    public JSR250WayService() {
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("jsr250-destory-method");
    }

}
