package com.myproject.library.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.ProcessDefinition;
import org.springframework.stereotype.Service;

import com.myproject.library.service.WorkflowService;

@Service
public class WorkflowServiceImpl implements WorkflowService{

    @Resource
    protected RepositoryService repositoryService;
    
    
    @ Override
    public List<Deployment> listDeployment(){
        List<Deployment> deploymentList = repositoryService.createDeploymentQuery()
            .orderByDeploymenTime().asc()
            .list();
        return deploymentList;
    }


    @ Override
    public List<ProcessDefinition> listProcessDefinition(){
        List<ProcessDefinition> processDefinitionList = repositoryService.createProcessDefinitionQuery()
            .orderByProcessDefinitionVersion().asc()
            .list();
        return processDefinitionList;
    }


    @ Override
    public void deleteDeployment(String deploymentId){
        repositoryService.deleteDeployment(deploymentId, true);
    }

}
