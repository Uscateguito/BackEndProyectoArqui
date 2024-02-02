package com.capibaras.bottomline.repository;

import com.capibaras.bottomline.models.Payroll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayrollRepository extends JpaRepository <Payroll,Integer> {
}