package com.daiyh.fortest;

import com.daiyh.fortest.TestBean;
import com.daiyh.fortest.TestConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created with IntelliJ IDEA.
 * User: daiyunhao
 * Date: 2019/9/5
 * Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
@ActiveProfiles("prod")
public class DemoBeanIntegrationTests {

    @Autowired
    private TestBean testBean;

    @Test
    public void  prodBeanShouldInject(){
        String e = "from production profile";
        String actual = testBean.getContent();
        Assert.assertEquals(e, actual);
    }

}
