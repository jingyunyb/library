package com.myproject.library.service;

import java.util.List;

import com.myproject.library.domain.Book;


public interface BookService {
	public Book getById(Long id);
	
	public Book loadById(Integer id);
	
	public void save(Book book);
	
	public void update(Book book);
	
	public void merge(Book book);
	
	public void delete(Long id);
	
	public List<Book> findAll();
	
}
