package com.myproject.library.dao;

import java.util.List;

public interface BaseDao<T> {
	
	public T getById(Long id);
	
	public T loadById(Long id);
	
	public void save(T t);
	
	public void update(T t);
	
	public void merge(T t);
	
	public void delete(T t);
	
	public List<T> findAll();
}
