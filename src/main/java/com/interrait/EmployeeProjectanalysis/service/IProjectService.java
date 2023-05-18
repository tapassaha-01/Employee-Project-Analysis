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
		List<EmpMonWise> result = new ArrayList<EmpMonWise>();
//		for(EmpMonWise j:emp) 
//		{
//		List<EmpProjWise> empProjWise = j.getAssignedEmp();
//		for(EmpProjWise i: empProjWise) 
//		{
//			i.setProjetName(emp);
//			monthRepo.save(i);
//			System.out.println(i);
//			
//		}
////		monthRepo.saveAll(empProjWise);
////		j.setAssignedEmp(empProjWise);
//		result.add(projRepo.save(j));
//		}
//		return result;
		for (EmpMonWise j : emp) {
	        List<EmpProjWise> empProjWiseList = j.getAssignedEmp();
	        System.out.println(empProjWiseList);
	       
	        for (EmpProjWise i : empProjWiseList) {
	            i.setProjetName(emp);
//	            System.out.println(i);
//	            monthRepo.save(i);
	        }
	        monthRepo.saveAll(empProjWiseList);
	        result.add(projRepo.save(j));
//	        j.setAssignedEmp(empProjWiseList);
	         // Save EmpMonWise entity first
//	        monthRepo.saveAll(empProjWiseList);
	        
	       
	    }
		System.out.println(result);
	    return result;
	}
	
}
