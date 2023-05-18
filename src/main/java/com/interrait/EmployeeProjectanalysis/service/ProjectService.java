package com.interrait.EmployeeProjectanalysis.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.interrait.EmployeeProjectanalysis.model.EmpMonWise;
import com.interrait.EmployeeProjectanalysis.model.ProjectNames;


public interface ProjectService {
	public List<EmpMonWise> insertData(List<EmpMonWise> emp);
	public List<ProjectNames> insertExcel ( MultipartFile file);
}
