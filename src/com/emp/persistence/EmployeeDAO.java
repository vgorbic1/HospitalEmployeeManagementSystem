package com.emp.persistence;

import com.emp.domain.Employee;

public class EmployeeDAO {

	DatabaseConnectionManager connectionManager;
	
	public void saveEmployee(Employee employee) {
		DatabaseConnectionManager connectionManager = new DatabaseConnectionManager();
		//connectionManager.connect();
		//connectionManager.getConnectionObject().prepareStatement("INSERT INTO ...");
		System.out.println("Saving " + employee);
		//connectionManager.disconnect();		
	}
	
	public void deleteEmployee(Employee emp) {
		System.out.println("Deleting employee ...");
	}
}
