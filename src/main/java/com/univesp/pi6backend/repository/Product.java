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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.TableGenerator;

import java.math.BigDecimal;


@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

    @TableGenerator(name = "Product_Gen", table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", pkColumnValue = "Product_Gen", initialValue = 4, allocationSize = 100)
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "Product_Gen")
    private Long id;

    @NonNull
    private String product;
    
    @Column
    private String productPic;

    @NonNull
    @Column
    private BigDecimal price;

    @Column
    private int quantity;

    @NonNull
    @JoinColumn
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Usuario usuario;

}

