package com.daiyh.taskexecutor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * Created with IntelliJ IDEA.
 * User: daiyunhao
 * Date: 2019/9/4
 * Description:@EnableAsync注解开启异步任务支持。
 *              实现AsyncConfigurer接口并重写getAsyncExecutor方法，并返回一个ThreadPoolTaskExecutor，这样我们就获得
 *              了一个基于线程池TaskExecutor。
 */
@Configuration
@ComponentScan("com.daiyh.taskexecutor")
@EnableAsync
public class TaskExecutorConfig implements AsyncConfigurer {

    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(5);
        taskExecutor.setMaxPoolSize(10);
        taskExecutor.setQueueCapacity(25);
        taskExecutor.initialize();
        return taskExecutor;
    }

    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }
}
