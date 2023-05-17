package com.interrait.EmployeeProjectanalysis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.interrait.EmployeeProjectanalysis.model.EmpProjWise;

public interface MonthwiseRepository extends JpaRepository<EmpProjWise, Long> {

}
