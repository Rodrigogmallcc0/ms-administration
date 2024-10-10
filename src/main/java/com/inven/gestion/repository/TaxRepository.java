package com.inven.gestion.repository;

import com.inven.gestion.entity.Tax;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxRepository extends JpaRepository<Tax, Integer> {
}
