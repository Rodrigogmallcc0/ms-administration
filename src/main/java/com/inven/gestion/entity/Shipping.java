package com.inven.gestion.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Shipping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer shippingId;

    @ManyToOne
    @JoinColumn(name = "orderId", nullable = false)
    private Order order;

    @Column(nullable = false)
    private String shippingMethod;

    private String shippingProvider;
    private String trackingNumber;
    private Double shippingCost;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus deliveryStatus;

    private Date deliveryDate;

    @Column(nullable = false)
    private String shippingAddress;

    public enum DeliveryStatus {
        PENDING, IN_TRANSIT, DELIVERED
    }
}