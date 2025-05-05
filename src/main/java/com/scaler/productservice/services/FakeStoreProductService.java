package com.scaler.productservice.services;

import com.scaler.productservice.dtos.FakeStoreProductDto;
import com.scaler.productservice.models.Product;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service("fakeStoreProductService")
public class FakeStoreProductService implements ProductService {
    private RestTemplate restTemplate;
    @Override
    public Product getProductById(Long id) {
        String url = "https://fakestoreapi.com/products/" + id;
        FakeStoreProductDto productDto = restTemplate.getForObject(url, FakeStoreProductDto.class);
        if (productDto == null) {
//            throw new InvalidProductIdException("Product not found with id: " + id);
            return null;
        }
       return null;
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
