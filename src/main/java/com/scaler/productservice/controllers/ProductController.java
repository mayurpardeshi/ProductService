package com.scaler.productservice.controllers;

import com.scaler.productservice.services.ProductSerivce;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1/products")
public class ProductController {
    // This class will handle HTTP requests related to products
    // It will use the ProductService to perform operations on products

    // Example method to get all products
    // @GetMapping("/products")
    // public List<Product> getAllProducts() {
    //     return productService.getAllProducts();
    // }

    // Example method to create a new product
    // @PostMapping("/products")
    // public Product createProduct(@RequestBody Product product) {
    //     return productService.createProduct(product);
    // }

    private ProductSerivce productService;
}
