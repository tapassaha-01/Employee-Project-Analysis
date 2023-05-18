package com.interrait.EmployeeProjectanalysis.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "projectName_table")
public class ProjectNames {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long projId;
	@Column
	private String projName;
	
	public String getProjName() {
		return projName;
	}
	public void setProjName(String projName) {
		this.projName = projName;
	}
	@Override
	public String toString() {
		return "ProjectNames [projId=" + projId + ", projName=" + projName + "]";
	}
	public ProjectNames() {
		super();
	}
	public ProjectNames(String projName) {
		super();
		this.projName = projName;
	}
	
}
