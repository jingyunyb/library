package com.myproject.library.dao;

import com.myproject.library.domain.Menu;


public interface MenuDao extends BaseDao<Menu>{

    public Menu find(String url);
    
}
