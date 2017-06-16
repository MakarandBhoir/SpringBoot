package org.makarands.boot.services;

import java.util.List;

import org.makarands.boot.model.Employee;

public interface EmployeeService 
{
	public Employee view(Integer employeeId);
	public List<Employee> viewAll();
	public List<Employee> searchByFname(String fname);
	public List<Employee> searchByMgr(Integer managerId);
	
	public List<Employee> searchByFnameAndLname(String fname, String lname);
	public List<Employee> searchByFnameOrLname(String fname, String lname);
	public List<Employee> searchByFnameOrLnameAllIgnoreCase(String fname, String lname);
	public List<Employee> searchByFnameOrderBySalaryDesc(String fname);
	public List<Employee> searchByMgrIsNull();
	
	public List<Employee> searchTop10BySalary();
}
