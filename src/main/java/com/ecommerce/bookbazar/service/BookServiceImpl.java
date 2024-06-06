package com.ecommerce.bookbazar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ecommerce.bookbazar.model.Book;
import com.ecommerce.bookbazar.repository.BookDataRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class BookServiceImpl implements BookService {

    BookDataRepository bookDataRepository;

    public BookServiceImpl(BookDataRepository bookDataRepository) {
        this.bookDataRepository = bookDataRepository;
    }


    @Override
    public List<Book> getAllBookDetails() {
        return bookDataRepository.findAll();
    }

    @Override
    public Optional<Book> getBookById(Long bookId) {
        return bookDataRepository.findById(bookId);
    }

    @Override
    public void createBook(Book book) {
      bookDataRepository.save(book);
    }

    @Override
    public void updateBook(Long id, Book book) {
        Book updatedBook = bookDataRepository.findById(id).get();

        if(!book.getAuthor().equals(updatedBook.getAuthor())) 
            updatedBook.setAuthor(book.getAuthor());

        if(!book.getBook_Condition().equals(updatedBook.getBook_Condition())) 
            updatedBook.setBook_Condition(book.getBook_Condition());

        if(!book.getIsbn().equals(updatedBook.getIsbn())) 
            updatedBook.setIsbn(book.getIsbn());
        
        if(!book.getStock().equals(updatedBook.getStock()))
            updatedBook.setStock(book.getStock());

        if(!book.getTitle().equals(updatedBook.getTitle()))
            updatedBook.setTitle(book.getTitle());

        if(!book.getDescription().equals(updatedBook.getDescription()))
            updatedBook.setDescription(book.getDescription());
    }

    @Override
    public void deleteBook(Long bookId) {
        bookDataRepository.delete(bookDataRepository.findById(bookId).get());
    }
    
}
