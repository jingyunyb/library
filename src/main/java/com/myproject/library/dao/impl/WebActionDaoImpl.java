package com.myproject.library.dao.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.myproject.library.dao.WebActionDao;
import com.myproject.library.domain.Menu;
import com.myproject.library.domain.WebAction;


@Service
public class WebActionDaoImpl extends BaseDaoImpl<WebAction> implements WebActionDao {

//    @ Override
//    public Menu find(String url){
//        String hql = "from Menu where url='"
//            + url
//            + "'";
//        
//        List<Menu> menuList = hibernateTemplate.find(hql);
//        if(menuList != null && menuList.size() > 0){
//            return menuList.get(0);
//        }
//        return null;
//    }



}
