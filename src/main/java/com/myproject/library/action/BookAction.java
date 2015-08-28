package com.myproject.library.action;

import java.util.Date;
import java.util.List;

import com.myproject.library.domain.Book;
import com.myproject.library.domain.BorrowedRecord;
import com.myproject.library.domain.User;

@SuppressWarnings("serial")
public class BookAction extends BaseAction {
	
    private Long id;
    private Book book;
	private List<Book> bookList;
	private List<BorrowedRecord> borrowedRecordList;
	

	/**
	 * 
	 * 添加图书页面
	 * @author yangbo
	 * @date 2015年8月21日 下午2:52:10
	 * @return
	 */
	public String addBook(){
		return SUCCESS;
	}

	/**
	 * 
	 * 添加图书
	 * @author yangbo
	 * @date 2015年8月21日 下午3:01:53
	 * @return
	 */
	public String addBookPro(){
	    book.setStatus(Book.STATUS_IN);
	    bookService.save(book);
	    return SUCCESS;
	}
	
	/**
	 * 修改用户页面
	 * @return
	 */
	public String updateBook(){
	    book = bookService.getById(id);
	    
		return SUCCESS;
	}
	
	
	public String updateBookPro(){
		
	    
	    book.setStatus(Book.STATUS_IN);
	    bookService.update(book);
	    
		return SUCCESS;
	}
	
	/**
	 * 用户列表页面
	 * @return
	 */
	public String listBook(){
		bookList = bookService.findAll();
		return SUCCESS;
	}
	
	/**
	 * 
	 * 删除图书
	 * @author yangbo
	 * @date 2015年8月21日 下午3:30:06
	 * @return
	 */
	public String deleteBookPro(){
//	    Book book = bookService.getById(id);
//	    System.out.println(book);
		bookService.delete(id);
		return SUCCESS;
	}
	
	/**
	 * 
	 * 借阅图书
	 * @author yangbo
	 * @date 2015年8月24日 上午11:23:41
	 * @return
	 */
	public String borrowBookPro(){
	    BorrowedRecord borrowedRecord = new BorrowedRecord();
	    Book book = bookService.getById(id);
	    borrowedRecord.setBook(book);
	    User user = userService.getById(3L);
	    borrowedRecord.setUser(user);
	    Date now = new Date();
	    borrowedRecord.setBorrowTime(now);
	    long diff = 60L*24L*60L*60L*1000L;
	    borrowedRecord.setExpirationTime(new Date(now.getTime() + diff));
	    borrowedRecordService.save(borrowedRecord);
	    return SUCCESS;
	}
	
	public String listBorrowedRecord(){
	    borrowedRecordList = borrowedRecordService.findAll();
	    return SUCCESS;
	}
	
	public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Book getBook(){
        return book;
    }

    public void setBook(Book book){
        this.book = book;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<BorrowedRecord> getBorrowedRecordList(){
        return borrowedRecordList;
    }

    public void setBorrowedRecordList(List<BorrowedRecord> borrowedRecordList){
        this.borrowedRecordList = borrowedRecordList;
    }
    
    
}
