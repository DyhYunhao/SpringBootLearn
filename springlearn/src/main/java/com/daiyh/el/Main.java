package com.daiyh.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: daiyunhao
 * Date: 2019/9/2
 * Description:
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig resourceService = context.getBean(ElConfig.class);
        resourceService.outputResource();
        context.close();
    }

}
