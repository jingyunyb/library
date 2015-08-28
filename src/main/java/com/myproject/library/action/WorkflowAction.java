package com.myproject.library.action;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.activiti.engine.FormService;
import org.activiti.engine.HistoryService;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;

import com.myproject.library.domain.User;
import com.myproject.library.service.WorkflowService;


public class WorkflowAction extends BaseAction {
	
    @Resource
    protected ProcessEngine processEngine;
    @Resource
    protected RepositoryService repositoryService;
    @Resource
    protected RuntimeService runtimeService;
    @Resource
    protected TaskService taskService;
    @Resource
    protected HistoryService historyService;
    @Resource
    protected FormService formService;

    @Resource
    protected WorkflowService workflowService;
    
    private Long id;
    private Long bookId;
    private Long userId;
    private String taskId;
    
    private String deploymentId;
    
    private List<Deployment> deploymentList;
    private List<ProcessDefinition> processDefinitionList;
    private List<Task> taskList;
    
    /**
     * 
     * 列出所有工作流
     * @author yangbo
     * @date 2015年8月25日 上午9:29:37
     * @return
     */
    public String listWorkflow(){
        
        deploymentList = workflowService.listDeployment();
        
        processDefinitionList = workflowService.listProcessDefinition();
        
        
        
        return SUCCESS;
    }
    
    /**
     * 
     * 部署工作流
     * @author yangbo
     * @date 2015年8月25日 上午9:28:12
     * @return
     */
    public String deployWorkflowPro(){
        
        InputStream inputStreamBpmn = this.getClass().getResourceAsStream("/com/myproject/library/activiti/bpmn/RenewBook.bpmn");
        InputStream inputStreamPng = this.getClass().getResourceAsStream("/com/myproject/library/activiti/bpmn/RenewBook.png");

        Deployment deployment = processEngine.getRepositoryService().createDeployment()
                                .name("续借图书工作流")
                                .addInputStream("RenewBook.bpmn", inputStreamBpmn)
                                .addInputStream("RenewBook.png", inputStreamPng)
                                .deploy();
        
//        Deployment deployment = processEngine.getRepositoryService()
//            .createDeployment()
//            .name("续借图书工作流")
//            .addClasspathResource("com/myproject/library/activiti/bpmn/RenewBook.bpmn")
//            .addClasspathResource("com/myproject/library/activiti/bpmn/RenewBook.png")
//            .deploy();

        System.out.println("id:" + deployment.getId());
        System.out.println("name:" + deployment.getName());
        
        return SUCCESS;
    }
    
    /**
     * 
     * 删除工作流
     * @author yangbo
     * @date 2015年8月25日 上午10:37:30
     * @return
     */
    public String deleteWorkflowPro(){

        workflowService.deleteDeployment(deploymentId);
        return SUCCESS;
    }
    
    /**
     * 
     * 续借图书，启动一个续借图书的流程实例
     * @author yangbo
     * @date 2015年8月25日 上午11:53:52
     * @return
     */
    public String renewBookPro(){
        User user = userService.getById(userId);
        
        Map<String,Object> variables = new HashMap<String,Object>();
        variables.put("bookId", bookId);
        variables.put("userId", userId);
        variables.put("student", user.getName());
        
        ProcessInstance processInstance = processEngine.getRuntimeService().startProcessInstanceByKey("RenewBook",variables);
        
        System.out.println(processInstance.getId());
        System.out.println(processInstance.getProcessDefinitionId());
        System.out.println(processInstance.getProcessInstanceId());
        
        Task task = taskService.createTaskQuery().processInstanceId(processInstance.getId()).singleResult();
        
        System.out.println(task.getId());
        
        variables.put("teacher", "teacher");
        taskService.complete(task.getId(), variables);
        
        System.out.println(processInstance);
        return SUCCESS;
        
    }
    
    
    /**
     * 
     * 老师审批
     * @author yangbo
     * @date 2015年8月25日 下午2:17:20
     * @return
     */
    public String teacherApproval(){
        
        taskList = taskService.createTaskQuery().taskAssignee("teacher").list();
        
        
        return SUCCESS;
    }
    
    /**
     * 
     * 批准任务
     * @author yangbo
     * @date 2015年8月26日 上午9:30:08
     * @return
     */
    public String teacherApprovalTaskPro(){
        Map<String,Object> variables = new HashMap<String,Object>();
        variables.put("approve", "true");
        variables.put("admin", "admin");
        taskService.complete(taskId, variables);
        return SUCCESS;
    }
    
    /**
     * 
     * 不批准任务
     * @author yangbo
     * @date 2015年8月26日 上午9:30:22
     * @return
     */
    public String teacherDisapprovalTaskPro(){
        
        
        
        return SUCCESS;
    }
    
    /**
     * 
     * 管理员审批
     * @author yangbo
     * @date 2015年8月25日 下午2:17:20
     * @return
     */
    public String adminApproval(){
        
        taskList = taskService.createTaskQuery().taskAssignee("admin").list();
        
        
        return SUCCESS;
    }
    
    public String adminApprovalTaskPro(){
        Map<String,Object> variables = new HashMap<String,Object>();
        variables.put("approve", "true");
        taskService.complete(taskId, variables);
        return SUCCESS;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    
    public Long getBookId(){
        return bookId;
    }

    public void setBookId(Long bookId){
        this.bookId = bookId;
    }

    public Long getUserId(){
        return userId;
    }

    public void setUserId(Long userId){
        this.userId = userId;
    }
    
    public String getTaskId(){
        return taskId;
    }

    public void setTaskId(String taskId){
        this.taskId = taskId;
    }

    public String getDeploymentId(){
        return deploymentId;
    }

    public void setDeploymentId(String deploymentId){
        this.deploymentId = deploymentId;
    }

    public List<Deployment> getDeploymentList(){
        return deploymentList;
    }

    public void setDeploymentList(List<Deployment> deploymentList){
        this.deploymentList = deploymentList;
    }

    public List<ProcessDefinition> getProcessDefinitionList(){
        return processDefinitionList;
    }

    public void setProcessDefinitionList(List<ProcessDefinition> processDefinitionList){
        this.processDefinitionList = processDefinitionList;
    }

    public List<Task> getTaskList(){
        return taskList;
    }

    public void setTaskList(List<Task> taskList){
        this.taskList = taskList;
    }
    
}
