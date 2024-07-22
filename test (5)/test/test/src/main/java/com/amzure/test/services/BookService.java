package com.amzure.test.services;


import com.amzure.test.dto.requst.BookRequest;
import com.amzure.test.dto.response.BookResponse;

import java.time.LocalDate;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface BookService {

   
    public BookResponse save(BookRequest bookRequest) ;

    public List<BookResponse> findAll();

    public BookResponse findById(Long id);
    
    public List<BookResponse> findByTitle(String title);
    
    public List<BookResponse> findByPublishedDateAfter(LocalDate date);
    
    public void deleteBookById( Long id);
    
  
}