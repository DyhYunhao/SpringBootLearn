package com.daiyh.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: daiyunhao
 * Date: 2019/9/4
 * Description:
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);

        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        demoPublisher.publish("hello world!");

        context.close();
    }

}
