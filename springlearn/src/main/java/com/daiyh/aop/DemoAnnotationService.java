package com.daiyh.aop;

import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: daiyunhao
 * Date: 2019/9/2
 * Description:使用注解的被拦截类
 */
@Service
public class DemoAnnotationService {

    @Action(name = "注解式拦截的add操作")
    public void add(){}

}
