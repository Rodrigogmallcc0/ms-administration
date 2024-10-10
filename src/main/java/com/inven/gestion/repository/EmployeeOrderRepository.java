package com.inven.gestion.repository;

import com.inven.gestion.entity.EmployeeOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeOrderRepository extends JpaRepository<EmployeeOrder, Integer> {
}