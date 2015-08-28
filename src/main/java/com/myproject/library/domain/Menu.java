package com.myproject.library.domain;

import java.util.Set;


public class Menu {
    
	private Long id;
	private String name;
	private String icon;
	private Integer sort;

	private WebAction webAction;
	private Menu superMenu;
	private Set<Menu> subMenuSet;

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

    public WebAction getWebAction(){
        return webAction;
    }

    public void setWebAction(WebAction webAction){
        this.webAction = webAction;
    }

    public String getIcon(){
        return icon;
    }

    public void setIcon(String icon){
        this.icon = icon;
    }

    public Integer getSort(){
        return sort;
    }

    public void setSort(Integer sort){
        this.sort = sort;
    }

    public Menu getSuperMenu(){
        return superMenu;
    }

    public void setSuperMenu(Menu superMenu){
        this.superMenu = superMenu;
    }

    public Set<Menu> getSubMenuSet(){
        return subMenuSet;
    }

    public void setSubMenuSet(Set<Menu> subMenuSet){
        this.subMenuSet = subMenuSet;
    }
    
}
