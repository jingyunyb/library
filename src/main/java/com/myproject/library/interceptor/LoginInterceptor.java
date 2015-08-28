package com.myproject.library.interceptor;

import java.util.Map;

import com.myproject.library.domain.User;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginInterceptor extends AbstractInterceptor{

    @ Override
    public String intercept(ActionInvocation invocation) throws Exception{
        Map<String, Object> session = ActionContext.getContext().getSession();
        User user = (User)session.get("user");
        
        String actionName = invocation.getInvocationContext().getName();
        
        if(user != null || "login".equals(actionName) || "loginPro".equals(actionName)){
            return invocation.invoke();
        }
        
        
        return Action.LOGIN;
    }

}
