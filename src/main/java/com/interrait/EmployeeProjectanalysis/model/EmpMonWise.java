package com.interrait.EmployeeProjectanalysis.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "monthwise-project-table")
public class EmpMonWise {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long projId;
	@ManyToMany(mappedBy = "projetName",cascade = CascadeType.ALL) 
	private List<EmpProjWise> assignedEmp;
	@Column
	private String month;
	@Column
	private String projectName;
	@Column
	private int actualHours;
	
	public List<EmpProjWise> getAssignedEmp() {
		return assignedEmp;
	}
	public void setAssignedEmp(List<EmpProjWise> assignedEmp) {
		this.assignedEmp = assignedEmp;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public int getActualHours() {
		return actualHours;
	}
	public void setActualHours(int actualHours) {
		this.actualHours = actualHours;
	}
	@Override
	public String toString() {
		return "EmpProjWise [projId=" + projId + ", assignedEmp=" + assignedEmp + ", month=" + month + ", projectName="
				+ projectName + ", actualHours=" + actualHours + "]";
	}
	public EmpMonWise( List<EmpProjWise> assignedEmp, String month, String projectName, int actualHours) {
		super();
		
		this.assignedEmp = assignedEmp;
		this.month = month;
		this.projectName = projectName;
		this.actualHours = actualHours;
	}
	public EmpMonWise() {
		super();
	}
	
	
}