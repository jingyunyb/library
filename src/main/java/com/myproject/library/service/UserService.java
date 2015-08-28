package com.myproject.library.service;

import com.myproject.library.domain.User;


public interface UserService extends BaseService<User>{
    
    public User find(String name,String password);
    
}
