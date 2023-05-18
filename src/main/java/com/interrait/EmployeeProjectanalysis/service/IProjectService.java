package com.interrait.EmployeeProjectanalysis.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.interrait.EmployeeProjectanalysis.model.EmpMonWise;
import com.interrait.EmployeeProjectanalysis.model.EmpProjWise;
import com.interrait.EmployeeProjectanalysis.model.ProjectNames;
import com.interrait.EmployeeProjectanalysis.repository.MonthwiseRepository;
import com.interrait.EmployeeProjectanalysis.repository.ProjectNamesRepo;
import com.interrait.EmployeeProjectanalysis.repository.projectRepository;

@Service
public class IProjectService implements ProjectService{

	@Autowired
	private MonthwiseRepository monthRepo;
	
	@Autowired
	private projectRepository projRepo;
	
	@Autowired
	private ProjectNamesRepo proNameRepo;
	
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
	
	public List<ProjectNames> insertExcel (@RequestParam("file") MultipartFile file){
		try (Workbook workbook = new XSSFWorkbook(file.getInputStream())) {
		    Sheet sheet = workbook.getSheetAt(0);
		    List<ProjectNames> projectNamesList = new ArrayList<ProjectNames>();
		    for (Row row : sheet) {
		      for (Cell cell : row) {
		        
		        CellType cellType = cell.getCellType();
		        if (cellType == CellType.STRING) {
		          String value = cell.getStringCellValue();
		          projectNamesList.add(new ProjectNames(value));
		        } else if (cellType == CellType.NUMERIC) {
		          double value = cell.getNumericCellValue();
		         
		        }
		        
		      }
		    }
		    proNameRepo.saveAll(projectNamesList);
		    return projectNamesList;
		  } catch (Exception e) {}
		return null;
	}
	
}
