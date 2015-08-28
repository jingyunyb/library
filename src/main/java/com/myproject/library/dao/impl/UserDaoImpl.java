package com.myproject.library.dao.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.myproject.library.dao.UserDao;
import com.myproject.library.domain.User;


@Service
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

    @ Override
    public User find(String name, String password){
        String hql = "from User where name='" + name + "' and password='" + password +"'";
        List<User> userList = hibernateTemplate.find(hql);
        if(userList != null && userList.size()>0){
            return userList.get(0);
        }
        return null;
    }


}
