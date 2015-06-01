package com.ccs.ems.dao;

import java.util.List;

import com.ccs.ems.model.Employee;

public interface EmployeeDAO {

	public Employee getEmployeeByName(String empName);
	
	public Employee getEmployeeByID(Long empID);
	
	public void renameEmployee(String oldName, String newName);
	
	public void deleteEmployeeByID(long ID);
	
	public void deleteEmployeeByName(String empName);
	
	public void createEmployee(Employee emp);
	
	public List<Employee> getEmployeesByDeptName(String deptName);
	
	public List<Employee> getAll();
}
