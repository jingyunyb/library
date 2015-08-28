package com.myproject.library.dao.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.myproject.library.dao.MenuDao;
import com.myproject.library.domain.Menu;


@Service
public class MenuDaoImpl extends BaseDaoImpl<Menu> implements MenuDao {

    @ Override
    public Menu find(String url){
        String hql = "from Menu where webAction.url='"
            + url
            + "'";
        
        List<Menu> menuList = hibernateTemplate.find(hql);
        if(menuList != null && menuList.size() > 0){
            return menuList.get(0);
        }
        return null;
    }



}
