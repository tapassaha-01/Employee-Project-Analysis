package com.interrait.EmployeeProjectanalysis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interrait.EmployeeProjectanalysis.model.EmpMonWise;
import com.interrait.EmployeeProjectanalysis.repository.MonthwiseRepository;
import com.interrait.EmployeeProjectanalysis.repository.projectRepository;
@Service
public class IProjectService implements ProjectService{

	@Autowired
	private MonthwiseRepository monthRepo;
	
	@Autowired
	private projectRepository projRepo;
	
	@Override
	public EmpMonWise insertData(EmpMonWise emp) {
		
		
		
		
		return emp;
	}
	
}
