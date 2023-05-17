package com.interrait.EmployeeProjectanalysis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.interrait.EmployeeProjectanalysis.model.EmpMonWise;
import com.interrait.EmployeeProjectanalysis.repository.projectRepository;
import com.interrait.EmployeeProjectanalysis.service.ProjectService;

@RestController
@RequestMapping("/entryPoint")
public class controller {

	@Autowired
	private ProjectService projService;
	
	@PostMapping("/addProject")
	public EmpMonWise insertData(@RequestBody EmpMonWise emp) {
		return projService.insertData(emp);
	}
}
