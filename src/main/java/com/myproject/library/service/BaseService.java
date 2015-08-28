package com.myproject.library.service;

import java.util.List;

public interface BaseService<T> {
	
	public T getById(Long id);
	
	public T loadById(Integer id);
	
	public void save(T t);
	
	public void update(T t);
	
	public void merge(T t);
	
	public void delete(Long id);
	
	public List<T> findAll();
}
