package com.myproject.library.domain;

import java.util.Set;

public class Book {
    
    /**
     * 图书在库
     */
    public static final  Short STATUS_IN    = 0;
    /**
     * 图书借出
     */
    public final static Short STATUS_OUT    = 1;
    
	private Long id;
	private String name;
	private String description;
	private String author;
	private Long borrowerId;
	private Short status;
	
	private Set<BorrowedRecord> borrowedRecordSet;
	
	private Set<User> borrowUserRecord;
	
	public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public Long getBorrowerId(){
        return borrowerId;
    }
    public void setBorrowerId(Long borrowerId){
        this.borrowerId = borrowerId;
    }
    public Short getStatus() {
		return status;
	}
	public void setStatus(Short status) {
		this.status = status;
	}
	
	public String getStatusLabel() {
		String statusLabel = "" ;
		switch (status) {
		case 0:
			statusLabel = "在库";
			break;
		case 1:
			statusLabel = "借出";
			break;
		default:
			break;
		}
		return statusLabel;
	}

	public Set<User> getBorrowUserRecord() {
		return borrowUserRecord;
	}
	public void setBorrowUserRecord(Set<User> borrowUserRecord) {
		this.borrowUserRecord = borrowUserRecord;
	}
	
	public Set<BorrowedRecord> getBorrowedRecordSet(){
        return borrowedRecordSet;
    }
    public void setBorrowedRecordSet(Set<BorrowedRecord> borrowedRecordSet){
        this.borrowedRecordSet = borrowedRecordSet;
    }
    
    @Override
	public String toString() {
		return "{id:"+id
				+ ",name:"+name
				+ ",author:"+author
				+ ",borrowedId:"+borrowerId
				+ ",status:"+status
				+ "}";
	}
}
