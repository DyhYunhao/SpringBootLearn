package com.daiyh.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created with IntelliJ IDEA.
 * User: daiyunhao
 * Date: 2019/9/2
 * Description:配置类
 */
@Configuration
@ComponentScan("com.daiyh.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}
