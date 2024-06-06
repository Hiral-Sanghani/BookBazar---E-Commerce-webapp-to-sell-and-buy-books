package com.ecommerce.bookbazar.model;

import com.ecommerce.bookbazar.model.Enum.BookCondition;
import com.ecommerce.bookbazar.model.Enum.StockAvailability;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "book")
public class Book {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @PrimaryKeyJoinColumn
    private Long bookId;

    private String title;
    private String author;
    private String isbn;
    private String description;
    private BookCondition book_Condition;
    private StockAvailability stock; 

}
