package com.myproject.library.action;

import javax.annotation.Resource;

import com.myproject.library.dao.UserDao;
import com.myproject.library.domain.BorrowedRecord;
import com.myproject.library.service.BookService;
import com.myproject.library.service.BorrowedRecordService;
import com.myproject.library.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class BaseAction extends ActionSupport {
	
	@Resource
	protected UserService userService;
	@Resource
	protected BookService bookService;
	@Resource
	protected BorrowedRecordService borrowedRecordService;
	
	@Resource
	protected UserDao userDao;
	

}
