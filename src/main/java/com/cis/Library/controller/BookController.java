package com.cis.Library.controller;

import com.cis.Library.model.Book;
import com.cis.Library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public Book getBook(Long bookId){
        return bookService.getBook(bookId);
    }

    // create a book
    @PostMapping
    public Book createBook(@RequestBody Book book){
        return bookService.createBook(book);
    }

    @PutMapping
    public Book updateBook(@RequestBody Book book){
        // Set the memberId for the member object to be updated
        return bookService.updateBook(book);
    }

    @DeleteMapping
    public void deleteBook(Long bookId){
        bookService.deleteBook(bookId);
    }
}