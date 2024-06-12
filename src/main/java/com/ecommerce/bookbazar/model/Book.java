package com.ecommerce.bookbazar.model;

import com.ecommerce.bookbazar.model.Enum.BookCondition;
import com.ecommerce.bookbazar.model.Enum.StockAvailability;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "book")
public class Book {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @PrimaryKeyJoinColumn
    private Long bookId;

    private String title;
    private String author;
    private String isbn;
    private String description;

    @Enumerated(EnumType.STRING)
    private BookCondition book_Condition;

    @Enumerated(EnumType.STRING)
    private StockAvailability stock; 

    
}
