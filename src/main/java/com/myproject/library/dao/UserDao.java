package com.myproject.library.dao;

import com.myproject.library.domain.User;


public interface UserDao extends BaseDao<User>{

    
    public User find(String name,String password);
    
}
