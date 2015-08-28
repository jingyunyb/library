package com.myproject.library.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.myproject.library.domain.Book;
import com.myproject.library.domain.BorrowedRecord;
import com.myproject.library.service.BorrowedRecordService;


@Service
public class BorrowedRecordServiceImpl extends BasicServiceImpl implements BorrowedRecordService {

    @ Override
    public BorrowedRecord getById(Long id){
        // TODO Auto-generated method stub
        return null;
    }

    @ Override
    public BorrowedRecord loadById(Integer id){
        // TODO Auto-generated method stub
        return null;
    }

    @ Override
    public void save(BorrowedRecord borrowedRecord){
        Book book = borrowedRecord.getBook();
        book.setStatus(Book.STATUS_OUT);
        bookDao.save(book);

        borrowedRecordDao.save(borrowedRecord);
        
        
//        borrowedRecordDao.merge(borrowedRecord);
//        Long bookId = borrowedRecord.getBook().getId();
//        Book book = bookDao.getById(bookId);
//        book.setStatus(Book.STATUS_OUT);
        
//        bookDao.update(borrowedRecord.getBook());
    }

    @ Override
    public void update(BorrowedRecord t){
        // TODO Auto-generated method stub
        
    }

    @ Override
    public void merge(BorrowedRecord t){
        // TODO Auto-generated method stub
        
    }

    @ Override
    public void delete(Long id){
        // TODO Auto-generated method stub
        
    }

    @ Override
    public List<BorrowedRecord> findAll(){
        return borrowedRecordDao.findAll();
    }

	
	

}
