package com.example.demo.Model;

public class Product {
    private Long id;
    private String name;
    private String date;
    private int price;

    public Product(){}

    public Product(Long id, String name, String date, int price) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
