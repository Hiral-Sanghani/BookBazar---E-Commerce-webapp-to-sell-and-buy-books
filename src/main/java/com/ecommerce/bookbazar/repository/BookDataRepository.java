package com.ecommerce.bookbazar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.bookbazar.model.Book;

@Repository
public interface BookDataRepository extends JpaRepository<Book,Long>{ }
