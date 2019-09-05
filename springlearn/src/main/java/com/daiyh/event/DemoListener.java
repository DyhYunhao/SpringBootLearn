package com.daiyh.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: daiyunhao
 * Date: 2019/9/4
 * Description: 事件监听器。
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println("我（bean-demoListener）接收到了bean-demoPublisher发布的消息：　" + msg);
    }

}
