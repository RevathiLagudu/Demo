package com.amzure.test.services;


import com.amzure.test.dto.requst.BookRequest;
import com.amzure.test.dto.response.BookResponse;

import java.time.LocalDate;
import java.util.List;

public interface BookService {

   
    public BookResponse save(BookRequest bookRequest) ;

    public List<BookResponse> findAll();

    public BookResponse findById(Long id);
    
    public List<BookResponse> findByTitle(String title);
    
    public List<BookResponse> findByPublishedDateAfter(LocalDate date);
    
    public void deleteBookById( Long id);
    
  
}