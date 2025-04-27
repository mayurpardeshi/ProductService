package com.scaler.productservice.controllers;

import com.scaler.productservice.exceptions.InvalidProductIdException;
import com.scaler.productservice.models.Product;
import com.scaler.productservice.services.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/products")
public class ProductController {

     @GetMapping("/products")
     public ResponseEntity<Page<Product>> getAllProducts(
             @RequestParam(defaultValue = "0") int pageNumber,
             @RequestParam(defaultValue = "10") int pageSize,
             @RequestParam(defaultValue = "asc") String sortDir) {
         return ResponseEntity.ok(productService.getAllProducts(pageNumber, pageSize, sortDir));
     }

     @PostMapping("/products")
     public Product createProduct(@RequestBody Product product) {
         return productService.createProduct(product);
     }

    private ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
     @GetMapping("/products/{id}")
     public Product getProductById(@PathVariable Long id) throws InvalidProductIdException {
         return productService.getProductById(id);
     }
}
