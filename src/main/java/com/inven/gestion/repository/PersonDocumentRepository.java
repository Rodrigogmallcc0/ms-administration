package com.inven.gestion.repository;

import com.inven.gestion.entity.PersonDocument;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDocumentRepository extends JpaRepository<PersonDocument, Integer> {
}
