package com.example.nimap.service;

import com.example.nimap.entity.Product;
import org.springframework.data.domain.Page;
public interface ProductService {
    Page<Product> getAllProducts(int page, int size);
    Product createProduct(Product product);
    Product getProductById(Long id);
    Product updateProduct(Long id, Product product);
    void deleteProduct(Long id);
}
