package com.ecommerce.bookbazar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.bookbazar.model.Book;
import com.ecommerce.bookbazar.service.BookService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("book")
public class BookController {
    
    @Autowired
    BookService bookService;

    @GetMapping("/fetch-book-details")
    public List<Book> getAllBookDetails() {
        return bookService.getAllBookDetails();
    }

    @GetMapping("/fetch-book-details/{id}")
    public Optional<Book> getBookDetails(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    @PostMapping("/create-book")
    public void  createBook(@RequestBody Book book) {
        bookService.createBook(book);
    }
    
    @PutMapping("/update-book/{id}")
    public void updateBook(@PathVariable Long id, @RequestBody Book book) {
        bookService.updateBook(id, book);
    }
    
    @DeleteMapping("/delete-book/{id}")
    public void removeBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }
}
