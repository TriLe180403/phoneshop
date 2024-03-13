package com.example.springdatajpa.model;


import jakarta.persistence.*;


import java.io.Serializable;

@Entity
@Table(name = "product_detail")

public class ProductDetail implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProductId", nullable = false)
    private int id;
    @Column(name = "product_name", nullable = false)
    private String ProductName;
    @Column(name = "size", nullable = false)
    private String Size;
    @Column(name = "color", nullable = false)
    private String Color;
    @Column(name = "memoris", nullable = false)
    private String Memoris;
    @Column(name = "pin", nullable = false)
    private String Pin;
    @Column(name = "camera", nullable = false)
    private String Camera;

    public ProductDetail(int id, String productName, String size, String color, String memoris, String pin, String camera) {
        this.id = id;
        ProductName = productName;
        Size = size;
        Color = color;
        Memoris = memoris;
        Pin = pin;
        Camera = camera;
    }

    public ProductDetail() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getMemoris() {
        return Memoris;
    }

    public void setMemoris(String memoris) {
        Memoris = memoris;
    }

    public String getPin() {
        return Pin;
    }

    public void setPin(String pin) {
        Pin = pin;
    }

    public String getCamera() {
        return Camera;
    }

    public void setCamera(String camera) {
        Camera = camera;
    }
}
