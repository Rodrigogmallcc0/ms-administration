package com.inven.gestion.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class PersonDocument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer personDocumentId;

    @ManyToOne
    @JoinColumn(name = "personId", nullable = false)
    private Person person;

    @ManyToOne
    @JoinColumn(name = "documentTypeId", nullable = false)
    private DocumentType documentType;

    @Column(nullable = false)
    private String documentNumber;

    private Date documentIssueDate;
    private Date documentExpirationDate;
}
