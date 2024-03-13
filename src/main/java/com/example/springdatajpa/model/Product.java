package com.example.springdatajpa.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;

@Entity
@Table(name = "product")
@Data
@NoArgsConstructor
public class Product implements Serializable {
    @Id
    @Column(name = "id_sp")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "id_promotion", nullable = false)
    private int id_promotion;

    @Column(name = "Product_name", nullable = false)
    private String ProductName;

    @Column(name = "Photo", nullable = false)
    private String Photo;

    @Column(name = "Price", nullable = false)
    private double Price;

    @Column(name = "Quantity", nullable = false)
    private int Quantity;

    @Column(name = "Promotion_Price", nullable = false)
    private int PromotionPrice;

    @Column(name = "Description", nullable = false)
    private String Description;



    public Product(String productName, double price, String photo, double price1, int quantity, String description) {
    }
}
