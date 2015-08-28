package com.myproject.library.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.myproject.library.dao.BaseDao;


@SuppressWarnings("unchecked")
public class BaseDaoImpl<T> implements BaseDao<T> {
	
	private Class<T> clazz;
	
	@Resource
	protected HibernateTemplate hibernateTemplate;
	
	public BaseDaoImpl() {
		// 使用反射技术得到T的真实类型
		
		// 获取当前new的对象的泛型的父类类型
		ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass(); 
		// 获取第一个类型参数的真实类型
		this.clazz = (Class<T>) pt.getActualTypeArguments()[0]; 
		
//		System.out.println(this.getClass().getName());
//		System.out.println(this.getClass().getSimpleName());
//		System.out.println("clazz ---> " + clazz);
	}

	public T getById(Long id){
		T t = hibernateTemplate.get(clazz, id);
		return t;
	}

	@Override
	public T loadById(Long id) {
		return hibernateTemplate.load(clazz, id);
	}

	@Override
	public List<T> findAll() {
		return hibernateTemplate.find("FROM " + clazz.getSimpleName());
	}

	@Override
	public void save(T t) {
		hibernateTemplate.save(t);
	}
	
	@Override
	public void update(T t) {
		hibernateTemplate.update(t);
	}

	@Override
	public void delete(T t) {
		hibernateTemplate.delete(t);
	}
	
	@Override
	public void merge(T t) {
		hibernateTemplate.merge(t);
	}
}
