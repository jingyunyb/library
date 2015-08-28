package com.myproject.library.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.myproject.library.domain.Book;
import com.myproject.library.domain.User;

public class UserAction extends BaseAction {
	
    private Long id;
    private User user;
	private List<User> userList;
	private List<Book> bookList;
	
	public String addUser(){
		return SUCCESS;
	}
	
	public String addUserPro(){
		userService.save(user);
		return SUCCESS;
	}
	
	/**
	 * 修改用户页面
	 * @return
	 */
	public String updateUser(){
	
	    user = userService.getById(id);
		return SUCCESS;
	}
	
	public String updateUserPro(){
	    userService.save(user);
	    return SUCCESS;
	}
	
	/**
	 * 用户列表页面
	 * @return
	 */
	public String listUser(){
		
		userList = userDao.findAll();
		return SUCCESS;
	}
	
	public String deleteUserPro(){
		userService.delete(id);
		return SUCCESS;
	}
	
	/**
	 * 
	 * 我借阅的图书
	 * @author yangbo
	 * @date 2015年8月24日 上午10:50:18
	 * @return
	 */
	public String myBorrowedBooks(){
	    
	    user = userService.getById(3L);
	    
	    Set<Book> bookSet = user.getBorrowBookRecord();
	    
	    bookList = new ArrayList<Book>(bookSet);
	    
	    return SUCCESS;
	}
	
	
	
	
	
	public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public User getUser(){
        return user;
    }

    public void setUser(User user){
        this.user = user;
    }

    public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

    public List<Book> getBookList(){
        return bookList;
    }

    public void setBookList(List<Book> bookList){
        this.bookList = bookList;
    }
	
	
}
