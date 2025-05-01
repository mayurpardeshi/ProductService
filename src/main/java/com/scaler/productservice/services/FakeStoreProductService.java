package com.scaler.productservice.services;

import com.scaler.productservice.exceptions.InvalidProductIdException;
import com.scaler.productservice.models.Product;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service("fakeStoreProductService")
public class FakeStoreProductService implements ProductService {
    private RestTemplate restTemplate = null;
    @Override
    public Product getProductById(Long id) throws InvalidProductIdException {
        restTemplate = new RestTemplate();
        String url = "https://fakestoreapi.com/products/" + id;
        ResponseEntity<Product> response = restTemplate.getForEntity(url, Product.class);
        if (response.getStatusCode() == HttpStatus.OK) {
            return response.getBody();
        } else {
            throw new InvalidProductIdException(id, "Product not found");
        }
//        return null;
    }

    @Override
    public Page<Product> getAllProducts(int pageNumber, int pageSize, String sortDir) {
        return null;
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        return null;
    }

    @Override
    public Product replaceProduct(Long id, Product product) {
        return null;
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public void deleteProduct() {

    }
}
