package com.inven.gestion.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class EmployeeOrder {
    @Id
    @ManyToOne
    @JoinColumn(name = "employeeId", nullable = false)
    private Employee employee;

    @Id
    @ManyToOne
    @JoinColumn(name = "orderId", nullable = false)
    private Order order;
}