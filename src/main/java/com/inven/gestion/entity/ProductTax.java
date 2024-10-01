package com.inven.gestion.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ProductTax {
    @Id
    @ManyToOne
    @JoinColumn(name = "productId", nullable = false)
    private Product product;

    @Id
    @ManyToOne
    @JoinColumn(name = "taxId", nullable = false)
    private Tax tax;
}