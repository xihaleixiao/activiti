package com.activiti.demo;

import com.activiti.demo.utils.ActivitiUtils;
import org.activiti.engine.repository.Deployment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author zhanglei_yq
 * @date 2019/2/3 15:27
 * @description
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestActivitiUtils {

    @Autowired
    ActivitiUtils activitiUtils;

    @Test
    public void test() {
        List<Deployment> allDeplyoment = activitiUtils.getAllDeplyoment();
        System.out.println(allDeplyoment);
    }
}
