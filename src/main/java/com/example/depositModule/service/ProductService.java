package com.example.depositModule.service;

import com.example.depositModule.dao.Product;
import com.example.depositModule.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

}
