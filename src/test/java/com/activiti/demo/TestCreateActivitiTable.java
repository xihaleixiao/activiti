package com.activiti.demo;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author zhanglei_yq
 * @date 2019/2/3 11:03
 * @description
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestCreateActivitiTable {

    /**
     * 创建activiti相关的表
     */
    @Test
    public void creatTable() {
        ProcessEngine processEngine = ProcessEngineConfiguration.createProcessEngineConfigurationFromResourceDefault()
                .buildProcessEngine();
    }
}
