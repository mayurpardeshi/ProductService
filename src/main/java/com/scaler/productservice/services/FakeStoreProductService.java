package com.scaler.productservice.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("fakeStoreProductService")
public class FakeStoreProductService implements ProductSerivce {
    private RestTemplate restTemplate;

    FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    // This method will fetch products from the Fake Store API
    // and return them as a list of Product objects
     @Override
     public List<Product> getAllProducts() {
         String url = "https://fakestoreapi.com/products";
         ResponseEntity<Product[]> response = restTemplate.getForEntity(url, Product[].class);

         Product[] products = response.getBody();
         return Arrays.asList(products);
     }
}
