package com.myproject.library.domain;

import java.util.Set;


public class Role {
    
	private Long id;
	private String name;
	
	private Set<WebAction> webActionSet;
	private Set<Menu> menuSet;
	
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Set<WebAction> getWebActionSet(){
        return webActionSet;
    }
    public void setWebActionSet(Set<WebAction> webActionSet){
        this.webActionSet = webActionSet;
    }
    public Set<Menu> getMenuSet(){
        return menuSet;
    }
    public void setMenuSet(Set<Menu> menuSet){
        this.menuSet = menuSet;
    }
	
}
