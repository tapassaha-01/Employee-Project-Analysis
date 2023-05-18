

package com.interrait.EmployeeProjectanalysis.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "project-table") 
public class EmpProjWise{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long empWorkId;
	@Column
	private String empName;
	@ManyToMany
	@JoinTable(
	        name = "Emp_Proj_relation_table",
	        joinColumns = @JoinColumn(name = "empWorkId"),
	        inverseJoinColumns = @JoinColumn(name = "projId")
	    )
	private List<EmpMonWise> projetName;
	@Column
	private int janData;
	@Column
	private int febData;
	@Column
	private int marchData;
	@Column
	private int aprilData;
	@Column
	private int mayData;
	@Column
	private int junData;
	@Column
	private int julyData;
	@Column
	private int augData;
	@Column
	private int sepData;
	@Column
	private int octData;
	@Column
	private int novData;
	@Column
	private int decData;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<EmpMonWise> getProjetName() {
		return projetName;
	}
	public void setProjetName(List<EmpMonWise> projetName) {
		this.projetName = projetName;
	}
	public int getJanData() {
		return janData;
	}
	public void setJanData(int janData) {
		this.janData = janData;
	}
	public int getFebData() {
		return febData;
	}
	public void setFebData(int febData) {
		this.febData = febData;
	}
	public int getMarchData() {
		return marchData;
	}
	public void setMarchData(int marchData) {
		this.marchData = marchData;
	}
	public int getAprilData() {
		return aprilData;
	}
	public void setAprilData(int aprilData) {
		this.aprilData = aprilData;
	}
	public int getMayData() {
		return mayData;
	}
	public void setMayData(int mayData) {
		this.mayData = mayData;
	}
	public int getJunData() {
		return junData;
	}
	public void setJunData(int junData) {
		this.junData = junData;
	}
	public int getJulyData() {
		return julyData;
	}
	public void setJulyData(int julyData) {
		this.julyData = julyData;
	}
	public int getAugData() {
		return augData;
	}
	public void setAugData(int augData) {
		this.augData = augData;
	}
	public int getSepData() {
		return sepData;
	}
	public void setSepData(int sepData) {
		this.sepData = sepData;
	}
	public int getOctData() {
		return octData;
	}
	public void setOctData(int octData) {
		this.octData = octData;
	}
	public int getNovData() {
		return novData;
	}
	public void setNovData(int novData) {
		this.novData = novData;
	}
	public int getDecData() {
		return decData;
	}
	public void setDecData(int decData) {
		this.decData = decData;
	}
	@Override
	public String toString() {
		return "EmpMonWise [EmpName=" + empName + ", projetName=" + projetName + ", janData=" + janData + ", febData="
				+ febData + ", marchData=" + marchData + ", aprilData=" + aprilData + ", mayData=" + mayData
				+ ", junData=" + junData + ", julyData=" + julyData + ", augData=" + augData + ", sepData=" + sepData
				+ ", octData=" + octData + ", novData=" + novData + ", decData=" + decData + "]";
	}
	public EmpProjWise() {
		super();
	}
	public EmpProjWise(String empName, List<EmpMonWise> projetName, int janData, int febData, int marchData, int aprilData,
			int mayData, int junData, int julyData, int augData, int sepData, int octData, int novData, int decData) {
		super();
		this.empName = empName;
		this.projetName = projetName;
		this.janData = janData;
		this.febData = febData;
		this.marchData = marchData;
		this.aprilData = aprilData;
		this.mayData = mayData;
		this.junData = junData;
		this.julyData = julyData;
		this.augData = augData;
		this.sepData = sepData;
		this.octData = octData;
		this.novData = novData;
		this.decData = decData;
	}
	
	
	
}
