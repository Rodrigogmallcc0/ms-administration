package com.inven.gestion.entity;

;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer personId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;

    private String phoneNumber;

    private Date birthDate;

    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<PersonDocument> documents;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<Address> addresses;

    public enum Status {
        ACTIVE, INACTIVE
    }
}
