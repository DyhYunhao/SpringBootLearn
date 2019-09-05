package com.daiyh.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: daiyunhao
 * Date: 2019/9/4
 * Description:@EnableScheduling来开启对计划任务的支持，然后在要执行计划任务的方法上注解,@Scheduled，声明这是一个计划任务
 */
@Service
public class ScheduledTaskService {

    private static final SimpleDateFormat dataFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000 )
    private void reportCurrentTime(){
        System.out.println("每隔５秒执行一次:　" + dataFormat.format(new Date()));
    }

    @Scheduled(cron = "0 20 17 ? * *" )
    private void fixTimeExecution(){
        System.out.println("在指定时间: " + dataFormat.format(new Date()) + " 执行");
    }

}
