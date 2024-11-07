package com.prachi.ecom_front1_backend.controller;

import com.prachi.ecom_front1_backend.model.Product;
import com.prachi.ecom_front1_backend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getProduct(){
        return productService.getAllProduct();
    }



}
