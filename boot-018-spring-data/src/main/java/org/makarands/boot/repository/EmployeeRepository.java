package org.makarands.boot.repository;

import java.util.List;

import org.makarands.boot.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> 
{
	public Employee findByEid(Integer eid);
	public List<Employee> findByFname(String fname);
	public List<Employee> findByLname(String lname);
	public Employee findByEmail(String email);
	public List<Employee> findByMgr(Integer mgr);
	
	public List<Employee> findByFnameAndLname(String fname, String lname);
	public List<Employee> findByFnameOrLname(String fname, String lname);
	public List<Employee> findByFnameOrLnameAllIgnoreCase(String fname, String lname);
	public List<Employee> findByFnameOrderBySalaryDesc(String fname);
	public List<Employee> findByMgrIsNull();
		
	//public List<Employee> findByFnameOrLnameIsLike(String fname); --> not working
	
	//public List<Employee> findTop10BySalary(); --> not working
	//public List<Employee> findFirst10BySalary(); --> not working
}
