package com.ecommerce.bookbazar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.bookbazar.model.Book;

public interface BookDataRepository extends JpaRepository<Book,Long>{ }
