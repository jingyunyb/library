package com.myproject.library.action;

import java.util.Map;

import com.myproject.library.domain.User;
import com.opensymphony.xwork2.ActionContext;

@SuppressWarnings("serial")
public class LoginAction extends BaseAction {
	
    private User user;
    
    /**
     * 
     * 登录页面
     * @author yangbo
     * @date 2015年8月26日 下午5:48:42
     * @return
     */
	public String login(){
		
	    System.out.println();
	    System.out.println();
	    System.out.println();
	    
	    return SUCCESS;
	}
	
	/**
	 * 
	 * 登录
	 * @author yangbo
	 * @date 2015年8月26日 下午5:49:54
	 * @return
	 */
	public String loginPro(){
	    Map<String, Object> session = ActionContext.getContext().getSession();
	    
	    User userValidate = userService.find(user.getName(),user.getPassword());
        if(userValidate != null){
            session.put("user", userValidate);
            return SUCCESS;
        }else{
            return ERROR;
        }
	}

	/**
	 * 
	 * 退出
	 * @author yangbo
	 * @date 2015年8月27日 上午9:26:12
	 * @return
	 */
	public String logoutPro(){
	    Map<String, Object> session = ActionContext.getContext().getSession();
	    session.put("user", null);
	    return SUCCESS;
	}

    public User getUser(){
        return user;
    }

    public void setUser(User user){
        this.user = user;
    }

    
}
