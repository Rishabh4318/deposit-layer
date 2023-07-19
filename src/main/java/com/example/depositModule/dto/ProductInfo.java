package com.example.depositModule.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.web.service.annotation.GetExchange;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductInfo {
    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String productName;
    @JsonProperty("desc")
    private String productDesc;
    @JsonProperty("email")
    private String email;
    private String associatedProduct;
}
