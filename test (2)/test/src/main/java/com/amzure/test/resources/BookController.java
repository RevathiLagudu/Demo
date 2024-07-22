package com.amzure.test.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.amzure.test.dto.requst.BookRequest;
import com.amzure.test.entities.Book;
import com.amzure.test.services.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;
   
    // create a book http://localhost:8080/books  POST
    @ResponseStatus(HttpStatus.CREATED) // 201
    @PostMapping
    public Book createBook(@RequestBody BookRequest bookRequest) {
        return bookService.save(bookRequest);
    }
    
    // Get all books  http://localhost:8080/books  GET
    @GetMapping
    public List<Book> findAll() {
        return bookService.findAll();
    }

    // Get book    http://localhost:8080/books/1 GET
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookService.findById(id);
    }
    
    //http://localhost:8080/books/title/C# GET
    @GetMapping("/title/{title}")
    public List<Book> getBookByTitle(@PathVariable String title) {
        return bookService.findByTitle(title);
    }

  
   

}