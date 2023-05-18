package com.interrait.EmployeeProjectanalysis.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.interrait.EmployeeProjectanalysis.model.EmpMonWise;


public interface ProjectService {
	public List<EmpMonWise> insertData(List<EmpMonWise> emp);
}
