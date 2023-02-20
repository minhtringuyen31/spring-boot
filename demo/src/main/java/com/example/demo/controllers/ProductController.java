//package com.example.demo.controllers;
//
//import com.example.demo.models.ProductModel;
//import com.example.demo.repositories.ProductRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping(path = "/product")
//public class ProductController {
//    //DI Dependency Injection
//    @Autowired
//    private ProductRepository repository;
//    @GetMapping("/getAll")
//    List<ProductModel> getAllProduct(){
//        return repository.findAll();
//    }
//
//}
