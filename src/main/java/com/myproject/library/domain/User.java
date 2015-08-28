package com.myproject.library.domain;

import java.util.Set;

public class User {
    
    /**管理员*/
    public static final  Short TYPE_ADMIN    = 1;
    /**老师*/
    public final static Short STATUS_TEACHER    = 2;
    /**学生*/
    public final static Short STATUS_STUDENT    = 3;
    
	private Long id;
	private String name;
	private String password;
	private String telephone;
	private String address;
	private Short type;
	
	private Role role;
	
	private Set<BorrowedRecord> borrowedRecordSet;
	private Set<Book> borrowBookRecord;
	
	
	public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public Set<Book> getBorrowBookRecord() {
		return borrowBookRecord;
	}
	public String getTelephone(){
        return telephone;
    }
    public void setTelephone(String telephone){
        this.telephone = telephone;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setBorrowBookRecord(Set<Book> borrowBookRecord) {
		this.borrowBookRecord = borrowBookRecord;
	}
	
	public Short getType(){
        return type;
    }
    public void setType(Short type){
        this.type = type;
    }
    
    public Role getRole(){
        return role;
    }
    public void setRole(Role role){
        this.role = role;
    }
    public Set<BorrowedRecord> getBorrowedRecordSet(){
        return borrowedRecordSet;
    }
    public void setBorrowedRecordSet(Set<BorrowedRecord> borrowedRecordSet){
        this.borrowedRecordSet = borrowedRecordSet;
    }
    @Override
	public String toString() {
		return "{id:"+id+",name:"+name+"}";
	}
}
