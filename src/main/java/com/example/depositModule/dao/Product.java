package com.example.depositModule.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Entity
@NoArgsConstructor
@Table(name = "product")
@Data
@ToString
@AllArgsConstructor
@Component
public class Product{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="product_name")
    private String productName;
    @Column(name="product_desc")
    private String productDesc;
    @Column(name="email")
    private String email;
}
