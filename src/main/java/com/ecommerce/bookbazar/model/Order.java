package com.ecommerce.bookbazar.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.ecommerce.bookbazar.model.Enum.OrderStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "order_details")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @DateTimeFormat
    private LocalDate orderDate;
    
    private Integer amount;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

}
