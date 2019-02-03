package com.activiti.demo;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author zhanglei_yq
 * @date 2019/2/3 10:42
 * @description
 **/
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * 注册ProcessEngine
     *
     * @return
     */
    @Bean
    public ProcessEngine processEngine() {
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        return processEngine;
    }
}
