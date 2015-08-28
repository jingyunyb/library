package com.myproject.library.domain;

import java.util.Date;

public class BorrowedRecord {
	
    private Long id;
    
//	private Long userId;
	
	private User user;
	
//	private Long bookId;
	
	private Book book;
	
	private Date borrowTime;
	private Date expirationTime;
	private Date returnTime;

	
	public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
//    public Long getUserId(){
//        return userId;
//    }
//    public void setUserId(Long userId){
//        this.userId = userId;
//    }
//    public Long getBookId(){
//        return bookId;
//    }
//    public void setBookId(Long bookId){
//        this.bookId = bookId;
//    }
    public Date getBorrowTime() {
		return borrowTime;
	}
	public void setBorrowTime(Date borrowTime) {
		this.borrowTime = borrowTime;
	}
    public Date getExpirationTime(){
        return expirationTime;
    }
    public void setExpirationTime(Date expirationTime){
        this.expirationTime = expirationTime;
    }
    public Date getReturnTime(){
        return returnTime;
    }
    public void setReturnTime(Date returnTime){
        this.returnTime = returnTime;
    }
    public User getUser(){
        return user;
    }
    public void setUser(User user){
        this.user = user;
    }
    public Book getBook(){
        return book;
    }
    public void setBook(Book book){
        this.book = book;
    }
	
}
