package com.myproject.library.service;

import java.util.List;

import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.ProcessDefinition;



public interface WorkflowService{
    
    /**
     * 
     * 列出工作流部署信息，对应表（act_re_deployment）
     * @author yangbo
     * @date 2015年8月25日 上午9:57:22
     * @return
     */
    public List<Deployment> listDeployment();
    
    /**
     * 
     * 列出流程定义，对应表（act_re_procdef）
     * @author yangbo
     * @date 2015年8月25日 上午10:02:32
     * @return
     */
    public List<ProcessDefinition> listProcessDefinition();
    
    /**
     * 
     * 删除
     * @author yangbo
     * @date 2015年8月25日 上午10:41:32
     * @param deploymentId
     */
    public void deleteDeployment(String deploymentId);
    
}
