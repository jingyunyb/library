package com.myproject.library.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.myproject.library.domain.Book;
import com.myproject.library.service.BookService;


@Service
public class BookServiceImpl extends BasicServiceImpl  implements BookService {

	
	@Override
	public Book getById(Long id) {
		return bookDao.getById(id);
	}
	@Override
	public Book loadById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void save(Book book) {
		// TODO Auto-generated method stub
		bookDao.save(book);
		
	}
	
	@Override
	public void update(Book book) {
		bookDao.update(book);
		
	}
	
	@Override
	public void merge(Book book) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void delete(Long id) {
	    Book book = bookDao.loadById(id);
		bookDao.delete(book);
	}
	
	@Override
	public List<Book> findAll() {
		return bookDao.findAll();
	}
	
	
}
