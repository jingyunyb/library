package com.myproject.library.service.impl;

import javax.annotation.Resource;

import com.myproject.library.dao.BookDao;
import com.myproject.library.dao.BorrowedRecordDao;
import com.myproject.library.dao.MenuDao;
import com.myproject.library.dao.UserDao;



public class BasicServiceImpl{
	@Resource
	protected UserDao userDao;
	@Resource
	protected BookDao bookDao;
	@Resource
	protected BorrowedRecordDao borrowedRecordDao;
	@Resource
	protected MenuDao menuDao;
	
}
