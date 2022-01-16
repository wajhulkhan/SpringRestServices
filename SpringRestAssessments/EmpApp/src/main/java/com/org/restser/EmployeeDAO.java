package com.org.restser;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {
	
	private static Employees list = new Employees();
	
	static {
		list.getEmployeeList().add(new Employee(1,"a","b","gmial"));
		list.getEmployeeList().add(new Employee(2,"aa","bb","gmial2"));
	}
	
	public Employees getAllEmployees() {
		return list;
	}
	
	public void addEmployee(Employee employee) {
		list.getEmployeeList().add(employee);
	}
	
	
}
