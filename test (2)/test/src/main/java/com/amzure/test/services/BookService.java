package com.amzure.test.services;


import com.amzure.test.dto.requst.BookRequest;
import com.amzure.test.entities.Book;

import java.util.List;

public interface BookService {

   
    public Book save(BookRequest bookRequest) ;

    public List<Book> findAll();

    public Book findById(Long id);
    
    public List<Book> findByTitle(String title);
  
}