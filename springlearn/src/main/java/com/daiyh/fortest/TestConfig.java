package com.daiyh.fortest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created with IntelliJ IDEA.
 * User: daiyunhao
 * Date: 2019/9/5
 * Description:
 */
@Configuration
public class TestConfig {

    @Bean
    @Profile("dev")
    public TestBean devTestBean() {
        return new TestBean("from development profile");
    }

    @Bean
    @Profile("dev")
    public TestBean prodTestBean() {
        return new TestBean("from  production profile");
    }

}
