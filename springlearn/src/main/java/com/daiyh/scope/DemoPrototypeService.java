package com.daiyh.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: daiyunhao
 * Date: 2019/9/2
 * Description: Prototype的Bean。声明Scope为Prototype。
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
