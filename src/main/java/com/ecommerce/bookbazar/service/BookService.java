package com.ecommerce.bookbazar.service;

import java.util.List;
import java.util.Optional;

import com.ecommerce.bookbazar.model.Book;

public interface BookService {
    List<Book> getAllBookDetails();
    Optional<Book> getBookById(Long bookId);
    void createBook(Book book);
    void updateBook(Long id, Book book);
    void deleteBook(Long id);
}
