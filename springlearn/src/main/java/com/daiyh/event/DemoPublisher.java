package com.daiyh.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: daiyunhao
 * Date: 2019/9/4
 * Description:事件发布类
 */
@Component
public class DemoPublisher {

    @Autowired
    ApplicationContext applicationContext;

    public void publish(String msg){
        applicationContext.publishEvent(new DemoEvent(this, msg));
    }

}
