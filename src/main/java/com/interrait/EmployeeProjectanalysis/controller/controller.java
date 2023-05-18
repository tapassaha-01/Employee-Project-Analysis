package com.interrait.EmployeeProjectanalysis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.interrait.EmployeeProjectanalysis.model.EmpMonWise;
import com.interrait.EmployeeProjectanalysis.model.ProjectNames;
import com.interrait.EmployeeProjectanalysis.repository.projectRepository;
import com.interrait.EmployeeProjectanalysis.service.ProjectService;

@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("/entryPoint")
public class controller {

	@Autowired
	private ProjectService projService;
	
	@PostMapping("/addProject")
	public List<EmpMonWise> insertData(@RequestBody List<EmpMonWise> emp) {
		return projService.insertData(emp);
	}
	
	@PostMapping("/addExcel")
	public List<ProjectNames> insertExcel (@RequestParam("file") MultipartFile file){
		
		return projService.insertExcel(file);
	}
}
