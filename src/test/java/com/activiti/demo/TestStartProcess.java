package com.activiti.demo;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhanglei_yq
 * @date 2019/2/3 13:55
 * @description
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestStartProcess {

    /**
     * 部署流程
     */
    @Test
    public void startDeploy() {
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        processEngine.getRepositoryService()
                .createDeployment()
                .name("调休流程")
                .addClasspathResource("holiday.bpmn")
                .addClasspathResource("holiday.png")
                .deploy();
    }

    /**
     * 启动流程实例
     */
    @Test
    public void startPI() {
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        Map<String, Object> variables = new HashMap<>();
        variables.put("employee", "张员工");
        processEngine.getRuntimeService()
                .startProcessInstanceById("myProcess_1:1:22504", variables);
    }


    /**
     * 提出申请
     */
    @Test
    public void apply() {
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        processEngine.getTaskService().complete("27506");
    }

    /**
     * 经理审核
     */
    @Test
    public void managerTask() {
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        processEngine.getTaskService().complete("30002");
    }

    /**
     * 分管领导审核
     */
    @Test
    public void leaderTask() {
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        processEngine.getTaskService().complete("32502");
    }

    /**
     * 人事审核
     */
    @Test
    public void hrTask() {
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        processEngine.getTaskService().complete("35002");
    }

    /**
     * 删除已经部署的Activiti流程
     */
    @Test
    public void testDelete() {
        //得到流程引擎
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        //第一个参数是部署的流程的ID，第二个true表示是进行级联删除
        processEngine.getRepositoryService()
                .deleteDeployment("20001", true);
    }

}
