package com.inven.gestion.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;

    @OneToOne
    @JoinColumn(name = "personId", nullable = false)
    private Person person;

    @Column(nullable = false)
    private Date hireDate;

    @Column(nullable = false)
    private String position;

    @Column(nullable = false)
    private Double salary;
}