package com.univesp.pi6backend.repository;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;


@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    private String product;

    @NonNull
    @Column
    private BigDecimal price;

    @NonNull
    @Column
    private int quantity;

    @NonNull
    @ManyToOne(cascade = CascadeType.ALL)
    private User user;

}

