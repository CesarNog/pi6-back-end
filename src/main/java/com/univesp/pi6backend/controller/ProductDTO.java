package com.univesp.pi6backend.controller;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductDTO {

    @JsonProperty
    Long id;

    @JsonProperty
    String product;

    @JsonProperty
    BigDecimal price;

    @JsonProperty
    Integer quantity;

    @JsonProperty
    String seller;

    @JsonProperty
    String sellerPhone;

    @JsonProperty   
    String productPic;
}
