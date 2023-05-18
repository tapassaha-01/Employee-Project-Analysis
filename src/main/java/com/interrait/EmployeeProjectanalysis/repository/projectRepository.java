package com.interrait.EmployeeProjectanalysis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.interrait.EmployeeProjectanalysis.model.EmpMonWise;
import com.interrait.EmployeeProjectanalysis.model.EmpProjWise;

public interface projectRepository extends JpaRepository<EmpMonWise, Long> {




}
