package com.daiyh.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created with IntelliJ IDEA.
 * User: daiyunhao
 * Date: 2019/9/4
 * Description:
 */
@Configuration
@ComponentScan("com.daiyh.taskscheduler")
@EnableScheduling
public class TaskSchedulerConfig {
}
