package com.interrait.EmployeeProjectanalysis.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interrait.EmployeeProjectanalysis.model.EmpMonWise;
import com.interrait.EmployeeProjectanalysis.model.EmpProjWise;
import com.interrait.EmployeeProjectanalysis.repository.MonthwiseRepository;
import com.interrait.EmployeeProjectanalysis.repository.projectRepository;
@Service
public class IProjectService implements ProjectService{

	@Autowired
	private MonthwiseRepository monthRepo;
	
	@Autowired
	private projectRepository projRepo;
	
	@Override
	public List<EmpMonWise> insertData(List<EmpMonWise> emp) {
		
		
		//first create a EmpProjWise obj from emp 
		// then set all the obj to the emp and save both to the sql database with their respective jparepositoryies

		for (EmpMonWise j : emp) {
	        List<EmpProjWise> empProjWiseList = j.getAssignedEmp();
	        projRepo.save(j);
	        for (EmpProjWise i : empProjWiseList) {
//	        	System.out.println(i.getClass());
	            i.setProjetName(emp);
	            monthRepo.save(i);
	        }
	    }

	    return null;
	}
	
}
