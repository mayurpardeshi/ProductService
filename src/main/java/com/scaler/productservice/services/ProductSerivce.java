package com.scaler.productservice.services;

public interface ProductSerivce {
    // This method will fetch products from the Fake Store API
    // and return them as a list of Product objects
    List<Product> getAllProducts();
}
