package com.amzure.test.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import com.amzure.test.dto.requst.BookRequest;
import com.amzure.test.entities.Book;
import com.amzure.test.repositories.BookRepository;

//@Service
public class BookServiceUS implements BookService {
	@Autowired
    private BookRepository bookRepository;

    
    public Book save(BookRequest bookRequest) {
    	Book book=new Book();
    	//book.setPrice(bookRequest.getPrice());
    	BeanUtils.copyProperties(bookRequest, book);
        return bookRepository.save(book);
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Book findById(Long id) {
        return bookRepository.findById(id).get();
    }
    
    public List<Book> findByTitle(String title) {
        return bookRepository.findByTitle(title);
    }


}
