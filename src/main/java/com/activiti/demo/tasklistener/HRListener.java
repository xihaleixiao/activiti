package com.activiti.demo.tasklistener;

import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;

/**
 * @author zhanglei_yq
 * @date 2019/2/3 13:47
 * @description
 **/
public class HRListener implements TaskListener {
    @Override
    public void notify(DelegateTask delegateTask) {
        delegateTask.setAssignee("人事");
    }
}
