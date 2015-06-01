package com.ccs.ems.model;

import java.util.Date;

public class Employee {	
	Long empId;
	String empName;
	Date birthDate;
	int ssn;
	Long deptId;
	
	public Employee(Long empId, String empName, Date birthDate, int ssn, Long deptId){
		this.empId=empId;
		this.empName=empName;
		this.birthDate=birthDate;
		this.ssn=ssn;
		this.deptId=deptId;
	}
	
	public void setEmpId(Long empId){
		this.empId = empId;
	}
	
	public Long getEmpId(){
		return this.empId;
	}
	
	public void setEmpName(String empName){
		this.empName = empName;
	}
	
	public String getEmpName(){
		return this.empName;
	}
	
	public void setBirthDate(Date birthDate){
		this.birthDate = birthDate;
	}
	
	public Date getBirthDate(){
		return this.birthDate;
	}
	
	public void setSsn(int ssn){
		this.ssn=ssn;
	}
	
	public int getSsn(){
		return this.ssn;
	}

	public void setDepId(Long id){
		this.deptId = id;
	}
	
	public Long getDepId() {
		return this.deptId;
	}


}
