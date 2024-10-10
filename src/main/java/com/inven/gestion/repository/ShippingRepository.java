package com.inven.gestion.repository;

import com.inven.gestion.entity.Shipping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShippingRepository extends JpaRepository<Shipping, Integer> {
}
