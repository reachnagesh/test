package com.ccs.ems.dao;

import com.ccs.ems.model.Department;

public interface DepartmentDAO {

	public Department getDepartmentByName(String deptName);
	
	public Department getDepartmentByID(Long deptID);
	
	public void renameDepartment(String oldName, String newName);
	
	public void deleteDepartmentByID(Long deptID);
	
	public void deleteDepartmentByName(String deptName);
	
	public Department createDepartment(Department dept);
	
}
