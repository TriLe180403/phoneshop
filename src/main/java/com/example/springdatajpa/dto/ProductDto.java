package com.example.springdatajpa.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class ProductDto implements Serializable {
    private String ProductName;
    private String Photo;
    private double price;
    private int Quantity;
    private int PromotionPrice;
    private String Description;

    public ProductDto(String productName, String photo, double price, int quantity, int promotionPrice, String description) {
        ProductName = productName;
        Photo = photo;
        this.price = price;
        Quantity = quantity;
        PromotionPrice = promotionPrice;
        Description = description;
    }


}
