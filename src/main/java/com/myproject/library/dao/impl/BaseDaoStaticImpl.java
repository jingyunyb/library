package com.myproject.library.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.myproject.library.dao.BaseDao;


@SuppressWarnings("unchecked")
//@Service
public class BaseDaoStaticImpl<T> implements BaseDao<T> {
	static protected Configuration cfg;
	static protected SessionFactory sessionFactory;
	
	static{
		cfg = new Configuration().configure();
		sessionFactory = cfg.buildSessionFactory();
	}
	
	private Class<T> clazz;
	
//	@Resource
//	protected HibernateTemplate hibernateTemplate;
	
	public BaseDaoStaticImpl() {
		// 使用反射技术得到T的真实类型
		
		// 获取当前new的对象的泛型的父类类型
		ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass(); 
		// 获取第一个类型参数的真实类型
		this.clazz = (Class<T>) pt.getActualTypeArguments()[0]; 
		
		System.out.println(this.getClass().getName());
		System.out.println(this.getClass().getSimpleName());
		System.out.println("clazz ---> " + clazz);
	}
//	@Transactional
	public T getById(Long id){
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		T t = (T) session.get(clazz, id);session.flush();
		session.delete(session.get(clazz, 25));
		tx.commit();
		return t;
		
//		System.out.println(hibernateTemplate.getSessionFactory().getCurrentSession().hashCode());
		
//		System.out.println(hibernateTemplate.getSessionFactory().getCurrentSession().hashCode());
//		
//		T t = hibernateTemplate.get(clazz, id);
//		return t;
//		
////		Session session = hibernateTemplate.getSessionFactory().getCurrentSession();
////		System.out.println(session.hashCode());
//		System.out.println(hibernateTemplate.getSessionFactory().getCurrentSession().hashCode());
		
	}

	@Override
	
	public T loadById(Long id) {
//		Session session = sessionFactory.getCurrentSession();
//		Transaction tx = session.beginTransaction();
//		T t = (T) session.load(clazz, id);
//		tx.commit();
//		return t;
		
		return null;
	}

	@Override
	public List<T> findAll() {
//		Transaction tx = sessionFactory.getCurrentSession().beginTransaction();
//		List<T> list = sessionFactory.getCurrentSession().createQuery("FROM " + clazz.getSimpleName()).list();
//		tx.commit();
//		return list;
		
		return null;
	}

	@Override
	public void save(T t) {
//		Session session = sessionFactory.getCurrentSession();
//		Transaction tx = session.beginTransaction();
//		session.save(t);
//		tx.commit();
//		session.close();
		
//		System.out.println(hibernateTemplate.getSessionFactory().getCurrentSession().hashCode());
//		hibernateTemplate.save(t);
//		System.out.println(hibernateTemplate.getSessionFactory().getCurrentSession().hashCode());
		
	}
	
	

	@Override
	public void update(T t) {
		
//		hibernateTemplate.update(t);
//		hibernateTemplate.get(clazz, 1);
//		System.out.println("xxx");
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(t);
		
		session.get(clazz, 2);
		
		tx.commit();
		session.close();
	}

	@Override
	public void delete(T t) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
//		T t = (T) session.get(clazz, id);
		session.delete(t);
		tx.commit();
		session.close();
	}
	@Override
	public void merge(T t) {
		Session session1 = sessionFactory.openSession();
		System.out.println(session1.hashCode());
		Transaction tx = session1.beginTransaction();
//		User user1 = (User) session1.get(User.class, id);
//		user1.setName("zhangsan");
		tx.commit();
		session1.close();
		
		Session session2 = sessionFactory.openSession();
		System.out.println(session2.hashCode());
		tx = session2.beginTransaction();
//		User user2 = (User) session2.get(User.class, id);
//		user1.setName("lisi");
//		session2.update(user1);
//		session2.merge(user1);
		tx.commit();
		session2.close();
	}
}
