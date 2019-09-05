package com.daiyh.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: daiyunhao
 * Date: 2019/9/2
 * Description: 需被注入的Bean。
 */
@Service
public class DemoService {

    @Value("其他类的属性")
    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}
