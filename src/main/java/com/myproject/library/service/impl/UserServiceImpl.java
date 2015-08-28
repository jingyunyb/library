package com.myproject.library.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.myproject.library.domain.User;
import com.myproject.library.service.UserService;


@Service
public class UserServiceImpl extends BasicServiceImpl implements UserService {

	
	@Override
	public User getById(Long id) {
		return userDao.getById(id);
	}

	@Override
	public User loadById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		userDao.save(user);
		
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}

	@Override
	public void merge(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		User user = userDao.getById(id);
	    userDao.delete(user);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

    @ Override
    public User find(String name, String password){
        return userDao.find(name, password);
    }

}
