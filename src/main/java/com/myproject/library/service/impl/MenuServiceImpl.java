package com.myproject.library.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.myproject.library.domain.Menu;
import com.myproject.library.domain.User;
import com.myproject.library.service.MenuService;
import com.myproject.library.service.UserService;


@Service
public class MenuServiceImpl extends BasicServiceImpl implements MenuService {

    @ Override
    public Menu getById(Long id){
        return menuDao.getById(id);
    }

    @ Override
    public Menu loadById(Integer id){
        // TODO Auto-generated method stub
        return null;
    }

    @ Override
    public void save(Menu t){
        // TODO Auto-generated method stub
        
    }

    @ Override
    public void update(Menu t){
        // TODO Auto-generated method stub
        
    }

    @ Override
    public void merge(Menu t){
        // TODO Auto-generated method stub
        
    }

    @ Override
    public void delete(Long id){
        // TODO Auto-generated method stub
        
    }

    @ Override
    public List<Menu> findAll(){
        return menuDao.findAll();
    }

    @ Override
    public Menu find(String url){
        return menuDao.find(url);
    }

	

}
