package org.makarands.boot.services;

import java.util.List;

import org.makarands.boot.model.Employee;
import org.makarands.boot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("empService")
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository repository;

	@Override
	public Employee view(Integer employeeId) {
		return repository.findOne(employeeId);
	}
	
	@Override
	public List<Employee> viewAll() {
		return (List<Employee>) repository.findAll();
	}

	@Override
	public List<Employee> searchByFname(String fname) {
		return repository.findByFname(fname);
	}

	@Override
	public List<Employee> searchByMgr(Integer managerId) {
		return repository.findByMgr(managerId);
	}

	@Override
	public List<Employee> searchByFnameAndLname(String fname, String lname) {
		return repository.findByFnameAndLname(fname, lname);
	}

	@Override
	public List<Employee> searchByFnameOrLname(String fname, String lname) {
		return repository.findByFnameOrLname(fname, lname);
	}

	@Override
	public List<Employee> searchTop10BySalary() {
		return null;
	}

	@Override
	public List<Employee> searchByFnameOrLnameAllIgnoreCase(String fname, String lname) {
		return repository.findByFnameOrLnameAllIgnoreCase(fname, lname);
	}

	@Override
	public List<Employee> searchByFnameOrderBySalaryDesc(String fname) {
		return repository.findByFnameOrderBySalaryDesc(fname);
	}

	@Override
	public List<Employee> searchByMgrIsNull() {
		return repository.findByMgrIsNull();
	}

}
