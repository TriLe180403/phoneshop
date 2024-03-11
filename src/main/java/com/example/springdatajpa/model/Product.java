package com.example.springdatajpa.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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

    public Product(int id, int id_promotion, String productName, String photo, double price, int quantity, int promotionPrice, String description) {
        this.id = id;
        this.id_promotion = id_promotion;
        ProductName = productName;
        Photo = photo;
        Price = price;
        Quantity = quantity;
        PromotionPrice = promotionPrice;
        Description = description;
    }
}
