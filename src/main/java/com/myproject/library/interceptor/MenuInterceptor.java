package com.myproject.library.interceptor;

import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import com.myproject.library.domain.Menu;
import com.myproject.library.domain.User;
import com.myproject.library.service.MenuService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MenuInterceptor extends AbstractInterceptor{

    @Resource
    protected MenuService menuService;
    
    @ Override
    public String intercept(ActionInvocation invocation) throws Exception{
        Map<String, Object> session = ActionContext.getContext().getSession();
        User user = (User)session.get("user");
        
        String actionName = invocation.getInvocationContext().getName();
        session.put("currentActionUrl", actionName+".action");

        Menu menu = menuService.find(actionName+".action");
        if(menu != null){
            String superMenuName = menu.getSuperMenu().getName();
            session.put("superMenuName", superMenuName);
        }
        
        /*用户有权限的web_action集合*/
        
        
        
        
        /*用户有权限的菜单集合*/
        Set<Menu> menuSet = (Set<Menu>)session.get("menuSet");
        if(menuSet == null && user != null){
            menuSet = user.getRole().getMenuSet();
            ActionContext.getContext().getSession().put("menuSet", menuSet);
        }
        
        
        
        return invocation.invoke();
    }

}
