package com.daiyh.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: daiyunhao
 * Date: 2019/9/4
 * Description:
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService service = context.getBean(AsyncTaskService.class);
        for (int i = 0; i < 10; i ++){
            service.executeAsyncTask(i);
            service.executeAsyncTaskPlus(i);
        }
        context.close();
    }

}
