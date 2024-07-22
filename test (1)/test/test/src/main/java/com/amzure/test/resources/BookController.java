package com.amzure.test.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.amzure.test.entities.Book;
import com.amzure.test.services.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

   
    // create a book
    @ResponseStatus(HttpStatus.CREATED) // 201
    @PostMapping
    public Book create(@RequestBody Book book) {
        return bookService.save(book);
    }
    
    // Get all books
    @GetMapping
    public List<Book> findAll() {
        return bookService.findAll();
    }

    // Get book
    @GetMapping("/{id}")
    public Book findById(@PathVariable Long id) {
        return bookService.findById(id);
    }

  
   

}