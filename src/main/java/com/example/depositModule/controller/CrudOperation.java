package com.example.depositModule.controller;

import com.example.depositModule.dao.Product;
import com.example.depositModule.dto.ProductInfo;
import com.example.depositModule.service.ProductService;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operation")
public class CrudOperation {

   private ProductService productService;
   private Product product;

    @Autowired
    public CrudOperation(ProductService productService, Product product) {
        this.productService = productService;
        this.product = product;
    }

    @PostMapping("/save")
    public ResponseEntity<Product> saveOperation(@RequestBody ProductInfo productInfo){
        System.out.printf("In Controller");
        return new ResponseEntity<>( productService.saveProduct(mapping(productInfo)), HttpStatus.OK);
    }

    @PostMapping("/delete")
    public ResponseEntity<String> deleteOperation(@RequestBody ProductInfo productInfo){
        System.out.printf("In Controller");
        productInfo.getAssociatedProduct();
        return new ResponseEntity<>("romba", HttpStatus.OK);
    }
    Product mapping( ProductInfo productInfo){
        this.product.setProductDesc(productInfo.getProductDesc());
        this.product.setId(productInfo.getId());
        this.product.setEmail(productInfo.getEmail());
        this.product.setProductName(productInfo.getProductName());
        return product;
    }
}
