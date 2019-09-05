package com.daiyh.taskscheduler;

import com.daiyh.taskexecutor.TaskExecutorConfig;
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
//        ScheduledTaskService scheduledTaskService = context.getBean(ScheduledTaskService.class);

    }
}
