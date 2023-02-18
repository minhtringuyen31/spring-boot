package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/product")
public class Product {
    @GetMapping("")
    List<Product> getAllProduct(){
        return List.of(
                new Product(13, "Notebook", "2023", 10000),
                new Product(12, "Pen", "2023", 5000)
        );
    }

}
