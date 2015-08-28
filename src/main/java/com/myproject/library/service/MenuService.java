package com.myproject.library.service;

import com.myproject.library.domain.Menu;


public interface MenuService extends BaseService<Menu>{
    
    public Menu find(String url);
}
